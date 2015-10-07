/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salas;


import Equipos.Lamapara_Cirugia;
import Equipos.Maquina_Anestesia;
import Equipos.Mesa_Cirugia;
import Equipos.Monitor;

/**
 *
 * @author josue
 */
public class Sala_Quirofano extends Sala{
    
    private Monitor monitor1;
    private Mesa_Cirugia mesa_C;
    private Maquina_Anestesia maq_Anes;
    
    private Lamapara_Cirugia lamp;
    private Lamapara_Cirugia lamp2;
    
    
    public Sala_Quirofano(String nom_Area) {
        super(nom_Area);
        monitor1=new Monitor();
    }
    
    
}
