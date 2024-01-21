import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows :- ");
            int a = sc.nextInt();
            for (int i=1; i<=a;i++){
                for (int j=1; j<=i;j++){
                    System.out.print("*");
                }for(int j=1;j<=(a-i)*2; j++){
                    System.out.print(" ");
                }for (int j=1; j<=i; j++){
                    System.out.print("*");
                } System.out.println();
            }
        }
    }
}
