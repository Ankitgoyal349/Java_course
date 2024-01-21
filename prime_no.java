import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number that u want to check abouut prime number ");
            int n = sc.nextInt();
            boolean  flag = true;
            if (n==2){
                System.out.println(n+  " is a prime number");
            }else{
            for (int i=2; i<n; i=i+1){
                
                if (n%i ==0){
                    flag = true;
                    break;
                }
            }

            if (!flag){
                System.out.println(n + " is a prime number");
            } else{
                System.out.println(n + " is not a prime number");
            }
        }

    }
    }
}