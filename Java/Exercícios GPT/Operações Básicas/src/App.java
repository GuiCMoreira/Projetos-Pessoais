import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer?");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int op = tcl.nextInt();

        System.out.println("Insira o primeiro número da operação: ");
        int n1 = tcl.nextInt();

        System.out.println("Insira o segundo número da operação: ");
        int n2 = tcl.nextInt();

        if (op == 1) {
            System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        }
        if (op == 2) {
            System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
        }
        if (op == 3) {
            System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
        }
        if (op == 4) {
            System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
        } else {
            System.out.println("Insira uma operação válida");
        }

        tcl.close();

    }
}
