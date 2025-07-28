public class Carro {
    String nome;
    String marca;
    int anoDeLancamento;
    String ipvaPago;
    int somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome do carro: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("IPVA: " + ipvaPago);
    }

    void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double media() {
       return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
