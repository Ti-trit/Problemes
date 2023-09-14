import java.util.*;

/*  Author :Khaoula Ikkene
    Date: 03/09/2023
    Problem:
*   Given a matrix that contains only the characters '0' and '1', find the biggest plus sign (+)
*   formed by 1s in this matrix and return its size. Size, in this case, indicates the length of
*   the plus sign's edges. In order to be a valid plus sign, the edges must be of equal length.
 */
public class Volleyball_Positions {

    public void Start() {

        String [][] formation = {{"empty",   "Player5", "empty"},
                {"Player4", "empty",   "Player2"},
        {"empty",   "Player3", "empty"},
    {"Player6", "empty",   "Player1"}};
        System.out.println(((Arrays.deepToString(solution(formation,50 )))));


    }




    String[][] solution(String[][] formation, int k) {
        int[][] moves = {
                {0, 1}, {1, 2}, {3, 2}, {2, 1}, {3, 0}, {1, 0}
        };

        for (int i = k % 6; i > 0; i--) {
            String firstElement = formation[moves[0][0]][moves[0][1]];

            for (int j = 0; j < moves.length - 1; j++) {
                formation[moves[j][0]][moves[j][1]] = formation[moves[j + 1][0]][moves[j + 1][1]];
            }

            formation[moves[5][0]][moves[5][1]] = firstElement;
        }

        return formation;
    }






    public static void main(String[] args) {
        (new Volleyball_Positions()).Start();
    }
}

