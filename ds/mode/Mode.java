import java.io.*;
import java.util.*;



public class Mode{
    private ArrayList<Integer> inputData;
    private Random r;
    public Mode(){
	r = new Random();
	inputData = new ArrayList<Integer>();

	for (int i=0; i < 20; i++){
	    inputData.add(r.nextInt(20));
	}
    }
    public Mode(int size){
	r = new Random();
	inputData = new ArrayList<Integer>();

	for (int i=0; i < size; i++){
	    inputData.add(r.nextInt(50));
	}
    }

    /**
     * Warmup 1
     Find and return the smallest value in  InputData.
    */

    public int findSmallestValue(){
      int smallest = inputData.get(0);
      for(int i = 1 ; i<inputData.size(); i++){
        if (inputData.get(i) < smallest){
          smallest = inputData.get(i);
        }
      }
	  return smallest;
    }

    /**
     * Warmup 2
     Returns the frequency of value in inputData, that is, how often value appears
    */
    public int frequency(int value){
      int count = 0;
      for (int i=0; i <inputData.size(); i++){
        if(inputData.get(i) == value){
          count++;
        }
      }


      return count;
    }//end frequency()

    /**
     *
     This function should calculate and return the mode of inputData.
     The mode is the value that appears most frequently so if inputData contained
     5,3,8,2,5,9,12,5,12,6,5, the mode would return 5 since 5 appears four times.
     If there are multiple modes such as in the case with this data set: 5,5,2,9,9,6 you should return
     either of them (the 5 or the 9).
     Note: you will probably use the frequency function you wrote in
     this solution but not findSmallestValue. the findSmallestValue
     function will help you find a strategy for approaching finding the mode.
    */
    public int calcMode(){
      ArrayList<Integer> frequencyResults = new ArrayList<Integer>();
      //iterate thru arraylist
      for(int i=0; i< inputData.size(); i++){
          //for each item in list, run frequency on that item
          //save frequency in results arraylist
          frequencyResults.add(frequency(inputData.get(i)));
      }

      System.out.println("Debug frequencyResults: " + frequencyResults);
      //find largest frequency in results
      //return the mode
      //have to resolve index vs value in results ArrayList
      int largest = findLargestValue(frequencyResults);
      int mode = inputData.get(frequencyResults.indexOf(largest));

	  return mode;
  }//end calcMode

    public int findLargestValue(ArrayList<Integer> a){
      int largest = a.get(0);
      for(int i=0; i < a.size(); i++){
        if(a.get(i) > largest){
          largest = a.get(i);
        }
      }
      return largest;
    } //end of findLargestValue method

    public String toString(){
	    return ""+inputData;
    }
}
