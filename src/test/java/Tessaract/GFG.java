package Tessaract;
// import required packages
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

// Class to rotate image
public class GFG {

	// Main driver method
	public static void main(String args[])
	{

		// Load library required for OpenCV functions
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		// Read an image and store in a Matrix object

		// Local directory from where image is picked
		String file = "C:\\Users\\2252549\\eclipse-workspace\\AutomationRevision\\src\\test\\resources\\Tessractimg2.png";
		Mat src = Imgcodecs.imread(file);

		// Create empty Mat object to store output image
		Mat dst = new Mat();

		// Define Rotation Angle
		double angle = 90;

		// Image rotation according to the angle provided
		if (angle == 90 || angle == -270)

			Core.rotate(src, dst, Core.ROTATE_90_CLOCKWISE);
		else if (angle == 180 || angle == -180)

			Core.rotate(src, dst, Core.ROTATE_180);
		else if (angle == 270 || angle == -90)

			Core.rotate(src, dst,
						Core.ROTATE_90_COUNTERCLOCKWISE);
		else {

			// Center of the rotation is given by
			// midpoint of source image :
			// (width/2.0,height/2.0)
			Point rotPoint = new Point(src.cols() / 2.0,
									src.rows() / 2.0);

			// Create Rotation Matrix
			Mat rotMat = Imgproc.getRotationMatrix2D(
				rotPoint, angle, 1);

			// Apply Affine Transformation
			Imgproc.warpAffine(src, dst, rotMat, src.size(),
							Imgproc.WARP_INVERSE_MAP);

			// If counterclockwise rotation is required use
			// following: Imgproc.warpAffine(src, dst,
			// rotMat, src.size());
		}

		// Save rotated image

		// Destination where rotated image is saved
		// on local directory
		Imgcodecs.imwrite("C:\\Users\\2252549\\eclipse-workspace\\AutomationRevision\\src\\test\\resources\\Rotated images\\rotatedimage.png", dst);
		
		// Print message for successful execution of program
		System.out.println("Image Rotated Successfully");
	}
}
