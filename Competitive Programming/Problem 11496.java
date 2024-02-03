import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while ((number = sc.nextInt()) != 0) {
            int counter = 0;
            int[] harmony = new int[number];

            for (int i = 0; i < number; i++) {
                harmony[i] = sc.nextInt();
            }

            for (int i = 0; i < number; i++) {
                int current = harmony[i];
                int previous = harmony[(i - 1 + number) % number]; // Circular previous index
                int next = harmony[(i + 1) % number]; // Circular next index

                if ((current < previous) && (current < next)) {
                    counter++;
                } else if ((current > previous) && (current > next)) {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }
}
