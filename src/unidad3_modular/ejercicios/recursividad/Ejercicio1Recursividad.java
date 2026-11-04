package unidad3_modular.ejercicios.recursividad;

import java.util.Scanner;

public class Ejercicio1Recursividad {
    static void main() {
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = teclado.nextInt();

        int numeroDigitos = calcularDigitos(numero):
        System.out.println("El resultado es:"+numeroDigitos);
    }

    private static int calcularDigitos(int numero) {
    }
}
