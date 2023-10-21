import java.util.Scanner;

public class Problem1586 {
    public static void main(String[] args) {
        double[] weights = new double[128];
        weights['C'] = 12.01;
        weights['H'] = 1.008;
        weights['O'] = 16.00;
        weights['N'] = 14.01;

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            String str = scanner.next();
            double totalWeight = 0.0;

            for (int i = 0; i < str.length();) {
                char currentElement = str.charAt(i);
                i++;

                if (i < str.length() && Character.isDigit(str.charAt(i))) {
                    int count = 0;
                    while (i < str.length() && Character.isDigit(str.charAt(i))) {
                        count = count * 10 + (str.charAt(i) - '0');
                        i++;
                    }
                    totalWeight += weights[currentElement] * count;
                } else {
                    totalWeight += weights[currentElement];
                }
            }

            System.out.printf("%.3f%n", totalWeight);
        }
    }
}
