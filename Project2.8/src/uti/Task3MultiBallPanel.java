package uti;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.PriorityQueue;

import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;

class Task3MultiBallPanel extends JPanel {
	private int delay = 10;
	//private ArrayList<Task3MultiBall> list = new ArrayList<Task3MultiBall>();
	private PriorityQueue<Task3MultiBall> queue = new PriorityQueue<Task3MultiBall>(5, new BallComparator());
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public Task3MultiBallPanel() {
		timer.start();
	}

	public void add() {
		queue.add(new Task3MultiBall());
	}

	public void subtract() {
		if (queue.size() > 0)
			queue.poll(); // Remove the last ball
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < queue.size(); i++) {
			Task3MultiBall ball = (Task3MultiBall) queue.get(i); // Get a ball
			g.setColor(ball.color); // Set ball color
			// Check boundaries
			if (ball.x < 0 || ball.x > getWidth())
				ball.dx = -ball.dx;
			if (ball.y < 0 || ball.y > getHeight())
				ball.dy = -ball.dy;
			// Adjust ball position
			ball.x += ball.dx;
			ball.y += ball.dy;
			g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
		}
	}

	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
}