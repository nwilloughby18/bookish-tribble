public class Ascii_Tree {
    public static void main(String args[]) {
        for(int u=1; u<=10; u++){
            for(int t=1; t<=10-u; t++){
                System.out.print(" ");
            }
            for(int s=1;s<=u-1; s++){
                System.out.print("\\");
            }
            for(int r=1;r<=1; r++){
              System.out.print("|");
            }
            for(int q=1; q<=u-1; q++){
              System.out.print("/");
            }
          System.out.println();
        }
    }
}
