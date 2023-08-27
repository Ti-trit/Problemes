import java.util.ArrayList;
/*
  Problem 23:
  Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!
  You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.

        The pixels in the input image are represented as integers.
        The algorithm distorts the input image in the following way:
        Every pixel x in the output image has a value equal to the average value
        of the pixel values from the 3 × 3 square that has its center at x,
        including x itself. All the pixels on the border of x are then removed.
 */

public class BoxBlurAlgorithm {

    int[][] solution(int[][] image) {
        // Calculate the number of centers
        int NUmIndexes = 0;
        ArrayList<int[]> Centers = new ArrayList<>();

        // FIND THE POSITION OF THE CENTER & ADD IT TO CENTERS
        for (int i = 1; i < image.length - 1; i++) {
            for (int j = 1; j < image[0].length - 1; j++) {
                if (IsCenter(image, i, j)) {
                    Centers.add(new int[]{i, j});
                    NUmIndexes++;
                }
            }
        }

        int tm = image.length-2;
        int[][] centros= new int[tm][image[0].length-2];


        ArrayList <Integer> Medias = new ArrayList<>(NUmIndexes);
        //CALCULATING THE AVERAGE
        for (int i = 0; i < NUmIndexes; i++) {
            Medias.add(Media(Centers.get(i), image));

        }

        return CopyArray(Medias, centros);
    }



    public int [][] CopyArray(ArrayList<Integer> a, int [][] centros){

        int numRows = centros.length;
        int numCols = centros[0].length;
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (index < a.size()) {
                    centros[i][j] = a.get(index);
                    index++;
                }
            }
        }

        return centros;
    }




    private int Media(int[] center, int[][] image) {
        int indexi = center[0];
        int indexj = center[1];
        int media = 0;
        for (int i = indexi - 1; i <= indexi + 1; i++) {
            for (int j = indexj - 1; j <= indexj + 1; j++) {
                media += image[i][j];
            }
        }
        return media / 9;
    }

    private boolean IsCenter( int[][] image, int row, int col) {
        int numRows = image.length;
        int numCols = image[0].length;

        //Check if the index is in the center of the martix
     if (row >= 1 && row < numRows - 1 && col >= 1 && col < numCols - 1) {
            return true;
        }

        return false;
    }




    public static void main(String[] args) {

    }
}