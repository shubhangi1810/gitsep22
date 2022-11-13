
public class Q1 {
  public static void main(String[] args) {

    int size = 5;
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < size - i - 2; j++) {
        System.out.print(" ");
      }
     
      for (int k = 0; k < 2 * i + 2 ; k++) {
        if ( i == size - 1) {
          System.out.print("*");
        } else {
          if (k == 0 || k == 2 * i) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}


/*

   *
  * *
 *   *
*     *
**********

*/