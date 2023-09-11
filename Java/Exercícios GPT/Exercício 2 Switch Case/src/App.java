import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String s1 = JOptionPane.showInputDialog(null, "Insira uma letra: ");

        switch (s1) {
            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                JOptionPane.showMessageDialog(null, s1 + " é uma vogal");
                break;
                
                default:
                JOptionPane.showMessageDialog(null, s1 + " é uma consoante");

                break;
        }

    }
}
