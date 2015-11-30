/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Equipos.Equipo;
import java.sql.*;
import java.util.LinkedList;


/**
 *
 * @author josue
 */
public class Funciones {
        
    private static Connection conexion;
    public LinkedList<Equipo> equipos;
    public LinkedList<String>Names_salas;
    
    public Funciones(){
        ConexionDB conected = new ConexionDB();
        conexion = conected.GetConnection();
        Names_salas=new LinkedList<>();
    }
    
    public void obtainList(){      
        equipos=new LinkedList<>();
        
        Equipo equipAuxiliar=new Equipo();

        Statement st;
        ResultSet res;
        ResultSetMetaData rsmd;
        int size=0;

        String sql = "select * from QUIROFANO";

        try {
            st = conexion.createStatement();
            res = st.executeQuery(sql);
            rsmd = res.getMetaData();       
            
            
            
            while (res.next()) {
                               
                equipAuxiliar=new Equipo();
                equipAuxiliar.setName  (res.getString(2));
                equipAuxiliar.setSerie (res.getString(3));
                equipAuxiliar.setMarca (res.getString(4));
                equipAuxiliar.setModelo(res.getString(5));
                
                equipos.add(equipAuxiliar);
                size++;
                System.out.println(equipAuxiliar.getName()+" size: "+size);
            }
            
            System.out.println("Filas: "+size);
            conexion.close();
            res.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }    
    
    public int obtainDataOfSalas(String area){
        String area_St=area;
        Statement st;
        ResultSet res;
        
        int size=0;
        int mayor=0;

        String sql = "select * from "+area_St;

        try {
            st = conexion.createStatement();
            res = st.executeQuery(sql);          
            Names_salas=new LinkedList<>();
            String name_aux; 
            
            while (res.next()) {
                name_aux="";
                if(mayor<res.getInt(2)){
                    mayor=res.getInt(2);
                    name_aux=res.getString(3);
                    Names_salas.add(name_aux);
                    System.out.println("Vamos en size: "+mayor);
                    System.out.println(Names_salas.getLast());
                }
                size=mayor;
                
                
                //Obtener nombres de las salas
            }
            
            System.out.println("Filas: "+size);
            conexion.close();
            res.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return size;
    }

    public LinkedList<String> getNames_salas() {
        return Names_salas;
    }
    
    
   
}
