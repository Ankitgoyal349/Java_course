import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of array :- ");
            int size = sc.nextInt();
            String name [] = new String[size];

            for(int i=0; i<size; i++){
                System.out.print("Enter "+ (i+1) +" name :- ");
                name[i] = sc.next();
            }

            for(int i=0; i<size; i++){
                System.out.println("name " + (i+1) + " is :- "+name[i]);
            }
        }
    }
}
