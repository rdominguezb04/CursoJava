package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio1Figuras {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la altura:");
        int altura = teclado.nextInt();
        System.out.println("Dame la base:");
        int base = teclado.nextInt();
        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < base; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
