/*Se ha calculado el numero de puntos alineados en grupos de 3 para poder usar la formula : (x2-x1)/(x3-x2) = (y2-y1)/(y3-y2) lo que es equivalente a  (x2-x1)*(y3-y2) = (x3-x2)*(y2-y1) ya que trabajar con multiplicación resulta más conveniente
que hacer divisiones y usar variables de tipo Double.*/
/**
*@author = KIB
*Date: 05/02/2024
*/
class Solution {

    public int maxPoints(int[][] points) {
        int n = points.length;


        if(n <= 2){

         return n;
         }

        int max = 2;

        for(int i = 0 ;i < n; i++){
            for(int j = i+1; j < n ; j++){
                int temp = 2;
                for(int k = j+1 ; k<n ; k++ ){

                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if(x == y){
                        temp++;
                    }
                }
                if(temp > max){
                    max = temp;
                }
            }
        }
        return max;
    }
}
