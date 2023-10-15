import java.math.BigInteger;
import java.util.Scanner;

/*
* @author: Khaoula
*/
public class Problem713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc > 0) {
            BigInteger n1 = new BigInteger(new StringBuilder(sc.next()).reverse().toString());
            BigInteger n2 = new BigInteger(new StringBuilder(sc.next()).reverse().toString());

            BigInteger sum = n1.add(n2);

            System.out.println(new StringBuilder(sum.toString()).reverse());

            tc--;
        }
    }
}
