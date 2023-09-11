public class App {

  // Somar elementos de um vetor Crie um programa que recebe um vetor de números
  // inteiros e retorna a soma de todos os elementos.

  public static void main(String[] args) {

    int[] vetor = { 2, 4, 6, 8, 10 };
    int soma = 0;

    for (int i = 0; i < vetor.length; i++) {
      soma += vetor[i];
    }

    System.out.println("A soma dos elementos do vetor é: " + soma);
  }
}
