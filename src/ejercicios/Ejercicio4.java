package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumaTotal = 0;
        int numero;
        String cadenaSuma = "";

        do {
            System.out.println("Escribir un número:");
            numero = teclado.nextInt();

            if (numero != 0) {
                int numeroTemporal = Math.abs(numero);
                int sumaDigitos = 0;
                int cantidadCifras = 0;

                while (numeroTemporal > 0) {
                    sumaDigitos += numeroTemporal % 10;
                    cantidadCifras++;
                    numeroTemporal /= 10;
                }

                if (cantidadCifras == sumaDigitos) {
                    sumaTotal += numero;

                    if (cadenaSuma.isEmpty()) {
                        cadenaSuma = String.valueOf(numero);
                    } else {
                        cadenaSuma += " + " + numero;
                    }
                }
            }
        } while (numero != 0);

        if (!cadenaSuma.isEmpty()) {
            System.out.println(cadenaSuma + " = " + sumaTotal);
        } else {
            System.out.println("Ningún número introducido cumple la condición.");
        }

        teclado.close();
    }
}