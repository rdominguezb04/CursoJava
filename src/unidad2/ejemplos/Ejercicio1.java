package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de usuario: ");
        String usuario = scanner.nextLine();

        if (usuario.equals("user")) {
            System.out.println("Acceso al menú usuario");
        } else if (usuario.equals("admin")) {
            System.out.println("Acceso al menú administrador");
        } else {
            System.out.println("error de acceso");
        }

        scanner.close();
    }
}