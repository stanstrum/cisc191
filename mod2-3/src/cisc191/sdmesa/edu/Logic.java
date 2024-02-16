package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 * @author Vanessa Tapia {@literal <vtapia001@student.sdccd.edu>}
 */
public class Logic
{
	/**
	 * Alters the picture so that each pixel's blue channel has been zeroed out. All
	 * other channels remain the same
	 *
	 * @param picture the image to be altered
	 */
	public static void zeroBlue(DigitalPicture picture)
	{
		Pixel[][] pixel2D = picture.getPixels2D();

		for (int r = 0; r < pixel2D.length; r++)
		{
			for (int c = 0; c < pixel2D[r].length; c++)
			{
				pixel2D[r][c].setBlue(0);
			}
		}
	}

	/**
	 * Applies a black-and-white filter to the provided picture
	 *
	 * @param picture picture to apply filter to
	 */
	public static void blackAndWhite(DigitalPicture picture)
	{
		// Iterate through all pixels in picture
		for (Pixel pixel : picture.getPixels())
		{
			// Downcast average from double to integer
			int average = (int)pixel.getAverage();

			// Set each channel's values to the average
			pixel.setRed(average);
			pixel.setGreen(average);
			pixel.setBlue(average);
		}
	}

	/**
	 * The highest value a color channel may hold.
	 *
	 * @see {@link Pixel#getRed} - Returns the amount of red from 0 for none to 255 for max
	 */
	private static final int MAX_CHANNEL_VALUE = 255;

	/**
	 * Applies a negative filter to the provided picture
	 *
	 * @param picture picture to apply filter to
	 */
	public static void negative(DigitalPicture picture)
	{
		// Iterate through all pixesl in picture
		for (Pixel pixel : picture.getPixels())
		{
			// Get RGB values
			int red = pixel.getRed();
			int green = pixel.getGreen();
			int blue = pixel.getBlue();

			// Invert each channel's value -- range is from 0 - 255, now it's 255 - 0
			pixel.setRed(MAX_CHANNEL_VALUE - red);
			pixel.setGreen(MAX_CHANNEL_VALUE - green);
			pixel.setBlue(MAX_CHANNEL_VALUE - blue);
		}
	}

	/**
	 * Applies a "sunset" filter to an image by applying color ratios to the RGB channels
	 *
	 * @param picture picture to apply filter to
	 * @param redIntensity intensity multiplier of the red channel
	 * @param greenBlueReduction intensity multiplier of the green and blue channels
	 */
	public static void makeSunset(DigitalPicture picture, double redIntensity, double greenBlueReduction)
	{
		// Iterate through all pixesl in picture
		for (Pixel pixel : picture.getPixels())
		{
			// Get RGB values
			int oldRed = pixel.getRed();
			int oldGreen = pixel.getGreen();
			int oldBlue = pixel.getBlue();

			// Apply intensity ratios
			double newRed = (double)oldRed * redIntensity;
			double newGreen = (double)oldGreen * greenBlueReduction;
			double newBlue = (double)oldBlue * greenBlueReduction;

			// Replace old channel values with newly-computed ones
			pixel.setRed((int)newRed);
			pixel.setGreen((int)newGreen);
			pixel.setBlue((int)newBlue);
		}
	}

	/**
	 * Applies a horizontal mirror image filter to a picture
	 *
	 * @param picture the picture to mirror horizontally
	 */
	public static void mirrorHorizontal(DigitalPicture picture)
	{
		// For images whose width is even, this is the left-middle index
		int lastCol = picture.getWidth() - 1;
		int middleCol = lastCol / 2;

		// For every row ...
		for (int row = 0; row < picture.getHeight(); row++)
		{
			// Up until the middle column -- because we are rotating the image about this column
			for (int col = 0; col <= middleCol; col++)
			{
				// Get the index of the corresponding column on the opposite side
				int latterCol = lastCol - col;

				// Get this pixel and the mirror pixel
				int formerBasicPixel = picture.getBasicPixel(col, row);
				int latterBasicPixel = picture.getBasicPixel(latterCol, row);

				// Swap their values
				picture.setBasicPixel(latterCol, row, formerBasicPixel);
				picture.setBasicPixel(col, row, latterBasicPixel);
			}
		}
	}

	/**
	 * Applies a vertical mirror image filter to a picture
	 *
	 * @param picture the picture to mirror vertically
	 */
	public static void mirrorVertical(DigitalPicture picture)
	{
		int lastRow = picture.getHeight() - 1;

		// For images whose height is even, this is the lower-middle index
		int middleRow = lastRow / 2;

		// For every column ...
		for (int col = 0; col < picture.getWidth(); col++)
		{
			// Up until the middle row -- because we are rotating the image about this row
			for (int row = 0; row <= middleRow; row++)
			{
				// Get the index of the corresponding row on the opposite side
				int latterRow = lastRow - row;

				// Get this pixel and the mirror pixel
				int formerBasicPixel = picture.getBasicPixel(col, row);
				int latterBasicPixel = picture.getBasicPixel(col, latterRow);

				// Swap their values
				picture.setBasicPixel(col, row, latterBasicPixel);
				picture.setBasicPixel(col, latterRow, formerBasicPixel);
			}
		}
	}

	/**
	 * Width of the blur window used for the blur filter
	 */
	private static final int BLUR_WIDTH = 2;

	/**
	 * Height of the blur window used for the blur filter
	 */
	private static final int BLUR_HEIGHT = 2;

	/**
	 * Area of the blur window used for the blur filter.
	 * Used to calculate the average value of each individual pixel in the window
	 */
	private static final int BLUR_AREA = BLUR_WIDTH * BLUR_HEIGHT;

	/**
	 * Applies a blur filter to the provided picture
	 *
	 * @param picture picture to apply filter to
	 */
	public static void blur(DigitalPicture picture)
	{
		// Get the 2D Pixel array, which is in row-column order
		Pixel[][] pixels2D = picture.getPixels2D();

		// Last indices that can have a blur window calculated without going out of bounds
		final int lastFittingColumn = picture.getWidth() - BLUR_WIDTH;
		final int lastFittingRow = picture.getHeight() - BLUR_HEIGHT;

		// For each pixel in the image that can be blurred
		for (int x = 0; x <= lastFittingColumn; x++)
		{
			for (int y = 0; y <= lastFittingRow; y++)
			{
				// Initialize channel counters
				int sumRed = 0;
				int sumGreen = 0;
				int sumBlue = 0;
				int sumAlpha = 0;

				for (int offsetX = 0; offsetX < BLUR_WIDTH; offsetX++)
				{
					for (int offsetY = 0; offsetY < BLUR_HEIGHT; offsetY++)
					{
						// Index of the pixel in the blur window, offset from the target
						final int targetX = x + offsetX;
						final int targetY = y + offsetY;

						Pixel pixel = pixels2D[targetY][targetX];

						sumRed += pixel.getRed();
						sumGreen += pixel.getGreen();
						sumBlue += pixel.getBlue();
						sumAlpha += pixel.getAlpha();
					}
				}

				// Get the target pixel
				Pixel targetPixel = pixels2D[y][x];

				// NOTE: no blur window will include an already-blurred pixel because
				// the blur window has its top-left corner on the target pixel and
				// the pixels are progessively blurred from the top-left of the image

				// Apply the average channel values of the blur window
				targetPixel.setRed(sumRed / BLUR_AREA);
				targetPixel.setGreen(sumGreen / BLUR_AREA);
				targetPixel.setBlue(sumBlue / BLUR_AREA);
				targetPixel.setAlpha(sumAlpha / BLUR_AREA);
			}
		}
	}
}
