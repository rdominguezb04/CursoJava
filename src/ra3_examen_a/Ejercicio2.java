package ra3_examen_a;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        boolean multiploDe7 = false;
        int contador = 0;
        int suma = 0;
        int pares = 0;
        int impares = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = teclado.nextInt();
        while (num != 0) {
            if (num > 0) {
                contador++;
                suma = suma + num;
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (num % 7 == 0) {
                    (multiploDe7) = true;
                }
            }
            System.out.println("Dame un numero");
            num = teclado.nextInt();
        }//fin while
        System.out.println("Total de numeros positivos:" + contador);
        System.out.println("Total de numeros pares:" + pares);
        System.out.println("Total de numeros impares:" + impares);
        System.out.println("Suma:" + suma);
        if (multiploDe7 == true) {
            System.out.println("Hay multiplo de 7");
        } else {
            System.out.println("No hay multiplo de 7");
        }
    }
}
