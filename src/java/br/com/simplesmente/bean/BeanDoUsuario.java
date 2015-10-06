package br.com.simplesmente.bean;

import br.com.simplesmente.entidade.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @mauricio.victor.carvalho@gmail.com
 */
@ManagedBean
@SessionScoped
public class BeanDoUsuario {
    private List<Usuario> listadeusuarios;
    private Usuario usuarioatual;
    
    public BeanDoUsuario() {
        listadeusuarios = new ArrayList<>();
        usuarioatual = new Usuario();
    }

    public List<Usuario> getListadeusuarios() {
        return listadeusuarios;
    }

    public Usuario getUsuarioatual() {
        return usuarioatual;
    }

    public void setUsuarioatual(Usuario usuarioatual) {
        this.usuarioatual = usuarioatual;
    }
    
    public String cadastrarUsuario() {
        listadeusuarios.add(usuarioatual);
        usuarioatual = new Usuario();
        return("/Web-content/usuario/usuariotabela");
    }    
    
    public String removerUsuario(){
        listadeusuarios.remove(usuarioatual);
        return ("/Web-content/usuario/usuariotabela");
    }

    public String updateUsuario() {
        usuarioatual.setNome(usuarioatual.getNome());
        usuarioatual.setTelefone(usuarioatual.getTelefone());
        usuarioatual.setEmail(usuarioatual.getEmail());
        usuarioatual.setUser(usuarioatual.getUser());
        usuarioatual.setSenha(usuarioatual.getSenha());
        usuarioatual.setSexo(usuarioatual.getSexo());
        usuarioatual.setEstado(usuarioatual.getEstado());
        usuarioatual.setCidade(usuarioatual.getCidade());
        usuarioatual.setAdmin(usuarioatual.isAdmin());
        return ("/Web-content/usuario/usuariotabela");
    }

    public void limparCampos() {
        this.usuarioatual.setNome("");
        this.usuarioatual.setTelefone("");
        this.usuarioatual.setUser("");
        this.usuarioatual.setEmail("");
        this.usuarioatual.setSenha("");
        this.usuarioatual.setEstado("");
    }


}
