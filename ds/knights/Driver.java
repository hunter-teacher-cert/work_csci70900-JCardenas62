import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	boolean solved;

	// Maze m = new Maze("maze.dat");
	// System.out.println(m);
	// solved = m.solve(1,1);

//claims how big you want the playable board to be
	  knights k = new knights(5);
    //col,row,count
	  solved = k.solve(2,2,1);


    }
}
