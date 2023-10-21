import java.util.Scanner;

public class Problem374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long B = sc.nextLong();
            long P = sc.nextLong();
            long M = sc.nextLong();
            System.out.println(powerMod(B,P,M));
        }
          }

    public static long powerMod(long B, long P, long M) {
        long result = 1;
        B %= M; // Reducir la base modulo M
        while (P > 0) {
            if (P % 2 == 1) {
                result = (result * B) % M;
            }
            B = (B * B) % M;
            P /= 2;
        }
        return result;
    }
}