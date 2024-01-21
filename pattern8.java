import java.util.Scanner;

public class pattern8 {
     public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("ENter number of rows :- ");
            int a =sc.nextInt();
            for(int i=1; i<=a; i++){
                for(int j=0; j<=a-i; j++){
                    System.out.print(j+1+" ");
                }System.out.println();
            }
        }
    }
}


