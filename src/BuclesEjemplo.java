public class BuclesEjemplo {
    /*Mostrar los 5 primeros numeros enteros
     hacerlo de tres formas utilizando: for, do while , while*/
    static void main() {
        mostrar5PrimerosNumeros_for();
        mostrar5PrimerosNumeros_while();
        mostar5PrimerosNumeros_do_while();

    }

    private static void mostrar5PrimerosNumeros_for() {
        for (int num = 1; num <=5; num++){
            System.out.println(num);
        }
    }
    private static void mostrar5PrimerosNumeros_while() {
        int num=1;
        while (num<=5){
            System.out.println(num);}
            num++;
    }
    private static void mostar5PrimerosNumeros_do_while(){
        int num=1;
        do{
            System.out.println(num);
            num++;
        }while (num<=5);;

    }
}
