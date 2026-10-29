package unidad3_modular.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de opciones: ");
        int n = sc.nextInt();

        int opcion;

        do {
            mostrarMenu(n);
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion < 1 || opcion > n) {
                System.out.println("Opcion incorrecta");
            } else if (opcion == n) {
                System.out.println("Saliendo del programa");
            } else {
                System.out.println("Has elegido la opcion " + opcion);
            }

        } while (opcion != n);
    }

    public static void mostrarMenu(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(i + ". Opcion " + i);
        }

        System.out.println(n + ". Salir");
    }
}