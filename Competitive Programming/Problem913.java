import java.util.Scanner;

public class Problem913 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {

                long n = sc.nextLong(); // Se utiliza long en lugar de int para manejar números grandes
                long d = (int) n/2;
                long start = (d*d*2) +1;  //start of line of index n
                //start of thirdlastelement
                long index = start + 2*(n-3);
                long sum = index*3 + 6;
                System.out.println(sum);

        }
    }
}
