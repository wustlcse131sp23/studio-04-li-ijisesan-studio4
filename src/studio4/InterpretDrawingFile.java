package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean fill = in.nextBoolean();

		StdDraw.setPenColor(red, green, blue);
		if (shape.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double width = in.nextDouble();
			double height = in.nextDouble();
			if (fill) {
				StdDraw.filledRectangle(x, y, width, height);
			} else {
				StdDraw.rectangle(x, y, width, height);
			}
		}
		if (shape.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			//double a = in.nextDouble();
			//double b = in.nextDouble();
			double width = in.nextDouble();
			double height = in.nextDouble();
			if (fill) {
				StdDraw.filledEllipse(x, y,  width, height);
			} else {
				StdDraw.ellipse(x, y, width, height);
			}
		}
	}
}
