package EntrenamientoExamen_UT3;

import java.util.Scanner;

public class Ejercicio1{
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Es cero");
        }
    }


}
