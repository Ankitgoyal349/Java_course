import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows :- ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns :-");
            int col = sc.nextInt();

            int[][] matrix = new int[rows][col];
            for(int i=0; i<rows; i++){
                for(int j=0; j<col; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<rows; i++){
                for(int j=0; j<col; j++){
                    System.out.print(matrix[i][j] + " ");
                }System.out.println();
            }

            System.out.print("Enter the number whose index u want :- ");
            int x = sc.nextInt();

            for(int i=0; i<rows; i++){
                for(int j=0; j<col; j++){
                    if(matrix[i][j] == x){
                        System.out.println("Given number is at index :- "+ i+ ","+ j);
                    }
                }
            }
        }
    }
}
