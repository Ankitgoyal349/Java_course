import java.util.Scanner;

public class Functionn3 {

    public static void Table_of_given_no(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("ENter any number :- ");
            int n = sc.nextInt();
            Table_of_given_no(n);
        }
    }
}
