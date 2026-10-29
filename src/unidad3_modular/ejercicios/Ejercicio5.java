package unidad3_modular.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();

        comprobarPar(n);
    }

    public static void comprobarPar(int n) {
        if (n % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}