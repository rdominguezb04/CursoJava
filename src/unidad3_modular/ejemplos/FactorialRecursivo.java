package unidad3_modular.ejemplos;

import java.util.Scanner;

public class FactorialRecursivo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println("Dame un número entero positivo");
            num = teclado.nextInt();
            if (num >= 0) {
                int res = factorial(num);
                System.out.println("El factorial de " + num + " es " + res);
            }
        }
        while (num != 0);
    }

    private static int factorial(int num) {
        if (num == 0) {//caso 0 es el caso base
            return 1;
        }
        return num * factorial(num - 1);
    }
}
