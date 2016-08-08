/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author raque
 */
@Named(value = "cadastroUsuarioBean")
@SessionScoped
public class CadastroUsuarioBean implements Serializable {
    private String nome;
    private String login;
    
    public void verficarDisponibilidadeLogin() {
        FacesMessage msg;
        System.out.println("verificando disponibilidade: " + this.login);
        //Simulando processamento
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        if("gleywson".equals(this.login)) {
            msg = new FacesMessage("Login já está em uso!");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
        } else {
            msg = new FacesMessage("Login disponível.");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
    
    public void cadastrar() {
        System.out.println("Login: " + login);
        System.out.println("Nome: " + nome);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado!"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
}
