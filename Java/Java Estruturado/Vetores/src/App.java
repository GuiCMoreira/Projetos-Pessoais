import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        String[] vt1 = new String[] {
                "Gui", "Gu", "G"
        };

        for (int i = 0; i < vt1.length; i++) {
            System.out.println(vt1[i]);
        }

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        System.out.println(Arrays.toString(numeros));

    }
}
