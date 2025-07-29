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
        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacao);
        System.out.println(meuFilme.pegaMedia());
    }
}
