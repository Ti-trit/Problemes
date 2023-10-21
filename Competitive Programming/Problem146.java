import java.util.Arrays;
import java.util.Scanner;

public class Problem146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (sc.hasNext()) {
            input = sc.next();
            if (input.equals("#")) {
                break;
            }

            char[] word = input.toCharArray();

            if (nextPermutation(word)) {
                System.out.println(new String(word));
            } else {
                System.out.println("No Successor");
            }
        }
    }

    public static boolean nextPermutation(char[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i + 1, arr.length);
        return true;
    }
}
