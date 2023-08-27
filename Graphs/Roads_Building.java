import java.util.ArrayList;
import java.util.Arrays;

public class Roads_Building {


    public void Start(){
        int [][] roads = {{0,2},{3,1}};
        System.out.println(Arrays.deepToString(solution(4, roads)));
    }
    /*Problem 2:Graphs challenge
    Given the existing roads and the number of cities in the kingdom,
    you should use the most modern technologies and find out which roads
    should be built again to connect each pair of cities. Since the crystal ball is quite old and meticulous,
     it will only transfer the information if it is sorted properly.

    The roads to be built should be returned in an array sorted lexicographically,
    with each road stored as [cityi, cityj], where cityi < cityj.*/
    int[][] solution(int cities, int[][] roads) {
        ArrayList<int[]> All = new ArrayList<>();
        for (int i = 0; i < cities; i++) {
            for (int j = i + 1; j < cities; j++) {
                All.add(new int[]{i, j});
            }
        }

        for (int[] ints : roads) {
            for (int j = 0; j < ints.length; j++) {
                int[] road = ints;
                for (int[] pair : All) {
                    if ((pair[0] == road[0] && pair[1] == road[1]) || pair[0] == road[1] && pair[1] == road[0]) {
                        All.remove(pair);
                        break;
                    }
                }
            }
        }

        int[][] s = new int[All.size()][2];
        for (int i = 0; i < s.length; i++) {
            s[i] = All.get(i);
        }
        return s;
    }

    public static void main(String[] args) {
        (new Roads_Building()).Start();
    }
}