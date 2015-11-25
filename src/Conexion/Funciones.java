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
    
    public Funciones(){
        
    }
    
    public void mostrar(){
        
        ConexionDB conected = new ConexionDB();
        conexion = conected.GetConnection();
        equipos=new LinkedList<>();
        
        Equipo equipAuxiliar=new Equipo();

        Statement st;
        ResultSet res;

        String sql = "select * from QUIROFANO";

        try {
            st = conexion.createStatement();
            res = st.executeQuery(sql);

            while (res.next()) {
                               
                equipAuxiliar=new Equipo();
                equipAuxiliar.setName  (res.getString(1));
                equipAuxiliar.setSerie (res.getString(2));
                equipAuxiliar.setMarca (res.getString(3));
                equipAuxiliar.setModelo(res.getString(4));
                
                equipos.add(equipAuxiliar);
            }
            
            conexion.close();
            res.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }    
    
}
