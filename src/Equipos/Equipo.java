package Equipos;

import java.util.GregorianCalendar;

/**
 *
 * @author josue
 */

//CLASE QUE NOS SERVIRA PARA CREAR TODOS LOS EQUIPOS MEDICOS (CLASE PADRE)

public class Equipo {
    private String              name, marca, modelo, serie;
    private GregorianCalendar   primerMto;
    private GregorianCalendar   segundoMto;
    public  int                 sala;
    public  String[]             datosGrales = {"","","","S/N"}; //Nombre, marca, modelo, serie.
    public  GregorianCalendar[]  mantenimiento = new GregorianCalendar[2];

    public Equipo() {
        name="";
        marca="";
        modelo="";
        serie="S/N";
        primerMto=new GregorianCalendar(2015, 01, 06);
        segundoMto=new GregorianCalendar(2015, 07, 07);
    }
    
    //public Equipo(Object... n){
    public Equipo(String name, String marca, String modelo, String serie, GregorianCalendar primerMto, GregorianCalendar segundoMto) {
        this.name = name;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.primerMto = primerMto;
        this.segundoMto = segundoMto;
        /*for (int i = 0; i < 4; i++)
        datosGrales[i] = (String) n[i];
        mantenimiento[0] = (GregorianCalendar) n[4];
        mantenimiento[1] = (GregorianCalendar) n[5];*/
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

    
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }

    
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
    
    
}
