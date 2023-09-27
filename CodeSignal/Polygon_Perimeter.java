
/*
Date : 27/09/2023
@author:KIB
Problem:
You have a rectangular white board with some black cells.
The black cells create a connected black figure, i.e. it is possible to get
from any black cell to any other one through connected adjacent (sharing a common side) black cells.

Find the perimeter of the black figure assuming that a single cell has unit length.

It's guaranteed that there is at least one black cell on the table.
 */


public class Polygon_Perimeter {


    int solution(boolean[][] matrix) {
        int perimeter = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]) {
                    perimeter += Numberofsides(i, j, matrix);
                }
            }
        }

        return perimeter;
    }

    public int Numberofsides(int i, int j, boolean[][] matrix) {
        int adjacentpos = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Define the possible adjacent positions
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (isValidPos(x, y, rows, cols) && matrix[x][y]) {
                adjacentpos++;
            }
        }

        return 4 - adjacentpos;
    }

    public boolean isValidPos(int x, int y, int rows, int cols) {
        return x >= 0 && y >= 0 && x < rows && y < cols;
    }


    public static void main(String[] args) {
        boolean[][] matrix = {{false, true, true}, {true, true, false},
                {true, false, false}};
        Polygon_Perimeter p = new Polygon_Perimeter();
        System.out.println(p.solution(matrix));

    }
}