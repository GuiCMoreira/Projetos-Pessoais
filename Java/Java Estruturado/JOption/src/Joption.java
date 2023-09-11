import javax.swing.JOptionPane;

public class Joption {
  public static void main(String[] args) {

    String sn1 = JOptionPane.showInputDialog(null, "Insira um número: ", "Soma", JOptionPane.DEFAULT_OPTION);
    String sn2 = JOptionPane.showInputDialog(null, "Insira outro número: ", "Soma", JOptionPane.DEFAULT_OPTION);

    int n1 = Integer.parseInt(sn1);
    int n2 = Integer.parseInt(sn2);
    int resultado = n1 + n2;

    JOptionPane.showMessageDialog(null, resultado, "Resultado: ", JOptionPane.DEFAULT_OPTION);

  }
}
