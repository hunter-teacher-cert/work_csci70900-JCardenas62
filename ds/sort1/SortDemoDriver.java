import java.io.*;
import java.util.*;

public class SortDemoDriver {
    public static void main(String[] args) {

	SortDemo sd = new SortDemo(); //call to 1st constructor
	System.out.println(sd);

	SortDemo sd2 = new SortDemo(20); //call to 2nd constructor
	System.out.println(sd2);

	/* part 2 test lines */
	/*
	  int i;
	i = sd.findSmallestIndex(); //TODO add parameter
	System.out.println("sd["+"] = "+sd.get(i)+" : " + sd);

	i = sd2.findSmallestIndex();
	System.out.println("sd2["+"] = "+sd2.get(i)+" : " + sd2);
	*/

	/* part 3 test lines */
	/*
	  System.out.println(sd);
	  sd.sort();
	  System.out.println(sd);
	*/
    }
}
