import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem11988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            List<Character> output = new LinkedList<>();
            String input = sc.nextLine();
            int cursor = 0;

            for (char c : input.toCharArray()) {
                if (c == '[') {
                    cursor = 0;  // Mover el cursor al principio
                } else if (c == ']') {
                    cursor = output.size();  // Mover el cursor al final
                } else {
                    // Insertar el carácter en la posición del cursor
                    output.add(cursor, c);
                    cursor++;  // Mover el cursor hacia adelante
                }
            }
            // Usar un StringBuilder para construir el resultado
            StringBuilder result = new StringBuilder();
            for (char c : output) {
                result.append(c);
            }
            System.out.println(result);
        }

        sc.close();
    }
}
