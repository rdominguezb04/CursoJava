package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;
        int cuentaMayor=1;
        int cuentaMenor=1;

        System.out.println("Dame una cantidad:");
        int contador=teclado.nextInt();

        for (int i = 1; i <= contador; i++) {
            System.out.println("Dame un numero:");
            int numero = teclado.nextInt();
            if (numero>mayor){
                mayor=numero;
            }else if (numero==mayor){
                cuentaMayor++;
            }
            if (numero<menor){
                menor=numero;
            }else if (numero==menor){
                cuentaMenor++;
            }
        }//fin del for
        System.out.println("El mayor es "+mayor+" y se repite "+cuentaMayor);
        System.out.println("El menor es "+menor+" y se repite "+cuentaMenor);
    }
}
