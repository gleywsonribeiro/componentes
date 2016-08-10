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
 * @author gleyw
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

    private String nome;
    private String telefone;
    private String telefoneComercial;
    private String matricula;

    public UsuarioBean() {
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

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void atualizar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Telefone Comercial:" + this.telefoneComercial);
        System.out.println("Matrícula:" + this.matricula);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Atualizado com sucesso!"));
    }
    
}
