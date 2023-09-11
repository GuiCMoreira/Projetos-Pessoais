import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        // fori
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        // dowhile
        contador = 1;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

        // Gerando numeros aleatórios
        Random n1 = new Random();
        int n2 = 1 + n1.nextInt(15);
        do {
            System.out.println("Gerou o número: " + n2);
            n2 = 1 + n1.nextInt(15);
        } while (n2 != 10);
        System.out.println("Gerou o número: " + n2);
    }
}
