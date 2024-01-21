import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter 1st number = ");
            int  a = sc.nextInt();
            System.out.print("Enter last number = ");
            int b =sc.nextInt();
            System.out.print("Enter 3rd number = ");
            int c = sc.nextInt();

            if (a>b && a>c){
                System.out.println(a + " is greter thann other two");
            } else if (b>c && b>a){
                System.out.println(b + " is greter than other two");
            }else{
                System.out.println(c + " is greter than other two");
            }
                }
            }
}
    