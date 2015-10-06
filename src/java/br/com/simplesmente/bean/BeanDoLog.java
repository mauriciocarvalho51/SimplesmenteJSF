/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplesmente.bean;

import br.com.simplesmente.entidade.Log;
import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @mauricio.victor.carvalho@gmail.com
 */
@ManagedBean
@SessionScoped
public class BeanDoLog {
    private List<Log> administradores;
    private Log admlogado;
    
    /**
     * Creates a new instance of BeanDoLog
     */
    public BeanDoLog() {
        administradores = Arrays.asList(
            new Log("administrador","12345"), 
            new Log("root","12345"),
            new Log("admin","admin"));
        admlogado = new Log();
        
    }

    public List<Log> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Log> administradores) {
        this.administradores = administradores;
    }

    public Log getAdmlogado() {
        return admlogado;
    }

    public void setAdmlogado(Log admlogado) {
        this.admlogado = admlogado;
    }
        
    public String verificaLogin(){
        if(administradores.contains(admlogado))
        {
            return "Web-content/usuario/usuarioformulario";
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage mensagem = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, 
                    "Login inválido!", 
                    "Usuário ou senha inválidos!");
            context.addMessage(null, mensagem);
            return("index");
        }
    }
    
}
