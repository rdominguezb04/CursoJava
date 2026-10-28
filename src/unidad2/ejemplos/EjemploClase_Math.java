package unidad2.ejemplos;

public class EjemploClase_Math {
    static void main() {
        //ejemplo1();

        //En una circunferencia quiero calcular la longitud y el area de la misma

        double radio=2.0;

        double longitudCircunferencia = 2 * Math.PI * radio;
        //double areaCircunferencia=Math.PI*radio*radio;
        double  areaCircunferencia = Math.PI * Math.pow(radio,2);

        System.out.println("Longitud de la circunferencia:"+longitudCircunferencia);
        System.out.println("Area de la circunferencia"+areaCircunferencia);
    }

    private static void ejemplo1() {
        int x=16;
        double y=3.8;
        double resultado = Math.sqrt(x);
        System.out.println(resultado);
        System.out.println(Math.pow(10,3));
        System.out.println(Math.round(y));
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(y));
    }
}
