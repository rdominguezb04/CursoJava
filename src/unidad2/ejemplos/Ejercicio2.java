package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de usuario: ");
        String usuario = scanner.nextLine();

        switch (usuario) {
            case "user":
                System.out.println("Acceso al menú usuario");
                break;

            case "admin":
                System.out.println("Acceso a menú administrador");
                break;

            default:
                System.out.println("error de acceso");
                break;
        }

        scanner.close();
    }
}