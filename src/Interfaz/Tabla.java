package Interfaz;

import Equipos.Equipo;
import java.util.GregorianCalendar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla {
    String[] columnas = {"Nombre","Marca","Modelo","Serie","1er Mantenimiento","2do Mantenimiento"};
    GregorianCalendar aux = new GregorianCalendar(2015, 10, 15);
    Equipo[] datos = {
        new Equipo("Kathy","Smith","Snowboarding","5",aux,aux),
        new Equipo("John","Doe","Rowing","3",aux,aux),
        new Equipo("Sue","Black","Knitting","12",aux,aux),
        new Equipo("Jane","White","Speed reading","20",aux,aux),
        new Equipo("Joe","Brown","Pool","10",aux,aux),
    };
    Tabla(){
        JTable table = new JTable(datos.length, columnas.length);
        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < 10; j++) {
                //table.setValueAt(datos., j, j);
            }
        }
    }
}
