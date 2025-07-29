public class Filme {
   String nome;
   int anoDeLancamento;
   //MUDANÇA DE COR QUANDO UTILIZADO
   //MODIFICADORES DE ACESSO
   private double somaDasAvaliacao;
   private int totalDeAvaliacao;
   //...

   //METODO ACESSOR
   int getTotalDeAvaliacao(){
      return totalDeAvaliacao;
   }
   //...

   int duracaoEmMinutos;

   //METODOS
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
