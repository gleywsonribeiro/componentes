/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iconeinformatica.componentes.converter;

import br.com.iconeinformatica.componentes.bean.PerfilUsuarioBean;
import br.com.iconeinformatica.componentes.modelo.Pais;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author gleyw
 */
@FacesConverter(value = "paisConverter")
public class PaisConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
       if(value != null) {
           Integer codigo = Integer.valueOf(value);
            for(Pais pais:PerfilUsuarioBean.PAISES) {
                if(codigo.equals(pais.getCodigo())) {
                    return pais;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if(obj != null && !obj.equals("")) {
            Pais pais = (Pais) obj;
            return String.valueOf(pais.getCodigo());
        }
        return null;
    }
    
}
