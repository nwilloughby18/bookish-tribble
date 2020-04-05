import java.util.Scanner;
public class Lab10_nwilloughby
{ 
/*Name: Nailah Willoughby
Class: Louis, Henry
Lab 10: nestled loops
*/
    public static void main(String args[]) {
        nesty_MeNumbers();
	powers(); 
        q3();
    }
     public static void nesty_MeNumbers() {
	for (int i=0; i<5; i++)
	{
          for(int j=4-i; j>=0; j--){
            System.out.print(" ");
          }
          for(int k=0; k<=i; k++){
            System.out.print(k+ " ");
          }
          System.out.println();
        }
    }
	public static void powers() {
	Scanner num = new Scanner(System.in);
	System.out.print("Please enter a number: ");
	int n = num.nextInt();
	System.out.println("n"+"\tn^2"+"\tn^3"+"\tn^4");
		for(int i=0; i<=n; i++){
		    System.out.print("");
		    System.out.println(i + "\t" + i*i + "\t" + i*i*i + "\t" +i*i*i*i);
	 	 }
	}
public static void q3() {
	System.out.println("Loop1:");
        int val1 = 0;
            for(int i = 1; i<=10; i++){
                val1 = val1 + i;
                System.out.println(val1);
            }
	System.out.println("Loop2:");
	int val2 = 0;
	    for (int i = 1; val2<=100; i++) {
		val2 = val2 + i;
		   if (val2 <100){
		      System.out.println(val2);
		   }
		   if(val2>=100){
		        System.out.println("over 100");
		   }
        }
  }
}
