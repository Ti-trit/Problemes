import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            long n = sc.nextLong(); // Se utiliza long en lugar de int para manejar números grandes
           long d = (int) n/2;
           long number = d*d;    //cuantos numeros impares hay
            long start = (number*2) +1;  //start of line of index n
            //start of thirdlastelement
            long index = start + 2*(n-3);
            long sum = index*3 + 6;
            System.out.println(sum);

        }
    }
}