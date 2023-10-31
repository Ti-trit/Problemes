import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem10394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> prime = new ArrayList<>();
        int n = 18500000;

        // Utilizamos la Criba de Eratóstenes para generar números primos hasta n
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                prime.add(i);
            }
        }

        List<Integer> pairs = new ArrayList<>();
        for (int i = 1; i < prime.size(); i++) {
            if (prime.get(i) - prime.get(i - 1) == 2) {
                pairs.add(prime.get(i - 1));
                pairs.add(prime.get(i));
            }
        }

        int k;
        while (sc.hasNext()) {
            k = sc.nextInt();
            if (k > 0 && k <= pairs.size() / 2) {
                System.out.println("(" + pairs.get(2 * k - 2) + ", " + pairs.get(2 * k - 1) + ")");
            }
        }
    }
}
