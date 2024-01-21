import java.util.Scanner;

public class Advance_pattern3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows :- ");
            int row =sc.nextInt(); 

            for(int i=1; i<=row; i++){
                for(int j=1; j<=row-i;j++){
                    System.out.print(" ");
                }for(int j=1; j<=i; j++){
                    // System.out.print(j+i+" ");
                    System.out.print(j+" ");
                    // System.out.print(i+" ");
                }System.out.println();
        }
    }
}
}

/*  
OUTPUT :- 
Enter number of rows :- 6
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
1 2 3 4 5 6 

 */