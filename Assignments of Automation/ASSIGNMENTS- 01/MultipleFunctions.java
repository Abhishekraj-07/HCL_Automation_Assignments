/*3	Write a program to perform addition, subtraction, multiplication, transpose, to check square matrix, 
to check matrix is diagonal, and to check matrix is identity. */

import java.util.Scanner;

public class MultipleFunctions {

    public static void main(String[] args) {
        // Scanner is used to take input from the user.
        Scanner sc = new Scanner(System.in);

        // r1 and c1 store rows and columns of first matrix.
        int r1, c1;

        // r2 and c2 store rows and columns of second matrix.
        int r2, c2;

        int choice;

        System.out.print("Enter rows of first matrix: ");
        r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows of second matrix: ");
        r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // do-while loop displays the menu again and again until the user exits.
        do {
            System.out.println("\n----- Matrix Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose of first matrix");
            System.out.println("5. Check square matrix");
            System.out.println("6. Check diagonal matrix");
            System.out.println("7. Check identity matrix");
            System.out.println("8. Display matrices");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Addition is possible only when both matrices have same rows and columns.
                    if (r1 == r2 && c1 == c2) {
                        System.out.println("Addition of matrices:");
                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c1; j++) {
                                System.out.print((a[i][j] + b[i][j]) + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Addition is not possible.");
                    }
                    break;

                case 2:
                    // Subtraction is possible only when both matrices have same rows and columns.
                    if (r1 == r2 && c1 == c2) {
                        System.out.println("Subtraction of matrices:");
                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c1; j++) {
                                System.out.print((a[i][j] - b[i][j]) + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Subtraction is not possible.");
                    }
                    break;

                case 3:
                    // Multiplication is possible when columns of first matrix equals rows of second matrix.
                    if (c1 == r2) {
                        System.out.println("Multiplication of matrices:");
                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c2; j++) {
                                int sum = 0;

                                // This loop multiplies row of first matrix with column of second matrix.
                                for (int k = 0; k < c1; k++) {
                                    sum = sum + a[i][k] * b[k][j];
                                }

                                System.out.print(sum + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Multiplication is not possible.");
                    }
                    break;

                case 4:
                    // Transpose means converting rows into columns and columns into rows.
                    System.out.println("Transpose of first matrix:");
                    for (int i = 0; i < c1; i++) {
                        for (int j = 0; j < r1; j++) {
                            System.out.print(a[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    // A square matrix has equal number of rows and columns.
                    if (r1 == c1) {
                        System.out.println("First matrix is a square matrix.");
                    } else {
                        System.out.println("First matrix is not a square matrix.");
                    }
                    break;

                case 6:
                    // A diagonal matrix must be square.
                    // All non-diagonal elements must be 0.
                    if (r1 != c1) {
                        System.out.println("First matrix is not diagonal because it is not square.");
                    } else {
                        int isDiagonal = 1;

                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c1; j++) {
                                if (i != j && a[i][j] != 0) {
                                    isDiagonal = 0;
                                    break;
                                }
                            }
                        }

                        if (isDiagonal == 1) {
                            System.out.println("First matrix is a diagonal matrix.");
                        } else {
                            System.out.println("First matrix is not a diagonal matrix.");
                        }
                    }
                    break;

                case 7:
                    // An identity matrix must be square.
                    // Diagonal elements must be 1 and other elements must be 0.
                    if (r1 != c1) {
                        System.out.println("First matrix is not identity because it is not square.");
                    } else {
                        int isIdentity = 1;

                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c1; j++) {
                                if (i == j && a[i][j] != 1) {
                                    isIdentity = 0;
                                    break;
                                }

                                if (i != j && a[i][j] != 0) {
                                    isIdentity = 0;
                                    break;
                                }
                            }
                        }

                        if (isIdentity == 1) {
                            System.out.println("First matrix is an identity matrix.");
                        } else {
                            System.out.println("First matrix is not an identity matrix.");
                        }
                    }
                    break;

                case 8:
                    System.out.println("First matrix:");
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            System.out.print(a[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Second matrix:");
                    for (int i = 0; i < r2; i++) {
                        for (int j = 0; j < c2; j++) {
                            System.out.print(b[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 9:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);

        sc.close();
    }
}
