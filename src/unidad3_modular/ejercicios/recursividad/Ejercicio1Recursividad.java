package unidad3_modular.ejercicios.recursividad;

import java.util.Scanner;

public class Ejercicio1Recursividad {
    static void main() {
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        int n = teclado.nextInt();

        int numeroDigitos = calcularDigitosRecursivo(n);
        System.out.println("El resultado es: " + numeroDigitos);
    }

    private static int calcularDigitos(int n) {
        int contador = 1;
        while (n > 9) {
            n = n / 10;
            contador++;
        }
        return contador;
    }

    private static int calcularDigitosRecursivo(int n) {
        if (n > 9) {
            return 1 + calcularDigitosRecursivo(n / 10);
        } else {
            return 1;
        }
        //return contador;
    }
}
