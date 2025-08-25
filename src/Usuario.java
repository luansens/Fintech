import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private String fotoDePerfilUrl;
    private String senha;


    public Usuario() {
    }


    public Usuario(int id, String nome, String documento, LocalDate dataNascimento,
                   String fotoDePerfilUrl, String senha) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.fotoDePerfilUrl = fotoDePerfilUrl;
        this.senha = senha;
    }


    public void registrarUsuario() {
        System.out.println("Método registrarUsuario chamado. Usuário: " + nome);
    }

    public void atualizarPerfil() {
        System.out.println("Método atualizarPerfil chamado. Usuário: " + nome);
    }

    public void adicionarConta() {
        System.out.println("Método adicionarConta chamado. Usuário: " + nome);
    }

    public void adicionarInvestimento() {
        System.out.println("Método adicionarInvestimento chamado. Usuário: " + nome);
    }

    public void definirObjetivoFinanceiro() {
        System.out.println("Método definirObjetivoFinanceiro chamado. Usuário: " + nome);
    }

    public void receberNotificacao() {
        System.out.println("Método receberNotificacao chamado. Usuário: " + nome);
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getFotoDePerfilUrl() {
        return fotoDePerfilUrl;
    }

    public String getSenha() {
        return senha;
    }
}
