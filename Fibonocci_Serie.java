import java.util.Scanner;

public class Fibonocci_Serie {

    // Print n elements of the fibonacci serie.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n, number of serie's elements to print: ");
        int n = scan.nextInt();
        long a = 0;
        long b = 1;
        System.out.println("Fibonacci Serie");
        System.out.print("0, 1");
        for (int i = 0; i<n; i++){
           long c = a+b;
            System.out.print(", " + c );
            a = b;
            b = c;
        }
    }
}