package unidad2.ejemplos;

public class EjerciciosPruebas {
    static void main() {
        //ejemplo();
        //ejemplo2();
        String nada = ""; //cadena vacía
        String nombre = "Pepe";
        String apellido = "Martínez";
        String nombreCompleto1 = nombre + apellido; //PepeMartínez
        String nombreCompleto2 = nombre + " " + apellido; //Pepe Martínez

        System.out.println(nada);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombreCompleto1);
        System.out.println(nombreCompleto2);
    }

    private static void ejemplo2() {
        int numero=5;
        char letra='A';
        char emoticon='\u30C4';
        boolean aprobado=false;
        System.out.println("Letra1:"+letra);
        System.out.println("Emoticon:"+emoticon);
        System.out.println("¿Aprobado? "+aprobado);
    }

    private static void ejemplo() {
        int resultado=20;
        System.out.println("Hola");
        System.out.println("Buenas");

        System.out.println("Resultado=" + resultado);
    }
}
