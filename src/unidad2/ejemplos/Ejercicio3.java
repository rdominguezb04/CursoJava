package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Edad:");
        int edad = teclado.nextInt();

        String mensaje = (edad >= 18)
                ? nombre + " puedes entrar en la discotec. Eres mayor de edad."
                : nombre + " no puedes entrar en la discotec. Eres menor de edad.";

        System.out.println(mensaje);
    }
}