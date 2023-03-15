

//p
/*
+Program: print both diagonals of a nxn matrix
@Khaoula_Ikkene

 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        (new Main()).Start();
    }

    public void Start() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int matrix[][] = new int[n][n]; // es aleatoria
        boolean Notdone = false;
        while (!Notdone) {
            System.out.print("Enter number of rows: ");
            n = sc.nextInt();
            System.out.print("Enter number of columns: ");
            m = sc.nextInt();
            if (!IsSquared(n, m)) {
                System.out.println("The matrix is not squared");
                Notdone = false;

            } else {
                System.out.println("the matrix is ");
                matrix = (GenerateMatrix(n));
                ImprMatrix(matrix);
                Notdone = true;


            }
        }

        System.out.println();
            PrintDiagonal(matrix);

        }


    private boolean IsSquared(int n, int m) {
        return n == m;
    }

    private int[][] GenerateMatrix(int n) {
        Random rd = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = rd.nextInt(5);
                int b = rd.nextInt(6);
                matrix[i][j] = a + b;
            }
        }
        return matrix;

    }

    private void ImprMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (j == matrix.length - 1) {
                    System.out.println();
                }

            }
        }
    }

    private char[] PrintSpace(int i) {
        char Space[] = new char[i];
        for (int j = 0; j < Space.length; j++) {
            Space[j] = ' ';
        }

        return Space;

    }

    private void PrintDiagonal(int a [][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    for (int x = 0; x < PrintSpace(i).length; x++) {
                        System.out.print(PrintSpace(i)[x]);
                    }
                    System.out.println(a[i][j]);
                }

            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {

            for (int j = a[0].length - 1; j > -1; j--) {
                for (int x = 0; x < PrintSpace(j).length; x++) {
                    System.out.print(PrintSpace(j)[x]);
                }
                System.out.println(a[i][j]);
                i++;
            }
        }

    }
}



