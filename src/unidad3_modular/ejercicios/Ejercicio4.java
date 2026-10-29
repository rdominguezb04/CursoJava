package unidad3_modular.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();

        tabla(n);
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void tabla(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + multiplicar(n, i));
        }
    }
}