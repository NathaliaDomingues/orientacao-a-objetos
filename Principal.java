import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //tipo referência
        Filme meuFilme = new Filme();
        //...

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("O total de avaliações é " + meuFilme.getTotalDeAvaliacao());
        System.out.println("A média é " + meuFilme.pegaMedia());
    }
}