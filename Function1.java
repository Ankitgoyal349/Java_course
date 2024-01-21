import java.util.Scanner;

public class Function1 {

    public static int multiplication_of_2_no(int a, int b){
        int x=a*b;
        return x;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter 1st number :- ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number :- ");
            int b =sc.nextInt();
            int multiply = multiplication_of_2_no(a, b);
            System.out.println("Multiplication of given 2 numbers is :- "+multiply);
        }
    }
}
