import java.util.Arrays;

/*
    Problem: n the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine
     have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some
     arrangement of mines we want to create a Minesweeper game setup.

     Date: 15/08/23
     @Author: KIB
 */

public class Minesweeper {


    public static void main(String[] args) {
        boolean [][] grid = {{true, false, false},
                {false, true, false},
                {false, false, false}};
        System.out.println(Arrays.deepToString(solution(grid)));

        ;    }

    static int[][] solution(boolean[][] matrix) {



        int [][] solution = new int[matrix.length][matrix[0].length];
        for (int i =0; i<matrix.length; i++){
            for (int j= 0; j<matrix[0].length; j++){
                solution[i][j] = CountMines(i,j,matrix);
            }
        }
        return solution;
    }

    private static  int CountMines (int indexi, int indexj, boolean[][]matrix){
        int counter = 0;
        if (matrix[indexi][indexj]){
            counter = -1;
        }

        for (int i = indexi-1; i<=indexi+1; i++){
            for (int j = indexj-1; j<=indexj+1; j++){
                if (Correctindexes (i,j, matrix) && (matrix[i][j])) {

                    counter++;


                }
            }
        }
        return counter;
    }

    private static boolean Correctindexes (int i, int j, boolean [][]matrix){
        return i <matrix.length && j<matrix[0].length && i >=0 && j >=0;


    }


}