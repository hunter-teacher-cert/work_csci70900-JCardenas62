public class BarGraphCodeTeacher {

  public static void barGraph(int[] a) {
    for(int i = 0; i < a.length; i++) {
      System.out.println(i + ":  " + bar(a[i]));
      }
  }

  public static String bar(int n){
    String size = "";
    for (int i = 0; i < n;  i++){
      size = size + "=";
    }
    return size;
  }

  public static void main(String[] args){
  int[] a = {6,4,1,7};
  barGraph (a);
  //System.out.println(bar(3));
  }
}
