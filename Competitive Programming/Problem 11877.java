import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            int number = 0;
                while (n >= 3) {
                    n = (n-3)+1;
                    number += 1;
                }
                if (n == 2) {
                    number += 1;

                }
            System.out.println(number);


        }
    }
}
