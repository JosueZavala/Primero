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

//Clase que servira como generica para desplegar cada sala
public class Salas extends JFrame{
    
    private final JButton sala1=new JButton("Sala 1");
    private final JButton sala2=new JButton("Sala 2");
    private final JButton sala3=new JButton("Sala 3");
    private final JButton sala4=new JButton("Sala 4");
    private final JButton sala5=new JButton("Sala 5");
    private final JButton sala6=new JButton("Sala 6");
    
    LinkedList<JButton>Lista_Salas;
    
    private final JButton volver=new JButton("Volver");
    private final ImageButton home;
    
    //Para generar la sala el constructor recibira como parametro el nombre de la sala
    //Y el numero de salas que tendra
    public Salas(String name, int n_Salas){
        setTitle(name);          
        setSize(new Dimension(500, 250));
        setLocationRelativeTo(null);
        JPanel panel=new JPanel();
        
        
        //Declaracion del vector contenedor de salas
        JButton vector_Salas[]=new JButton[n_Salas];
        
        //Declaracion de tamaño de botones
        Dimension dim=new Dimension(85,45);
        sala1.setPreferredSize(dim);
        sala2.setPreferredSize(dim);
        //sala1.setSize(dim);
        
        
        
        //CASO ESPECIAL
        //Aqui tenemos que declarar nuetro boton como un objeto de la clase ImageButton
        //Para poder instanciar un boton con una imagen de fondo en lugar de un texto
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/Interfaz/Images/hom2.png"));
        home=new ImageButton(iconHome.getImage());
        
        
        
        //Declaracion del Springlayout para controlar la posicion de los elementos por coordenadas.
        Container contenedor=getContentPane(); 
        SpringLayout layout=new SpringLayout();
        contenedor.setLayout(layout);
        
        //Sala 1
        layout.putConstraint(SpringLayout.WEST, sala1, 25, SpringLayout.WEST, contenedor);  //Eje en x
        layout.putConstraint(SpringLayout.NORTH, sala1, 20, SpringLayout.NORTH, contenedor);  //Eje en y
        
        //Sala 2
        layout.putConstraint(SpringLayout.WEST, sala2, 120, SpringLayout.WEST, contenedor);  //Eje en x
        layout.putConstraint(SpringLayout.NORTH, sala2, 20, SpringLayout.NORTH, contenedor);  //Eje en y
        
        //Sala2
        
        
        /*
        int n=0; //variable para definir el numero de sala en el nombre del boton
        
        //For para llenar la lista con el numero de salas que contiene el area.
        for (int i = 0; i < n_Salas; i++) {
            n+=i;
            JButton salan_n=new JButton("Sala "+n);
            salan_n.setPreferredSize(dim);
            Lista_Salas.add(salan_n);
        }
        
        */
        
        //Boton de home
        layout.putConstraint(SpringLayout.WEST, home, 435, SpringLayout.WEST, contenedor);  //Eje en x
        layout.putConstraint(SpringLayout.NORTH, home, 185, SpringLayout.NORTH, contenedor);  //Eje en y
        
        contenedor.add(sala1);
        contenedor.add(sala2);
        contenedor.add(home);
    }
    
    
}
