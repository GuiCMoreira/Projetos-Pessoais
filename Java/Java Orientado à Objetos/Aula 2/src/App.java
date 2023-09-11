public class App {
    public static void main(String[] args) throws Exception {

        Personagem heroi = new Personagem();
        heroi.nome = "Naruto";
        heroi.nivel = 9;
        heroi.forca = 8;

        heroi.mostrarStatus();
        heroi.atacar();
    }
}
