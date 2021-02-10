package uti;

import javax.swing.JFrame;

public class Task3SierpinskiTestProgram {
	public static void main(String[] args) {
		Task3SierpinskiTriangleFrame frame = new Task3SierpinskiTriangleFrame();
		frame.setSize(400, 400);
		frame.setTitle("TestFigurePanel");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

