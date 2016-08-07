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
@Named(value = "inversaoNomeBean")
@SessionScoped
public class InversaoNomeBean implements Serializable {

    private String nome;
    private String nomeInvertido;
    private int quantidadeDePalavras;
    
    public void inverter() {
        this.nomeInvertido = "";
        this.quantidadeDePalavras = 0;
        
        if(this.nome != null && !this.nome.isEmpty()) {
            this.quantidadeDePalavras = 1;
        }
        
        for(int i = this.nome.length() - 1; i >= 0; i--) {
            char letra = this.nome.charAt(i);
            this.nomeInvertido += letra;
            if(letra == ' ') {
                this.quantidadeDePalavras++;
            }
        }
        System.out.println("Nome invertido: " + this.nomeInvertido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeInvertido() {
        return nomeInvertido;
    }

    public void setNomeInvertido(String nomeInvertido) {
        this.nomeInvertido = nomeInvertido;
    }

    public int getQuantidadeDePalavras() {
        return quantidadeDePalavras;
    }

    public void setQuantidadeDePalavras(int quantidadeDePalavras) {
        this.quantidadeDePalavras = quantidadeDePalavras;
    }
    
    
}
