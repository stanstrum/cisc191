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
	public static void blackAndWhite(Picture picture) {
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

	public static void negative(Picture p) {
		throw new UnsupportedOperationException("Not implemented");
	}

	public static void makeSunset(Picture arg0, double arg1, double arg2) {
		throw new UnsupportedOperationException("Not implemented");
	}

	public static void mirrorHorizontal(Picture p) {
		throw new UnsupportedOperationException("Not implemented");
	}

	public static void mirrorVertical(Picture p) {
		throw new UnsupportedOperationException("Not implemented");
	}

	public static void blur(Picture p) {
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
