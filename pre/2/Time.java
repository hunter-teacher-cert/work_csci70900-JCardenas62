public class Time { //all programs begin with a public class FileName and open bracket
  public static void main(String[] args){ //followed by either a method or a main.
    int hour = 21; //followed by your variables. In this case they are integers
    int minute = 13; //these variables delineate the hour, minute, and seconds in which assignment
    int second = 35; // began.
    int currentSeconds ;
    int midnightSeconds = 24 *60 * 60; // how many total seconds in one day.
    //double integers utilize floating numbers which allow for more precise numbers.
    double conversion = (hour * 60 * 60) + (minute * 60) + second; //you use floating numbers when you need precision like time.
    double percentage; //when done in this manner, variable must then be initialized later on.
    int hourf = 22; //these variables are integers to when the assignment was completed.
    int minf = 07;
    int secf = 25;
    double totalSecondsFinal = (hourf * 60 * 60) + (minf * 60) + secf ; //total number of seconds when assignment finished.
    System.out.print("The number of seconds since midnight is: ");
    System.out.println((hour * 60 * 60) + (minute * 60) + second); //to print out results place operations in parenthesis and utilize operators
  // on integer variables. Utilize plus sign within each to sum between variables.
    System.out.print("The number of seconds remaining in the day is: ");
    currentSeconds = (hour * 60 * 60) + (minute * 60) + second;// fixed a logic error. solved below equation by making an extra variables
    System.out.println((midnightSeconds) - currentSeconds);//and prevent miscalculations via logic errors.
    System.out.print("The perecentage of day that has passed is: ");
    percentage = (totalSecondsFinal / midnightSeconds * 100);//place equation before use within program. All values must be double variables
    System.out.printf("%.2f", (percentage) ); //utilized "%.2f" to format number. What this says is # to 2 decimal places format. Change
    System.out.println("%"); //print to printf to notify format change as well.
    System.out.print("The number of seconds elapsed since the beginning of this exercise: ");
    System.out.println(totalSecondsFinal - currentSeconds); //utilize two variables in a method to print.
  }// close method; in this case main.
}//close program
