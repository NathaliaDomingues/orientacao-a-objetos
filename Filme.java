package br.com.alura.screenmatch.modelos;

public class Filme {
   private String nome;
   private int anoDeLancamento;
   private boolean incluidoNoPlano;
   private int duracaoEmMinutos;
   //MUDANÇA DE COR QUANDO UTILIZADO
   //MODIFICADORES DE ACESSO
   private double somaDasAvaliacao;
   private int totalDeAvaliacao;
   //...


   //METODO ACESSOR
   public int getTotalDeAvaliacao(){
      return totalDeAvaliacao;
   }
   //...


   //SETTERS
   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setAnoDeLancamento(int anoDeLancamento) {
      this.anoDeLancamento = anoDeLancamento;
   }

   public void setDuracaoEmMinutos(int duracaoEmMinutos) {
      this.duracaoEmMinutos = duracaoEmMinutos;
   }

   public void setIncluidoNoPlano(boolean incluidoNoPlano) {
      this.incluidoNoPlano = incluidoNoPlano;
   }
   //...


   //METODOS
   public void exibeFichaTecnica(){
      System.out.println("Nome do filme: " + nome);
      System.out.println("Ano de lançamento: " + anoDeLancamento);
      System.out.println("Duração do filme: " + duracaoEmMinutos);
   }

   public void avalia(double nota) {
      somaDasAvaliacao += nota;
      totalDeAvaliacao++;
   }

   public double pegaMedia() {
      return somaDasAvaliacao / totalDeAvaliacao;
   }
   //...
}