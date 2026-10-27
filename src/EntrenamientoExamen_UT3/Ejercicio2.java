package EntrenamientoExamen_UT3;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 4");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Consultar notas");
                break;
            case 2:
                System.out.println("Mostrar alumnos");
                break;
            case 3:
                System.out.println("Registrar asistencia");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.err.println("Opción incorrecta");

        }
    }
}
