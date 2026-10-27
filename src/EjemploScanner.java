import java.util.Scanner;

public class EjemploScanner {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre=teclado.next(); //Error: deja /n en buffer
        System.out.println("Apellidos:");
        String apellidos=teclado.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tus apellidos son:"+apellidos);
        System.out.println("Introduce una letra:");
        teclado.next();
    }
}
