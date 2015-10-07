/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Container;
import java.awt.Dimension;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author josue
 */

//Clase que servira como generica para desplegar las salas
public class Area extends JFrame{
    
    /*private final JButton sala1=new JButton("Sala 1");
    private final JButton sala2=new JButton("Sala 2");
    private final JButton sala3=new JButton("Sala 3");
    private final JButton sala4=new JButton("Sala 4");
    private final JButton sala5=new JButton("Sala 5");
    private final JButton sala6=new JButton("Sala 6");
    */
    
    LinkedList<JButton>Lista_Salas;
    
    private final JButton volver=new JButton("Volver");
    private final ImageButton home;
    JButton salan_n=new JButton();
    
    //Para generar la sala el constructor recibira como parametro el nombre de la sala
    //Y el numero de salas que tendra
    public Area(String name, int n_Salas){
        //Titulo tamaño y orientacion del Frame
        Lista_Salas=new LinkedList<JButton>();
        setTitle(name);          
        setSize(new Dimension(500, 250));
        setLocationRelativeTo(null);
        JPanel panel=new JPanel();
        
        //Objeto para definir el tamaño de los botones
        Dimension dim=new Dimension(85,45);
        
        int n=0; //variable para definir el numero de sala en el nombre del boton
        
        //For para llenar la lista con el numero de salas que contiene el area.
        for (int i = 0; i < n_Salas; i++) {
            int c=1+i;
            salan_n=new JButton("Sala "+c);
            //Declaracion de tamaño de botones
            salan_n.setPreferredSize(dim);
            Lista_Salas.push(salan_n);
            System.out.println("Sala "+c+" Agregada");
        }
        
        //Declaracion del Springlayout para controlar la posicion de los elementos por coordenadas.
                Container contenedor=getContentPane(); 
        SpringLayout layout=new SpringLayout();
        contenedor.setLayout(layout);
        
        int ix=15;
        int iy=20;
        while (!Lista_Salas.isEmpty()) {                        
            
            layout.putConstraint(SpringLayout.WEST, Lista_Salas.getLast(), (ix), SpringLayout.WEST, contenedor);  //Eje en x
            layout.putConstraint(SpringLayout.NORTH, Lista_Salas.getLast(), (iy), SpringLayout.NORTH, contenedor);  //Eje en y            
            
            System.out.println("ix: "+ix);
            contenedor.add(Lista_Salas.removeLast());
            
            ix=ix+95;
            
        }
        
        System.out.println("ya salio");
        
        
        //CASO ESPECIAL
        //Aqui tenemos que declarar nuetro boton como un objeto de la clase ImageButton
        //Para poder instanciar un boton con una imagen de fondo en lugar de un texto
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/Interfaz/Images/hom2.png"));
        home=new ImageButton(iconHome.getImage());
        
        
//        

//        
//        //Sala 1
//        layout.putConstraint(SpringLayout.WEST, sala1, 25, SpringLayout.WEST, contenedor);  //Eje en x
//        layout.putConstraint(SpringLayout.NORTH, sala1, 20, SpringLayout.NORTH, contenedor);  //Eje en y
//        
//        //Sala 2
//        layout.putConstraint(SpringLayout.WEST, sala2, 120, SpringLayout.WEST, contenedor);  //Eje en x
//        layout.putConstraint(SpringLayout.NORTH, sala2, 20, SpringLayout.NORTH, contenedor);  //Eje en y
//        
//        //Sala2
//        
//              
//        //Boton de home
//        layout.putConstraint(SpringLayout.WEST, home, 435, SpringLayout.WEST, contenedor);  //Eje en x
//        layout.putConstraint(SpringLayout.NORTH, home, 185, SpringLayout.NORTH, contenedor);  //Eje en y
//        
//        contenedor.add(sala1);
//        contenedor.add(sala2);
       contenedor.add(home);
    }
    
    
}
