public class Carro {
    //Desafio 29/07
    //4
    String nome;
    String marca;
    int anoDeLancamento;
    String cor;
    int somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome do carro: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Cor do carro: " + cor);
    }

    void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double media() {
       return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
