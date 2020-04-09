/* Nailah Willoughby 
4/7/2020
CSC 1301 
Homework 6 : Full_Xmas
*/
import java.util.Scanner;
public class Full_Xmas {
    public static void main(String args[]) {
      Scanner tree = new Scanner(System.in);
      System.out.println("Please enter the desired number of rows: ");
      int n = tree.nextInt();
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n - i; j++)
            System.out.print(" ");
        for(int k = 0; k < (1 * i + 1); k++)
            System.out.print("* ");
            System.out.println();
        }
      }
     }

