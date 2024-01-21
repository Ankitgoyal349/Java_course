import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows :- ");
            int a =sc.nextInt();
            System.out.print("Enter number of columns :- ");
            int b =sc.nextInt();
            for(int i=1; i<=a; i++){
                for (int j=1; j<=b;j++){
                    System.out.print("* ");
                }System.out.println();
            }
        }
    }
}
