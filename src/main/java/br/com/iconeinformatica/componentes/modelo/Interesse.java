/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.modelo;

/**
 *
 * @author gleyw
 */
public class Interesse {
    private String descricao;
    private String nomeIcone;

    public Interesse(String descricao, String nomeIcone) {
        this.descricao = descricao;
        this.nomeIcone = nomeIcone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeIcone() {
        return nomeIcone;
    }

    public void setNomeIcone(String nomeIcone) {
        this.nomeIcone = nomeIcone;
    }
    
    
}
