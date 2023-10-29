import java.util.Arrays;
import java.util.Scanner;

public class Problem195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía después del número de casos

        while (cases-- > 0) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            do {
                printPermutation(chars);
            } while (nextPermutation(chars));
        }
    }

    public static boolean nextPermutation(char[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false; // No more permutations
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i + 1, arr.length - 1);

        return true;
    }

    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printPermutation(char[] arr) {
        System.out.println(new String(arr));

    }
}
