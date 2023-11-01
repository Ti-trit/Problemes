import java.util.Locale;
import java.util.Scanner;

public class Problem10221 {
    private static int radius = 6440;

    public static void main(String[] args) {
        // Establecer la localización a una que use el punto como separador decimal
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double s = sc.nextDouble();
            double grado = sc.nextDouble();
            String unidad = sc.next();

            if (unidad.equals("deg")) {
                grado = Math.toRadians(grado);
            } else if (unidad.equals("min")) {
                grado = Math.toRadians(grado / 60);
            }

            double arco =  (s + radius) * grado;
            double chore = 2 * (s + radius) * Math.sin(grado / 2);

            System.out.printf("%.6f %.6f%n", arco, chore);
        }
    }
}
