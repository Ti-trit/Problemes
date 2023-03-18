import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
*Program: Caesar Cipher
*
* Author: khaoula.ib
*
 */
public class Ceaser_Cipher {
    Scanner sc = new Scanner(System.in);
    String input;
    private char [] alfabets = ("abcdefghijklmnopqrstuvwxyz".toCharArray());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private void Start() throws IOException {

        System.out.print("Key: ");
        int key = sc.nextInt();
        System.out.print("Your input: ");
        input =br.readLine();
        System.out.print("Ciphered text: ");
        System.out.println(Ciphering(input,key));


    }



    private String Ciphering(String s, int n) {
        int index;
        char[] frase = s.toCharArray();//input
        String k ="";
        char fi[] = new char[frase.length];
            for (int i = 0; i < frase.length; i++) {
                if (!EsLletra(frase[i])) {
                    k += frase[i] ;
                } else {
                    index = GetPos(frase[i]) + n;
                    k+= alfabets[Mod(index, alfabets.length)];
                    }
                }
        return k;

    }

    private boolean EsLletra(char k) {
        for (int i = 0; i < alfabets.length; i++) {
            if (alfabets[i] == k) {
                return true;
            }
        }
        return false;
    }



    private int GetPos(char i){
      int posicion=0;
        for (int x = 0; x<alfabets.length; x++){
            if (alfabets[x]==i){
                posicion =x;
            }

        }
        return posicion;
    }

    private int Mod(int x, int y){
        int result=0;
        if (x<0){
            result = y -((-1*x)%y );
        }
        else {
            result = x%y;
        }
        return result;
    }



        public static void main(String[] args) throws IOException {(new Ceaser_Cipher()).Start(); }
}