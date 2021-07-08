public class Date { //all programs begin with a class and title. title must match
                    // match with name of file. At end of filename create open bracket.
    public static void main(String[] args){ // main argument begins with public static (for our current purposes)
      //then continues with main followed by open parenthesis, String[] args (arguments), closed parenthesis and another open bracket
//begin program by listing all variables to be used. In this case we need the current day, year, date, and month.
        int day = 25;
        int year = 2021;
        //the variable is first identified by what type of variable it is. In this case day and year are integers because they contain
        //numerical values. They are identified by int variableName = value ; the semicolon marks the end of a statement.
        String date = "Friday";
        String month = "June";
        //date and month are both text based information. They will be stored in a String variable. String signifies that it is text based.
        //String variableName = "text must be inside quotations."

          System.out.println("American Format:"); //system is outputting a printline of "American format" This will print and end the line.
          System.out.print(date);
          System.out.print(", ");
          System.out.print(month);
          System.out.print(" ");
          System.out.print(day);
          System.out.print(", "); //all these print statements will print on the same line. Once it encounters a println it will end onto the next line.
          System.out.println(year);
          System.out.println("European Format:");
          System.out.print(date);
          System.out.print(" ");
          System.out.print(day);
          System.out.print(" ");
          System.out.print(month);
          System.out.print(" ");
          System.out.println(year);

          //every open bracket must be accompanied by a closed bracket.
    }
} //notice indentation of these brackets delineating order within java.
