/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipos;

import java.util.GregorianCalendar;

/**
 *
 * @author josue
 */

//CLASE QUE NOS SERVIRA PARA CREAR TODOS LOS EQUIPOS MEDICOS (CLASE PADRE)

public class Equipo {
    private String name;
    private String marca;
    private String modelo;
    private String serie;
    private GregorianCalendar primerMto;
    private GregorianCalendar segundoMto;

    public Equipo() {
        name="";
        marca="";
        modelo="";
        serie="S/N";
        primerMto=new GregorianCalendar(2015, 01, 06);
        segundoMto=new GregorianCalendar(2015, 07, 07);
    }
 
    
    public Equipo(String name, String marca, String modelo, String serie, GregorianCalendar primerMto, GregorianCalendar segundoMto) {
        this.name = name;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.primerMto = primerMto;
        this.segundoMto = segundoMto;
    }
    

    public GregorianCalendar getSegundoMto() {
        return segundoMto;
    }

    public void setSegundoMto(GregorianCalendar segundoMto) {
        this.segundoMto = segundoMto;
    }
     

    public GregorianCalendar getPrimerMto() {
        return primerMto;
    }

    public void setPrimerMto(GregorianCalendar primerMto) {
        this.primerMto = primerMto;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
    
}
