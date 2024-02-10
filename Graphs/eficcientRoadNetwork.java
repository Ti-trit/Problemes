import java.util.ArrayList;

/**
 * 3r problema de grafos de CodeSignal
 * @author : KIB
 * @Date: 10/02/24
 */

class eficcientRoadNetwork {

    public static void main(String[] args) {

        int [][] roads = {{3,0}, {0,4}, {5,0}, {2,1}, {1,4}, {2,3}, {5,2}};
        System.out.println(solution(6,roads));



    }

    static boolean solution(int n, int[][] roads) {

        for (int i = 0; i<n; i++){
            //buscar las cuidades conectadas a la cuidad i
            ArrayList<Integer> roadsi = GetiRoads(i, roads);

            for (int j = i+1;j<n; j++){
                //buscar las ciudades conectadas a la cuidad j
                ArrayList<Integer> roadsj = GetiRoads(j, roads);
                //verificar que la cuidad j esta directamente conectada con la cuidad i o que tienen alguna cuidad
                //comun conectada a ambas cuidades
                if (!roadsi.contains(j) && !CommonRoad(roadsi, roadsj)){
                    return false;
                }
            }

        }

return true;

    }

   static ArrayList<Integer> GetiRoads(int x, int [][] roads){
       ArrayList<Integer> iRoads = new ArrayList<>();
       for (int i = 0; i<roads.length; i++){
               if (roads[i][0]== x ){
                   iRoads.add(roads[i][1]);
               }else if (roads[i][1]==x ){
                   iRoads.add(roads[i][0]);
               }

       }

       System.out.println(iRoads);
       return iRoads;

   }

   static boolean CommonRoad(ArrayList<Integer> roadsi, ArrayList<Integer> roadsj ){
        for (int i = 0; i<roadsi.size(); i++){
            if (roadsj.contains(roadsi.get(i))){
                return true;
            }
        }

        return false;
    }




}
