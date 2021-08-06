/*
HOMEWORK:
Take a second to read this code. Run the program and compare it to the horizontal bar graph code
we did in class. Write down some differences and explain why these differences are important.







*/
public class Homework{

  public static void main (String[] args){
    int [] a = {0,9,2,5, 6, 2, 7};
    vertBarGraphify(a);
  }

  public static void vertBarGraphify(int[] a) {
    int bigVal = largestValue(a);
    while(bigVal > 0) {
      System.out.println(graph(a, bigVal));
      bigVal--;
    }
    System.out.println(printIndex(a));
  }

  public static String printIndex(int[] a) {
    String bottomLine = "";
    for(int i = 0; i < a.length; i++) {
      bottomLine += i + " ";
    }
    return bottomLine;
  }

  public static int largestValue(int[] a ){
    int largestValue = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] > largestValue){
        largestValue= a[i];
      }
    }
    return largestValue;
  }

  public static String graph(int[] a, int big ){
    String line = "";
    for(int j = 0; j < a.length; j++) {
      if(a[j] < big) {
        line += " ";
      } else {
        line += "*";
      }
      line += " ";

    }
    return line;
  }

}
