package uti;

import javax.swing.JFrame;

public class Task1SierpinskiTestProgram {
	public static void main(String[] args) {
		Task1SierpinskiTriangleFrame frame = new Task1SierpinskiTriangleFrame();
		frame.setSize(400, 400);
		frame.setTitle("TestFigurePanel");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

