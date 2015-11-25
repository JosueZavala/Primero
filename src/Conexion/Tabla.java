/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author josue
 */
public class Tabla extends JFrame{
    
    public DefaultTableModel dtm;
    
    public Tabla(Object [][] inf) {
        
        Object [][] datos=inf;
        String[] columnNames = {"Equipo","Numero de Serie","Marca","Modelo"};
        
        dtm= new DefaultTableModel(datos,columnNames);
        
        final JTable table = new JTable(dtm);
        
        // Agregar nueva columna
        //String[] columnaNueva1= {"vago","diestro","normal",};
        //dtm.addColumn("Tipo",columnaNueva1);
        
        // Agregar nueva fila
        //Object[] newRow={"Maria",new Integer(55),new Boolean(false)};
        //dtm.addRow(newRow);
        
        // Modificar celda especifica
        //dtm.setValueAt("XXX", 3, 3); // Row/Col
        //table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){System.exit(0);}
            });
    
    }
}
