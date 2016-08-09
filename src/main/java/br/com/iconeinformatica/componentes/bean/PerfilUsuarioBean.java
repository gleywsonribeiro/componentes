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
    public static final List<Interesse> INTERESSES = new ArrayList<>();
    
    static {
        INTERESSES.add(new Interesse("Esportes", "esportes"));
        INTERESSES.add(new Interesse("Cinema", "cinema"));
        INTERESSES.add(new Interesse("Computação", "computacao"));
        INTERESSES.add(new Interesse("Leitura", "leitura"));
    }
    
    private List<String> estados = new ArrayList<>();
    private List<String> cidades = new ArrayList<>();
    private List<String> interessesDoUsuario = new ArrayList<>();
    
    private List<String> paises = new ArrayList<>();
    
    private String login;
    private String senha;
    private String nome;
    private String sobre;
    private Date dataNascimento;
    private String profissao;
    private Interesse interesse;
    private String estado;
    private String cidade;
    private String sexo;
    private String estadoCivil;
    private String pais;

    public PerfilUsuarioBean() {
        estados.add("PA");
        estados.add("MG");
        estados.add("SP");
        paises.add("Brasil");
        paises.add("Bélgica");
        paises.add("Colômbia");
        paises.add("Dinamarca");
        paises.add("Chile");
        paises.add("Espanha");
        paises.add("França");
        paises.add("Alemanha");
        paises.add("Argélia");
        paises.add("Armênia");
    }

    public List<String> getEstados() {
        return estados;
    }

    public List<String> getCidades() {
        return cidades;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void carregarCidades() {
        cidades.clear();
        if(null != estado) switch (estado) {
            case "PA":
                cidades.add("Abaetetuba");
                cidades.add("Belém");
                cidades.add("Barcarena");
                break;
            case "MG":
                cidades.add("Blumenau");
                cidades.add("Belo Horizonte");
                break;
            case "SP":
                cidades.add("São Paulo");
                cidades.add("Cubatão");
                cidades.add("Guarulhos");
                break;
            default:
                break;
        }
        
    }
    public void atualizar() {
//        System.out.println("Senha: " + this.senha);
//        System.out.println("Sobre: " + this.sobre);
//        System.out.println("Data de Nascimento: " + this.dataNascimento);
//        System.out.println("Profissão: " + this.profissao);
//        System.out.println("Interesse: " + this.interesse.getDescricao());
//        System.out.println("sexo: " + this.sexo);
//        System.out.println("Estado civil: " + this.estadoCivil);
        for (String i : interessesDoUsuario) {
            System.out.println("Interesse: " + i);
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado"));
    }

    public String getEstado() {
        return estado;
    }

    public List<String> getInteressesDoUsuario() {
        return interessesDoUsuario;
    }

    public void setInteressesDoUsuario(List<String> interessesDoUsuario) {
        this.interessesDoUsuario = interessesDoUsuario;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Interesse getInteresse() {
        return interesse;
    }

    public List<Interesse> getInteresses() {
        return INTERESSES;
    }
    
    public void setInteresse(Interesse interesse) {
        this.interesse = interesse;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
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
    
    public List<String> sugerirPaises(String consulta) {
        System.out.println("Consultando: " + consulta);
        List<String> paisesSugeridos = new ArrayList<>();
        for(String paisIndex:this.paises) {
            if(paisIndex.toLowerCase().startsWith(consulta.toLowerCase())) {
                paisesSugeridos.add(paisIndex);
            }
        }
        return paisesSugeridos;
    }
}
