import java.util.Scanner;

public class loop_questions {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number either zero or one ");
            int n = sc.nextInt();
            if (n==1){
                System.out.print("ENter the student marks = ");
                int marks =sc.nextInt();
                if (marks>=90){
                    System.out.println("This is good");
                } else if (marks<=89 && marks>=60){
                    System.out.println("This is also good");
                } else{
                    System.out.println("This is good as well");
                }
            } else if (n==0){
                System.out.println("stop");
            } else{
                System.out.println("Your input is invalid");
            }
        }
    }
}
