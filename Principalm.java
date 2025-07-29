public class Principalm {
    //DADOS DE UMA MÚSICA
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Karma";
        musica.artista = "2BYG";
        musica.anoLancamento = 2025;

        musica.exibeFichaTecnica();
        musica.avaliacao(7);
        musica.avaliacao(10);
        musica.avaliacao(5);
        System.out.println("Média das avalições: " + musica.mediaAvaliacoes);
    }
}
