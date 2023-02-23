package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize();
		StdDraw.setPenColor(193, 229, 225);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.25);
		StdDraw.setPenColor(132, 14, 141);
		StdDraw.filledCircle(1, 0.75, 0.2);
		StdDraw.setPenColor(203, 127, 214);
		StdDraw.filledEllipse(0.3, 0.3, 0.45, 0.15);
		
		StdDraw.setPenColor(203, 127, 214);
		StdDraw.filledEllipse(1, 0.2, 0.3, 0.25);
		
		StdDraw.setPenColor(59, 111, 145);
		StdDraw.filledEllipse(0.5, 0.25, 0.8, 0.15);
		
		StdDraw.setPenColor(150, 84, 23);
		StdDraw.filledRectangle(0.725, 0.4, 0.03, 0.1);
		
		StdDraw.setPenColor(248, 136, 16);
		double[] x = {0.725, 0.6, 0.85};
		double[] y = {0.6, 0.5, 0.5};
		StdDraw.filledPolygon(x, y);
	

		StdDraw.setPenColor(248, 136, 16);
		double[] x1 = {0.725, 0.6, 0.85};
		double[] y1 = {0.7, 0.6, 0.6};
		StdDraw.filledPolygon(x1, y1);
		
		StdDraw.setPenColor(248, 136, 16);
		double[] x2 = {0.725, 0.6, 0.85};
		double[] y2 = {0.65, 0.55, 0.55};
		StdDraw.filledPolygon(x2, y2);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 1, 0.5, 0.25);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 0, 0.5, 0.25);
	}
}