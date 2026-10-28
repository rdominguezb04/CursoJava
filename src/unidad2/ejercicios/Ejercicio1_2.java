
package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio1_2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una cantidad:");
        int contador = teclado.nextInt();

        System.out.println("Dame un numero:");
        int numero = teclado.nextInt();

        int mayor = numero;
        int menor = numero;
        int cuentaMayor = 1;
        int cuentaMenor = 1;

        for (int i = 2; i <= contador; i++) {
            System.out.println("Dame un numero:");
            numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
                cuentaMayor = 1;
            } else if (numero == mayor) {
                cuentaMayor++;
            }

            if (numero < menor) {
                menor = numero;
                cuentaMenor = 1;
            } else if (numero == menor) {
                cuentaMenor++;
            }
        }

        System.out.println("El mayor es " + mayor +
                " y se repite " + cuentaMayor);

        System.out.println("El menor es " + menor +
                " y se repite " + cuentaMenor);
    }
}
