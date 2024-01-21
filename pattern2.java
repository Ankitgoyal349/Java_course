import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
        System.out.print("Enter number of rows :- ");
        int a = s.nextInt();
        for(int i=1; i<=a; i++){
            for (int j=1; j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }

    }
}
}