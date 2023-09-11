public class Personagem {
  String nome;
  int forca;
  int nivel;

  void mostrarStatus() {
    System.out.format("Personagem %s (lvl %d) com %d de força \n", nome, nivel, forca);
  }

  void atacar() {
    System.out.format("%s atacou e causou %d de dano \n", nome, forca);
  }
}
