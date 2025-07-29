public class Main {
    public static void main(String[] args) {
        //INFORMAÇÕES DE UM CARRO
        Carro carro = new Carro();

        carro.nome = "Fusca";
        carro.marca = "Volkswagen";
        carro.anoDeLancamento = 1938;
        carro.cor = "Azul marinho";

        carro.exibeFichaTecnica();
        carro.avaliacao(9);
        carro.avaliacao(3);
        carro.avaliacao(10);
        System.out.println("Soma das avaliações: " + carro.somaDasAvaliacoes);
        System.out.println("Total das avaliações: " + carro.totalDeAvaliacoes);
        System.out.println("Média da avaliações: " + carro.media());
    }
}
