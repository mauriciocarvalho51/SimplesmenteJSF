package br.com.simplesmente.entidade;

/**
 *
 * @mauricio.victor.carvalho@gmail.com
 */
public class Usuario {
    //public final static int MASCULINO = 1;
    //public final static int FEMININO = 2;
    private String nome;
    private String telefone;
    private String email;
    private String user;
    private String senha;
    private int sexo;
    private String cidade, estado;
    private boolean admin; //<h:selectBooleanCheckbox>

    public Usuario() {
    }

    public Usuario(String nome, String telefone, String email, String user, String senha, int sexo, String cidade, String estado, boolean admin) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.user = user;
        this.senha = senha;
        this.sexo = sexo;
        this.cidade = cidade;
        this.estado = estado;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public String getSexoNome() {
        if(sexo==1)
            return("Masculino");
        return("Feminino");
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getImagemIsAdmin()
    {
        if(isAdmin())
            return ("/faces/resources/imagem/yes.png");
        return ("/faces/resources/imagem/not.png");
    }
    
}
