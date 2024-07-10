import br.com.alura.screenmatch.modelos.Filmes;

public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        /*meuFilme.SomaDasAvaliacao = 10;
        meuFilme.SomaDasAvaliacao = 1;
        System.out.println(meuFilme.pegaMedia());*/
    }
}