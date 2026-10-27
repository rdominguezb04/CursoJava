package ejercicios;

import java.util.Scanner;

public class Ejercicio4_2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num= 0,numCifras=1,sumaCifras=0,sumaTotal=0,resto=0;
        do {
            System.out.println("Dame un numero");
            num= teclado.nextInt();
            while(num!=0){
                resto=num%10;
                num=num/10;
                sumaCifras=sumaCifras+resto;
                numCifras = numCifras+1;
            }
            if (sumaCifras==numCifras){
                sumaTotal=sumaTotal+num;
            }

        }while (num!=0);
        System.out.println("Suma total");
    }
}
