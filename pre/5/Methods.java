import java.io.*;
import java.util.*; //this imports all utilities such as random and scanner.
//Exercise 2: methods isDivisible
public class Methods{ //all programs begin with a public (or private) class
                      //  FileName identical to the FileName.java
//first example asks for a boolean return if int n and int m are divisible.
//to do this I utilized public. static. type of method .
//name of method (the int involved with their variable name
  public static boolean isDivisible(int n, int m) {
      if (n % m == 0) { //this is establishing the method is an if statement.
        //this if statement states if there is a remainder when n and m are divided
        //the open bracket explains what will happen.
          return true; //if there is no remainder between n and m it will return true.
      } else {
          return false;// if a remainder exists it will return false.
      }
  }

//Exercise 3: methods isTriangle
// another method which involves boolean (true or false statements)
//this is named boolean (method type). file name . (variable type and name)
public static boolean isTriangle (int a, int b, int c){
    if (a >= b + c) { //>= is greater than or equals to
          return false;
      } else if (b >= a + c) { //for practice sake, this was written out as
        return false; //multiple else if statements.
    } else if (c >= a + b) {
          return false;
      } else {
        return true;
        //method could have been written as:
        // public static boolean isTriangle (int a, int b, int c){
        // if (a>= b + c || b >= a + c || c >= a + b){
        // return false;
          //} else {
            // return true;
              //}
      //} the difference is the or operator.
      }
  }
//Exercise 8: Ackermann
// this is a brief example of recursion or calling upon itself
//this creates in a sense a type of a loop that continues until the function can
//no longer be validated.
  public static int ack (int m, int n) {
    if (m==0) {
      return n+1;
    } else if (m>0 && n==0){
        return (ack (m-1, 1));
    } else if (m > 0 && n > 0) {
        return (ack (m - 1, ack (m, n - 1)));
    } else {
      return (0);
    }
// in this ackermann recursion, the cycle is repeated until m==0.
//in the case of (1,1) the method will identify that m>0 which goes and test the
//second else if. It notices that n is not 0. Method moves to line 50 and sees that
//both parameters are true and runs the return statement.
//if done correctly m-1=0. and the second part staes (1,n-1)= 1,0.
//The 1 is held inside memory until the Ackermann is resolved.
// since m now equals 0, it will test the first statement and return n+1
//n+1 = 1+1 =2
// 2 + 1 (that was in memory) == 3.
  }
  //Main programing to print lines
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first integer for isDivisible");
      int firstInteger = input.nextInt();
      System.out.println("Enter the second integer for isDivisible");
      int secondInteger = input.nextInt();
      System.out.println("Are these numbers divisible? " + isDivisible(firstInteger, secondInteger));
      System.out.println("Enter the first integer for isTriangle");
      int firstTriangle = input.nextInt();
      System.out.println("Enter the second integer for isTriangle");
      int secondTriangle = input.nextInt();
      System.out.println("Enter the third integer for isTriangle");
      int thirdTriangle = input.nextInt();
      System.out.println("Can these 3 triangle lengths make a triangle? " + isTriangle(firstTriangle,secondTriangle,thirdTriangle));
      System.out.println ("Enter m for the Ackermann function");
      int mInput = input.nextInt();
      System.out.println(" Enter n for the Ackermann function");
      int nInput = input.nextInt();
      System.out.println("The result for the Ackermann function is: " + ack(mInput,nInput));
//I added a scanner input because I wanted to practice the scanner more.
    }
}
