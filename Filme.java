public class Filme {
   String nome;
   int anoDeLancamento;
   double somaDasAvaliacao;
   int totalDeAvaliacao;
   int duracaoEmMinutos;
   //mudança de cor quando utilizado

   //Metodo
   void exibeFichaTecnica(){
      System.out.println("Nome do filme: " + nome);
      System.out.println("Ano de lançamento: " + anoDeLancamento);
      System.out.println("Duração do filme: " + duracaoEmMinutos);
   }

   void avalia(double nota) {
      somaDasAvaliacao += nota;
      totalDeAvaliacao++;
   }

   double pegaMedia() {
      return somaDasAvaliacao / totalDeAvaliacao;
   }
   //...
}
