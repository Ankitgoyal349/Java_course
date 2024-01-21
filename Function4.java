import java.util.Scanner;

public class Function4 {
    public static void even_or_odd(int n){
        if(n%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter any number :- ");
            int x =sc.nextInt();
            even_or_odd(x);
        }
    }
}
