import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array :- ");
            int size = sc.nextInt();
            int [] numbers = new int[size];
            

            for(int i=0; i<size ; i++){
                System.out.print("Enter element "+ i+ ":- ");
                numbers[i] = sc.nextInt();
            }

            System.out.print("Enter the number whose index you want :- ");
            int x = sc.nextInt();

            for(int i=0; i<size; i++){
                if(numbers[i] == x){
                    System.out.println("Index of given number is at :- "+ i);
                }
            }
}

    }
}