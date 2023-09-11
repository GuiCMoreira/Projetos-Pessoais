public class App {
    public static void main(String[] args) throws Exception {

        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy 22";
        celularB.tamanhoTela = 6.8f;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb de memória e %s\n", celularA.nome,
                celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb de memória e %s", celularB.nome, celularB.tamanhoTela,
                celularB.armazenamento, celularB.sistemaOperacional);
    }
}
