/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author gleyw
 */
@FacesConverter("interesseConverter")
public class InteresseConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null) {
            for(Interesse interesse:PerfilUsuarioBean.INTERESSES) {
                if(value.equals(interesse.getNomeIcone())) {
                    return interesse;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if(o != null) {
            Interesse interesse = (Interesse) o;
            return interesse.getNomeIcone();
        }
        return null;
    }
    
}
