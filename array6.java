import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter nummber of rows :- ");
            int rows = sc.nextInt();
            System.out.print("Enter nummber of columns :- ");
            int col = sc.nextInt();

            int[][] matrix = new int[rows][col] ;

            for(int i=0; i<rows; i++){
                for(int j=0; j<col; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<rows;i++){
                    for(int j=0; j<col; j++){
                        System.out.print(matrix[i][j] +" ");
                    } System.out.println();
                }
                System.out.println("Transpose of a given matrix is :- ");
                for(int i=0; i<rows;i++){
                    for(int j=0; j<col; j++){
                        // matrix[i][j]=matrix[j][i];
                        System.out.print(matrix[j][i] +" ");
                    } System.out.println();
                }
        }
    }
}
