import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n1 = tcl.nextInt();
        System.out.println("Insira outro número: ");
        int n2 = tcl.nextInt();
        System.out.println("Insira outro número: ");
        int n3 = tcl.nextInt();

        if (n1 > n2 & n1 > n3) {
            System.out.println(n1 + " é o maior número");
        }
        if (n2 > n1 & n2 > n3) {
            System.out.println(n2 + " é o maior número");
        }
        if (n3 > n2 & n3 > n1) {
            System.out.println(n3 + " é o maior número");
        } else {
            System.out.println("Os números são enguais");
        }
        tcl.close();

    }
}
