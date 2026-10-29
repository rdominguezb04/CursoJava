package unidad3_modular.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("Resultado: " + multiplicar(a, b));
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}