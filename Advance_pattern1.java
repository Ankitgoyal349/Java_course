import java.util.Scanner;

public class Advance_pattern1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows :- ");
            int a = sc.nextInt();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=(a-i)*2; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }System.out.println();
            }

            for(int i=1; i<=a; i++){
                for(int j=1; j<=(a-i)+1; j++){
                    System.out.print("*");
                }for(int j=1; j<=(i*2)-2; j++){
                    System.out.print(" ");
                }for(int j=1; j<=(a-i)+1; j++){
                    System.out.print("*");
                }System.out.println();
            }
        }
    }
}

/*  OUTPUT :-  
Enter number of rows :- 4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *   

*/