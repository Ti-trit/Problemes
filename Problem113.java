import java.util.Scanner;

public class Problem113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double n = sc.nextDouble();
            sc.nextLine(); // Salto de línea
            Double p = sc.nextDouble();
            // Calcular la potencia utilizando Math.pow
            double exponente = 1.0 / n; // Convertir n a tipo double
            double resultDouble = Math.pow(p, exponente);

            // Convertir el resultado de double a BigInteger
         //   BigInteger resultado = new BigInteger(Double.toString(resultDouble));

            System.out.println(Math.round(resultDouble));
        }
    }
}
