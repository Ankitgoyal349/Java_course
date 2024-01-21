import java.util.Scanner;

public class Function2 {

    public static void Factorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        else if(n==0){
            System.out.println("Factorial of given number is :- "+1);
            return;
        }
        int a= 1;
        for(int i=n; i>=1; i--){
            a=a*i;
        }
        System.out.println("Factorial of given number is :- "+ a);
        }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter any number :- ");
            int n =sc.nextInt();
            Factorial(n);
        }
    }
}
