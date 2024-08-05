package Tessaract;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.MatExpr;
import org.opencv.core.Core;
import org.opencv.core.CvType;

public class Opencvmatrix {

	public static void main( String[] args )
	   {
	      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
	      MatExpr mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
	      System.out.println( "mat = " + mat.b() );
	   }
}
