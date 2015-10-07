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
public class Maquina_Anestesia extends Equipo{

    public Maquina_Anestesia(String name, String marca, String modelo, String serie, GregorianCalendar primerMto, GregorianCalendar segundoMto) {
        super(name, marca, modelo, serie, primerMto, segundoMto);
    }
    
    public Maquina_Anestesia(){
        super();
    }
}
