package unidad2.ejemplos;

import java.util.Scanner;

public class Ejemplo_If {
    static void main() {
        //ejemplo1_if();
        /*leer el nombre y la edad de una persona que desea entrar a una discoteca*/
        Scanner teclado=new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre=teclado.nextLine();
        System.out.println("Edad:");
        int edad=teclado.nextInt();

        if (edad>=18){
            System.out.println(nombre+" puedes entrar en la discotec. Eres mayor de edad.");
        }else{
            System.out.println(nombre+" no puedes entrar en la discotec. Eres menor de edad.");
        }


    }

    private static void ejemplo1_if() {
    /*
    Declarar una variable entera x con un valor inicial.
    Si x==3 incremento en 1 x sino decremento en 1 x
     */
        int x = 3;
        if (x==3) {
            x++;
        }else {
            x--;
        }
        System.out.println(x);
    }
}
