package unidad3_modular.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero para calcular su cubo:");
        int numero = teclado.nextInt();
        while (numero != 0) {
            int resultado = calcularCubo(numero);
            System.out.println("El resultado es:" + resultado);
            System.out.println("Dame otro numero:");
            numero = teclado.nextInt();
        }
        teclado.close();
        System.err.println("0 -> Numero no valido");
    }

    private static int calcularCubo(int numero) {
        return numero * numero * numero;
    }
}
