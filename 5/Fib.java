import java.io.*;
import java.util.*;

public class Fib{
  public static void main (String[] args){
    System.out.println("Enter a number to obtain Fibonacci result");
    Scanner input = new Scanner(System.in);
    int input1 = input.nextInt();
  System.out.println("The Fibonacci result is: " + fib(input1));
  }


    public static int fib (int a){
    if (a==0){
      return 0;
    }
    else if (a == 1){
      return 1;
    } else {
      System.out.println(fib(a-1));
      return fib(a-1) + fib(a-2);
  }

  }

}//end class Fib
