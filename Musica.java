public class Musica {
    //Desafio 29/07
    //3
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int mediaAvaliacoes;
    int totalAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artísta: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliacao(double nota) {
        mediaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double media() {
        return mediaAvaliacoes / totalAvaliacoes;
    }
}
