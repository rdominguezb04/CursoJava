package unidad2.ejemplos;

public class ParesEntre1_10_continue {
    static void main() {
        //ParesEntre1_10_sinContinue();

        for (int i = 1; i <=10 ; i++){
            if (i%2!=0) continue;
            System.out.println(i);
        }
    }

    private static void ParesEntre1_10_sinContinue() {
        for (int i = 1; i <= 10; i++){
            if (i %2==0){
                System.out.println(i);
            }
        }
    }
}
