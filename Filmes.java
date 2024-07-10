package br.com.alura.screenmatch.modelos;

public class Filmes {
    private String nome; // Assim como alguém criou a classe filme, foi criada a classe String por isso ela não esta marcada com uma cor
    private int anoDeLancamento; //não quero que seja alterado
    private boolean incluidoNoPlano;
    private double SomaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public int getTotalDeAvaliacoes(){ //Get = obter valor e Set = atribuir valor
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome; /* “This”, traduzindo para o português (Isto/este/esta),
                             é usado para fazer referência aos atributos da classe, especialmente em
                            métodos que têm parâmetros com o mesmo nome do atributo da classe em que
                            estamos trabalhando. Podemos concluir então que “this” se refere ao objeto
                            atual e não ao parâmetro do método.*/
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de Lançamento " + anoDeLancamento);
        System.out.println("Duração em minutos " + duracaoEmMinutos);
    }

   public void avalia(double nota){
        SomaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return SomaDasAvaliacao / totalDeAvaliacoes;

    }
}
