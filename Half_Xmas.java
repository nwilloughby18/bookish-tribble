import java.util.Scanner;
public class Half_Xmas {
    public static void main(String args[]) {
      Scanner tree = new Scanner(System.in);
      System.out.println("Please enter the desired number of rows: ");
      int n = tree.nextInt();
      for(int i=1; i<=n; i++){
          
        for(int j=1; j<i; j++){
            System.out.print(" ");
         }  
        for(int k=i; k<=n; k++){
            System.out.print("*");
         }
      System.out.println();
      }
    }
}
