import java.io.*;
import java.util.*;
// exercises 3: Objective is to make an x^n
public class Loops{
  public static double power(double x, int n){ //create a method that will return x^n
    if (n==0){ //if n ==0 then any x to the power of 0 will equal 1
        return 1; //this line states that if the n==0 is true, it should return 1
    } //end of this if statement
    int i = 0; //initilizing int i to 0 so that it understands how to label the loops.
    double result = 1.0; //initializing double num; reminder that doubles carry a decimal
        while ( i < n) { //while loop must be used as while the condition in parenthesis is true
        result = result * x;//you will ask the program to run the following actions.
        // in this case you are asking the num which is a double, be multiplied by x
        i = i+ 1;// label the loops i (0)+ 1. So each loop will add plus one until it
        //reaches the while parameter.
        // System.out.println("num "+ result); //added println statements to see computations
        // System.out.println("i " + i);//added to see how many loops are passing
    } //and on line 13, you ask to grab i and add 1 to it.
    return result;//end the loop and return the result
  }
//exercise 4 asks us to create a factorial function
  public static int factorial (int n) { //create a new method named factorial with variable int n
    if (n == 0) { //basic if statement that if n=0 return 1
      return 1;//provides accurate mathematical computation.
    }
    int numFact = n; //establishes the int var. numFact to be n and initializes the var.
    while (n > 1) { //while loop because you want it to continue running until
                    //this statement is no longer true
      numFact = numFact * (n-1) ; //variable numFact takes the value of numFact from
                                  //previous loops and multiplies it by n-1.
      n = n-1;                    // this is the line that states to reduce n by one.
                                  //continuing this loop will eventually make the condition
                                  //for the while loop to be false and return numFact
      // System.out.println("n " + n); //print statements to see mathematical computations
      // System.out.println("Factorial Result "+ numFact);
    }
    return numFact;
}

//exercise 5.1
public static double myExp(double x, int n){
  int i=0;
  double estimate = 0.0; //the estimate is a double due to precision
//the line below states: for int i which starts at 1, as i less than
//or equal to n, i will increase incrementally.
  while (i < 1){
   //line below: the estimate will be added to the power and divided
   //by the factorial.
   estimate = (estimate + power(x, i)) / factorial(i);
   i = i + 1;
   // System.out.println("Power: "+ power(x,i));//println statements to see computations
   // System.out.println("Factorial: "+ factorial(i));
   // System.out.println("Estimate: " + estimate);
 }
 return estimate; //return the result by the end of the loop.
}
//exercise 5.2 replace facorial and power with some sort of local variable
public static double myExp5_2 (double x, int accuracy) {
   int i = 1;
   double fact =0.0;
   double num =1.0;
   double den = 1.0;

   while (i <= accuracy) {
      fact= fact + (num/den);
      num = num * x;
      den = den * i;
      i = i+1;
   }
   return fact;
   //observation when myExp has (3,2) result is 6.5; myExp5_2 is 4.0
}
//exercise 5.3
public static void check (double x, int n, int p) {
//    'x' is the power to which 'e' will be raised
//    'n' is the accuracy level for myexp
//    'p' is the no. of rows in the output (the table)
//    'i' is a loop variable
      System.out.println (x + "\t" + (Math.exp(x)) + "\t" + (myExp5_2(x,n)) );

}
//main
  public static void main (String[] args ){
  Scanner input = new Scanner(System.in);
  // Exercise 3
  System.out.println(" This is to find X to the power of n");
  System.out.println(" Enter the value for X");
  int xValue = input.nextInt();
  System.out.println("Enter the value for n");
  int nValue = input.nextInt();
  System.out.println ("The result of your input is: " + power(xValue, nValue));
  // Exercise 4
  System.out.println("This is to find the factorial of any integer");
  System.out.println("Enter the number you want to calculate the factorial for.");
  int factN = input.nextInt();
  System.out.println ("The result of this factorial is:" + factorial (factN));
  // Exercise 5
    System.out.println(myExp(3,2));
    System.out.println(myExp5_2(3,2));
    check (1.0,3,2);
    }
  }
//added scanner function for more practice integrating scanners.
//adding new comment for testing purposes.
