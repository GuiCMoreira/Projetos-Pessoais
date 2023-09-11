import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Como você deseja fazer a conversão?");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int op = tcl.nextInt();

        if (op == 1) {
            System.out.println("Insira a temperatura em celsius que deseja converter: ");
            double cel1 = tcl.nextDouble();
            System.out.println("A temperatura " + cel1 + " em fahrenheit é " + ((cel1 * 9 / 5) + 32));

        }
        if (op == 2) {
            System.out.println("Insira a temperatura em fahrenheit que deseja converter: ");
            double far = tcl.nextDouble();
            System.out.println("A temperatura " + far + " em celsius é " + ((far - 32) * 5 / 9));

        }
        if (op != 1 & op != 2) {
            System.out.println("Insira uma operação válida");
        }

        tcl.close();
    }
}
