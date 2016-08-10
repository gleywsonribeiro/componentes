/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.bean;

import br.com.iconeinformatica.componentes.modelo.Interesse;
import br.com.iconeinformatica.componentes.modelo.Pais;
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
    public static final List<Pais> PAISES = new ArrayList<>();

    static {
        PAISES.add(new Pais(1, "Argélia"));
        PAISES.add(new Pais(2, "Armênia"));
        PAISES.add(new Pais(3, "Belize"));
        PAISES.add(new Pais(4, "Brasil"));
        PAISES.add(new Pais(5, "Bósnia Hezergovina"));
        PAISES.add(new Pais(6, "Estados Unidos"));
        PAISES.add(new Pais(7, "Austrália"));
        PAISES.add(new Pais(9, "Rússia"));
        PAISES.add(new Pais(10, "Alemanha"));
    }

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
    private String telefone;
    private String telefoneComercial;
    private String matricula;
    private String sobre;
    private Date dataNascimento;
    private String profissao;
    private Interesse interesse;
    private String estado;
    private String cidade;
    private String sexo;
    private Pais pais;
    private String estadoCivil;

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

    public List<String> getPaises() {
        return paises;
    }

    public void setPaises(List<String> paises) {
        this.paises = paises;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
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
        if (null != estado) {
            switch (estado) {
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

    }

    public void atualizar() {
//        System.out.println("Senha: " + this.senha);
//        System.out.println("Sobre: " + this.sobre);
//        System.out.println("Data de Nascimento: " + this.dataNascimento);
//        System.out.println("Profissão: " + this.profissao);
//        System.out.println("Interesse: " + this.interesse.getDescricao());
//        System.out.println("sexo: " + this.sexo);
//        System.out.println("Estado civil: " + this.estadoCivil);
//        for (String i : interessesDoUsuario) {
//            System.out.println("Interesse: " + i);
//        }
//        if(this.pais == null) {
//            addMessage("Perfil atualizado sem país");
//        } else {
//            addMessage("Perfil atualizado com país: " + pais.getNome() +
//                    "(" + this.pais.getCodigo() + ")");
//        }
        addMessage("Atualizado com sucesso!");
    }

    private void addMessage(String msg) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
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

        if (consulta.startsWith("Gle")) {
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
        for (String paisIndex : this.paises) {
            if (paisIndex.toLowerCase().startsWith(consulta.toLowerCase())) {
                paisesSugeridos.add(paisIndex);
            }
        }
        return paisesSugeridos;
    }

    public List<Pais> sugerirPaisesPOJO(String consulta) {

        List<Pais> paisesSugeridos = new ArrayList<>();
        for (Pais paisIndex : PAISES) {
            if (paisIndex.getNome().toLowerCase().startsWith(consulta.toLowerCase())) {
                paisesSugeridos.add(paisIndex);
            }
        }
        return paisesSugeridos;
    }
}
