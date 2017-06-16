/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author denni
 */
public class Mensaje implements Serializable {

    String Emisor;
    String Receptor;
    Date Fecha;
    String Contenido;

    public Mensaje(String Emisor, String Receptor, Date Fecha, String Contenido) {
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Fecha = Fecha;
        this.Contenido = Contenido;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    @Override
    public String toString() {
        return "Mensaje para: " + Receptor;
    }

}
