public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Fusca";
        carro.marca = "Volkswagen";
        carro.anoDeLancamento = 1938;
        carro.ipvaPago = "Não é mais cobrado no Brasil";

        carro.exibeFichaTecnica();
        carro.avaliacao(9);
        carro.avaliacao(3);
        carro.avaliacao(10);
        System.out.println(carro.somaDasAvaliacoes);
        System.out.println(carro.totalDeAvaliacoes);
        System.out.println(carro.media());
    }
}
