package Model;

public class Usuario extends Pessoa {

    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Informacoes Usuario");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matricula" + matricula);
    }
}
