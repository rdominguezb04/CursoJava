package unidad2.ejemplos;

public class OperadoresLogicos {
    static void main() {
        int a=1, b=2;
        boolean condicion1=false,condicion2=true;

        boolean resultado2 = condicion1 && (a > b);

        //&& = and True= true && true
        boolean resultado = condicion1 && condicion2;
        System.out.println(resultado);

        //  || = or     True = true || false
        resultado = condicion1 || condicion2;
        System.out.println(resultado);
        // ! = not      !false=true     !true=false
        condicion1=!condicion1;
        System.out.println(condicion1);
    }
}
