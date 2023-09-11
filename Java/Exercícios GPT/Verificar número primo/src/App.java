import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n1 = tcl.nextInt();
        
        if (n1 == 2 || n1 == 3) {
            System.out.println(n1 + " é um número primo");
        } else {
            if (n1 % 2 != 0 & n1 % 3 != 0) {
                System.out.println(n1 + " é um número primo");
            } else {
                System.out.println(n1 + " não é um número primo");
            }
        }

        tcl.close();

    }
}
