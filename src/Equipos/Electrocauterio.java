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
public class Electrocauterio extends Equipo{

    public Electrocauterio(String name, String marca, String modelo, String serie, GregorianCalendar primerMto, GregorianCalendar segundoMto) {
        super(name, marca, modelo, serie, primerMto, segundoMto);
    }
    
    public Electrocauterio(){
        super();
    }
    
}
