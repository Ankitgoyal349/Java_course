import java.util.Scanner;


// to find the maximum and minimum element in an array

public class array4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array :- ");
            int size = sc.nextInt();
            int[] numbers = new int[size];
            for(int i=0; i<size; i++){
                System.out.print("Enter "+ (i+1)+ " element :- ");
                numbers[i] = sc.nextInt();
                

            }

            int max =numbers[0];
            int min =numbers[0];
            for(int i=0; i<size; i++){
                if(numbers [i]<min){
                    min = numbers[i];
                }
                if(numbers[i]>max){
                    max = numbers[i];
                }
            }


            System.out.println("Largest number is :- "+ max);
            System.out.println("Smallest number is :- "+ min);
        }
    
    }
}
