package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número:");
        int numero=teclado.nextInt();
        int contadordigitos=1;
        int copiaNum = numero;
        Math.abs(numero);
        while (numero>9){
            contadordigitos++;
            numero = numero / 10;
        }
        System.out.println("El número "+copiaNum+ " tiene " +contadordigitos);
    }
}
