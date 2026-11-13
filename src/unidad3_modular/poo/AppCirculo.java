package unidad3_modular.poo;

public class AppCirculo {
    public static void main() {
        Circulo c1 = new Circulo();
        //System.out.println("Los atributos son: "+c1.toString());
        String c1tostring = c1.toString();
        System.out.println(c1tostring);
        System.out.println("El area es: "+c1.area());
        System.out.println("La longitud es: "+c1.longitud());

        Circulo c2 = new Circulo(1.5,"amarillo",150,150);
        String c2tostring = c2.toString();
        System.out.println(c2tostring);
        System.out.println("El area es: "+c2.area());
        System.out.println("La longitud es: "+c2.longitud());

    }
}
