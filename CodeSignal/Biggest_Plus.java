import java.util.ArrayList;
/*  Author :Khaoula Ikkene
    Date: 03/09/2023
    Problem:
*   Given a matrix that contains only the characters '0' and '1', find the biggest plus sign (+)
*   formed by 1s in this matrix and return its size. Size, in this case, indicates the length of
*   the plus sign's edges. In order to be a valid plus sign, the edges must be of equal length.
 */
public class Biggest_Plus {

    public void Start() {
        String [] matrix = {"0010010",
                "1010101",
                "1111111",
                "0010000",
                "0000000"};
        System.out.println(solution(matrix));


    }


    public int solution(String[] matrix) {

        int max = 0;

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[0].length() - 1; j++) {

                max = Math.max(max, plusSize(i, j, matrix));
            }
        }

        return max;
    }

    private int plusSize(int x, int y, String[] matrix) {
        int d = 1;
        int max_size = 0;
        char center = '1';

        while (x - d >= 0 && x + d < matrix.length && y - d >= 0 && y + d < matrix[0].length()) {
            if (matrix[x - d].charAt(y) == center && matrix[x + d].charAt(y) == center &&
                    matrix[x].charAt(y - d) == center && matrix[x].charAt(y + d) == center) {
                max_size++;
                d++;
            } else {
                break;
            }
        }

        return max_size;
    }


    public static void main(String[] args) {
        (new Biggest_Plus()).Start();
    }
}

