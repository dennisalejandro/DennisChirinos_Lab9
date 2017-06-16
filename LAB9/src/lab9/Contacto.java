/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.Serializable;

/**
 *
 * @author denni
 */
public class Contacto implements Serializable{

    String Nombre;
    int Edad;
    int Numero;
    String Correo;
    String Direccion;
    String Genero;

    public Contacto(String Nombre, int Edad, int Numero, String Correo, String Direccion, String Genero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Numero = Numero;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
