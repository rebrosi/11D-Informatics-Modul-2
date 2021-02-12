package uti;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Task1SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;
	static int order = 0;
	
	private JButton PlusOrder = new JButton("+");
	private JButton MinusOrder = new JButton("-");
	private Task1SierpinskiTrianglePanel trianglePanel = new Task1SierpinskiTrianglePanel(); // To display the pattern

	public Task1SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(PlusOrder);
		panel.add(MinusOrder);
		PlusOrder.setHorizontalAlignment(SwingConstants.LEFT);
		MinusOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		PlusOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order++;
				trianglePanel.setOrder(order);
			}
		});
		MinusOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order--;
				trianglePanel.setOrder(order);
			}
		});

	}

}

