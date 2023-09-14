import java.util.*;

/*  Date: 12/09/2023
    Problem:
*   You are watching a volleyball tournament, but you missed the beginning of the very first game of your favorite team. 
    Now you're curious about how the coach arranged the players on the field at the start of the game.
    
    The team you favor plays in the following formation:
    
    0 3 0
    4 0 2
    0 6 0
    5 0 1
    where positive numbers represent positions occupied by players. After the team gains the serve, its members rotate one position in a clockwise direction,
    so the player in position 2 moves to position 1, the player in position 3 moves to position 2, and so on, with the player in position 1 moving to position 6.
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

