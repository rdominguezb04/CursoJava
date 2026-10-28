package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numero = 0;
        String cadenaSuma = "";
        do {
            ;
            System.out.println("Escribir un número:");
            numero = teclado.nextInt();
            if (numero > 0) {
                suma = suma + numero;
                cadenaSuma = cadenaSuma + numero + "+";
            }
        } while (numero > 0);
        System.out.println(cadenaSuma + "\b=" + suma);


    }
}

