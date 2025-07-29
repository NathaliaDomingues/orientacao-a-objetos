public class Principal {
    public static void main(String[] args) {
        //INFORMAÇÕES DE UM FILME
        //tipo referência
        Filme meuFilme = new Filme();
        //...

        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

       meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(9);
        System.out.println("O total de avaliações é " + meuFilme.getTotalDeAvaliacao());
        System.out.println("A média é " + meuFilme.pegaMedia());
    }
}
