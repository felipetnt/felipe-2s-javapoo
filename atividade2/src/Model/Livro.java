package Model;

public class Livro extends Material {

    private String autor;

    public Livro(String titulo, Integer anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void descricao() {
        System.out.println("Descricao Revista");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano De Publicacao: " + getAnoPublicacao());
        System.out.println("Autor: " + autor);
    }

}
