import java.util.Scanner;

public class EjemploScanner2 {
    static void main() {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce un número:");
        while (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            System.out.println("Número introducido: " + numero);
            System.out.println("Introduce un número:");
        }
    }
}
