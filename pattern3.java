import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows :- ");
            int a =sc.nextInt();
            for (int i=1; i<=a;i++){
                for (int j=0; j<=a-i; j++){
                    System.out.print("* ");
                }System.out.println();
            }
        }
    }
}
