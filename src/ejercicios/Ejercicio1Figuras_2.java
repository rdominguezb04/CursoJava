package ejercicios;

import java.util.Scanner;

public class Ejercicio1Figuras_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame la altura:");
        int altura = teclado.nextInt();

        System.out.println("Dame la base:");
        int base = teclado.nextInt();

        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < base; columna++) {
                if (fila == 0 || fila == altura - 1 || columna == 0 || columna == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        teclado.close();
    }
}