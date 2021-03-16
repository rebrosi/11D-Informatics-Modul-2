package uti;

import java.util.Comparator;

public class BallComparator implements Comparator<Task3MultiBall>{
	public int compare(Task3MultiBall b1, Task3MultiBall b2) { 
        if (b1.radius < b2.radius) 
            return 1; 
        else if (b1.radius > b2.radius) 
            return -1; 
                        return 0; 
        } 
}
