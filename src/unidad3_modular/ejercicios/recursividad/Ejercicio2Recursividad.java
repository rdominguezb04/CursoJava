package unidad3_modular.ejercicios.recursividad;

import java.util.Scanner;

public class Ejercicio2Recursividad {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una base");
        int b = teclado.nextInt();
        System.out.println("Dame un exponente");
        int e = teclado.nextInt();

        //int resultado = calcularPotencia(b, e);
        int resultado = calcularPotenciaIterativa(b, e);
        System.out.println("El resultado es " + resultado);
    }

    private static int calcularPotencia(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * calcularPotencia(b, e - 1);
    }

    private static int calcularPotenciaIterativa(int b, int e) {
        int p = 1;

        for (int i = 0; i < e; i++) {
            p = p * b;
        }
        return p;
    }
}

