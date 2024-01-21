import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of array :- ");
            int size_of_array = sc.nextInt();
            int [] marks_of_students = new int[size_of_array];

            for(int i=0; i<size_of_array; i++){
                System.out.print("Enter element " + i +" :- " );
                marks_of_students[i] = sc.nextInt();  
                
            }
            for(int i=0; i<size_of_array; i++){
                System.out.println(marks_of_students[i]); 
            }
        }
    }
}
