package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 *
 * @author
 *
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
	public static void blackAndWhite(DigitalPicture picture) {
		// Iterate through all pixels in picture
		for (Pixel pixel : picture.getPixels()) {
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
	public static void negative(DigitalPicture picture) {
		// Iterate through all pixesl in picture
		for (Pixel pixel : picture.getPixels()) {
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
	public static void makeSunset(DigitalPicture picture, double redIntensity, double greenBlueReduction) {
		// Iterate through all pixesl in picture
		for (Pixel pixel : picture.getPixels()) {
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

		throw new UnsupportedOperationException("Not implemented");
	public static void mirrorHorizontal(DigitalPicture picture) {
	}

		throw new UnsupportedOperationException("Not implemented");
	public static void mirrorVertical(DigitalPicture picture) {
	}

	public static void blur(DigitalPicture picture) {
		throw new UnsupportedOperationException("Not implemented");
	}

//	/**
//	 * Alters the picture so that is is black and white by setting each pixels color value to be the average
//	 * of the pixels red, green, and blue channel.
//	 * @param picture,  the image to be altered
//	 */
//	public static void ????(??? ???) {
//
//
//
//	}

}
