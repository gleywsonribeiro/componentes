/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.bean;

import br.com.iconeinformatica.componentes.modelo.Funcionario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gleyw
 */
@Named(value = "funcionarioBean")
@SessionScoped
public class FuncionarioBean implements Serializable {

    private static final String[] nomes = {"João", "Maria", "José", "Eduardo", "Sebastião", "Mariana", "Francisco",
        "Manoel", "Fernanda", "Gabriela", "Mário", "Marcos"};

    private static final String[] sobrenomes = {"Souza", "Silva", "Andrade", "Machado", "Júnior", "Albuquerque",
        "Alencar", "Assis", "Batista", "Camargo", "Coelho", "Costa", "Dias", "Rosa", "Leal", "Lima", "Leite"};

    private List<Funcionario> funcionarios;

    public FuncionarioBean() throws ParseException {
        funcionarios = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            adicionarFuncionario();
        }
    }

    private void adicionarFuncionario() {
        String nomeCompleto = getNomeAleatorio() + " " + getSobrenomeAleatorio() + " " + getSobrenomeAleatorio();
        funcionarios.add(new Funcionario(getMatriculaAleatoria(), nomeCompleto, getDataAleatoria(),
                getSalarioAleatorio()));
    }

    private BigDecimal getSalarioAleatorio() {
        return new BigDecimal(1000 + (Math.random() * 29000));
    }

    private Long getMatriculaAleatoria() {
        return (long) (Math.random() * 10000);
    }

    private Date getDataAleatoria() {
        long dezAnosEmMillis = 24 * 60 * 60 * 1000;
        long periodoSorteadoEmMillis = ((long) (Math.random() * 10 * 365)) * dezAnosEmMillis;
        return new Date(System.currentTimeMillis() - periodoSorteadoEmMillis);
    }

    private String getSobrenomeAleatorio() {
        int posicao = (int) Math.round(Math.random() * (sobrenomes.length - 1));
        return sobrenomes[posicao];
    }

    private String getNomeAleatorio() {
        int posicao = (int) Math.round(Math.random() * (nomes.length - 1));
        return nomes[posicao];
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

}
