/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author gleyw
 */
@Named(value = "perfilUsuarioBean")
@SessionScoped
public class PerfilUsuarioBean implements Serializable {
    private String login;
    private String senha;
    private String nome;
    private String sobre;
    private Date dataNascimento;
    
    public void atualizar() {
        System.out.println("Senha: " + this.senha);
        System.out.println("Sobre: " + this.sobre);
        System.out.println("Data de Nascimento " + this.dataNascimento);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado"));
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public Date getDataHoje() {
        return new Date();
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<String> completarTexto(String consulta) {
        List<String> resultados = new ArrayList<>();
        
        if(consulta.startsWith("Gle")) {
            resultados.add("Gleywson");
            resultados.add("Gleywson Ribeiro");
            resultados.add("Gleywson da Conceição Ribeiro");
            resultados.add("Gleywson do Metropolitano");
            resultados.add("Gleywson da Raquel");
        }
        
        return resultados; 
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
