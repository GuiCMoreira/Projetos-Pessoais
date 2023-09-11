import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 1 a 7"));

        switch (n1) {
            case 1:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a Terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a Quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a Sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "O número " + n1 + " corresponde a Sábado");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Insira um número de 1 a 7");
        }

    }
}
