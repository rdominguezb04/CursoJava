package unidad3_modular.ejercicios.recursividad;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuantos números quieres: ");
        int numero = teclado.nextInt();
        System.out.println("La sucesión es: ");
        //Sucesion(numeros);
        SucesionRecursiva(numero);
    }

    private static void Sucesion(int numero) {
        int anterior = 1;
        int actual = 0;
        int siguiente;
        for (int i = 0; i < numero; i++) {
            siguiente = anterior + actual;
            System.out.println(siguiente);
            anterior = actual;
            actual = siguiente;
        }
    }

    private static void SucesionRecursiva(int numero) {
        int anterior = 1;
        int actual = 0;
        int siguiente;

        if (numero >0) {
            siguiente = anterior + actual;
            System.out.println(siguiente);
            anterior = actual;
            actual = siguiente;
            SucesionRecursiva(numero-1);
        }


    }

}
