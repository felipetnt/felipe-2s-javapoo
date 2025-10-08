package Model;


public class Revista extends Material{

    private Integer edicao;

    public Revista(String titulo, Integer anoPublicacao, Integer edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Descricao Revista");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano De Publicacao: " + getAnoPublicacao());
        System.out.println("Edicao: " + edicao);
    }
}
