import java.util.Scanner;
public class TransposeofMatrix {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the 3x3 matrix:");
        for(int i = 0; i < 3; i++) {    
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original matrix is:");
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is:");
        for(int i = 0; i < 3; i++) {    
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
