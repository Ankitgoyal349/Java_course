import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array :- ");
            int size = sc.nextInt();
            

            int[] numbers = new int[size];

            for(int i=0; i<size; i++){
                System.out.print("Enter element "+ (i+1)+ " :-");
                numbers[i] = sc.nextInt();
            }

            for(int i=0 ; i<size; i++){
                System.out.print(numbers[i] + " ");
            }System.out.println();

            boolean isAscending = true;
            

            for(int i=0 ; i<size-1; i++){
                if(numbers[i]>numbers[i+1]){
                    isAscending = false;
                }
        }

        if(isAscending) {
            System.out.println("The Array is sorted in ascending order ");
        }else{
            System.out.println("The Array is not sorted in Ascending order ");
        }
            
        }

        
    }
}
