/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author raque
 */
@Named(value = "alunoBean")
@SessionScoped
public class AlunoBean implements Serializable {

    private String nome;
    private String email;

    public void cadastrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
