package uti;

import java.awt.Color;
import java.util.Random;

class Task3MultiBall {
	Random rand = new Random();
	int upper = 20;
	int lower = 2;
	int x = 0;
	int y = 0; // Current ball position
	int dx = 2; // Increment on ball's x-coordinate
	int dy = 2; // Increment on ball's y-coordinate
	int radius = rand.nextInt(upper - lower) + lower; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
}
