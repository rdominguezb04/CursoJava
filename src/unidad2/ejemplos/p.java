package unidad2.ejemplos;

public class p {
    static void main() {
        String nombre = "Reynaldo";
        String apellido = "Dominguez";
        String nombreCompleto = nombre+ " " +apellido; //Reynaldo Dominguez
        int posicion_espacio = nombreCompleto.indexOf(" ");
        String soloNombre = nombreCompleto.substring(0, posicion_espacio);
        int longitud = nombreCompleto.length();

        //Mostrar en la terminal
        System.out.println("Mi nombre es:"+ " " +nombreCompleto);
        System.out.println("La longitud de la cadena es de"+ " " +longitud);
        System.out.println("La posicion del espacio en la cadena es:"+" "+ (posicion_espacio+1));
        System.out.println("Extraje en una cadena mi nombre usando substring:" + " "+ soloNombre);
    }

}
