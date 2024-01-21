import java.util.Scanner;

public class pattern9 {
             public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("ENter number of rows :- ");
            int a =sc.nextInt();
            int  x = 1;
            for(int i=1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(x+" ");
                    x=x+1;
                }System.out.println();
            }
        }
    }

}
