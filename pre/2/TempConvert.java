import java.util.Scanner; //could also type import java.util.*; to import all utilities.

public class TempConvert { //begin program with public class Filename (identical to filename)
  public static void main(String[] args) { //delineate main with String[] and arguments
    double celsius; //list of variables that will be used within program. Must be placed in logical order of use.
    Scanner input = new Scanner(System.in); // scanner in = new Scanner(System.in). The name of this scanner is "in"


    // ask for celsius
    System.out.println("Hello, I am here to help you convert from degrees Celsius to degrees Fahrenheit.");
    System.out.print("Enter the temperature you want to convert in degrees Celsius: ");
    celsius = input.nextDouble(); //this line is now identifying variable celsius as what the scanner "in" records. Whatever integer is recorded
                              //will now save as a double. 
    //conversion and output
    double Conversion = ((celsius * (9.0 / 5.0)) + 32) ; //this variable is being stated here as it makes reference to a variable that was not established.
                                        // this created many errors until proper placement.
    System.out.print("This converts to: ");
    System.out.printf("%.1f", Conversion); //previous example had a variable that served no purpose. removed and simplified.
    System.out.println(" degrees Fahrenheit");

  }
}
