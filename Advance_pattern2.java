import java.util.Scanner;

public class Advance_pattern2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("ENter number of rows :- ");
            int a =sc.nextInt();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=a-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(i*2)-1; j++){
                    System.out.print("*");
                }System.out.println();
            }

            for(int i=a; i>=1; i--){
                for(int j=1; j<=a-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(i*2)-1; j++){
                    System.out.print("*");
                }System.out.println();
            }
        }
    }
}
