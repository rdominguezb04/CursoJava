package unidad3_modular.ejercicios.ejercicio3_menu;

import java.util.Scanner;

public class Ejercicio3_MenuFigurasDibujoBucle {

    static void main() {
        dibujarMenuDeOpciones();
    }

    private static void dibujarMenuDeOpciones() {
        int numero;
        int opcion;

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("1. Dibujar cuadrado");
            System.out.println("2. Dibujar triangulo");
            System.out.println("3. Salir");
            System.out.println("Elige una opción (1-3):");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dame el lado del cuadrado");
                    numero = teclado.nextInt();
                    dibujarCuadrado(numero);
                    break;

                case 2:
                    System.out.println("Dame la altura del triángulo");
                    numero = teclado.nextInt();
                    dibujarTriangulo(numero);
                    break;

                case 3:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.err.println("Opción no válida");
            }

        } while (opcion != 3);

    }

    public static void dibujarTriangulo(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dibujarCuadrado(int numero) {
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}