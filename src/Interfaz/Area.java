/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author josue
 */

//Clase que servira como generica para desplegar las salas
public class Area extends JFrame{
   
    private final int POS_X_INICIAL=20;
    private final int POS_Y_INICIAL=20;
    private final int ESP_BTN_VERT=10;
    private final int ESP_BTN_HOR=95;
    
    
    LinkedList<JButton>Lista_Salas;
    LinkedList<String>Name_Salas;
    
    //private final JButton homeButton=new JButton("Volver");
    private final ImageButton home;
    private final ImageButton volver;
    JButton salan_n=new JButton();      //Inicializador de botones que entraran en la linked list.
    
    JFrame menuAuxiliar;
    JFrame localAuxiliar;
    
    //Para generar la sala el constructor recibira como parametro el nombre de la sala
    //Y el numero de salas que tendra
    public Area(String name, int n_Salas,LinkedList<String>N_salas,JFrame menu){
        //Titulo tamaño y orientacion del Frame
        Lista_Salas=new LinkedList<JButton>();
        Name_Salas=N_salas;
        
        
        setTitle(name);          
        setSize(new Dimension(500, 280));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel=new JPanel();
        menuAuxiliar=menu;
        localAuxiliar=this;
        
        //Objeto para definir el tamaño de los botones
        Dimension dim=new Dimension(85,45);
        
        int n=0; //variable para definir el numero de sala en el nombre del boton
        
        //For para llenar la lista con el numero de salas que contiene el area.
        for (int i = 0; i < n_Salas; i++) {
            int c=1+i;
            //salan_n=new JButton("Sala "+c);
            salan_n=new JButton(Name_Salas.pollFirst());
            //Declaracion de tamaño de botones
            salan_n.setPreferredSize(dim);
            Lista_Salas.push(salan_n);
            //System.out.println("Sala "+c+" Agregada");
        }
        
        //Declaracion del Springlayout para controlar la posicion de los elementos por coordenadas.
        Container contenedor=getContentPane(); 
        SpringLayout layout=new SpringLayout();
        contenedor.setLayout(layout);
        
        int ix=POS_X_INICIAL;
        int iy=POS_Y_INICIAL;
        
        while (!Lista_Salas.isEmpty()) {                        
            
            layout.putConstraint(SpringLayout.WEST, Lista_Salas.getLast(), (ix), SpringLayout.WEST, contenedor);  //Eje en x
            layout.putConstraint(SpringLayout.NORTH, Lista_Salas.getLast(), iy, SpringLayout.NORTH, contenedor);  //Eje en y            
            
            ix+=ESP_BTN_HOR;
            
            if(ix>=(ESP_BTN_HOR+395)){  //Valor que toma cuando acomoda el quinto elemento de tipo sala
                                        //if utilizado para saltar de renglon.
                ix=POS_X_INICIAL;
                //System.out.println(dim.height);        //Objeto tipo Dimension, declarado anteriormente para instanciar el tamaño de los botones
                iy+=dim.height+ESP_BTN_VERT;
            }
            
            String t_Para_Sala=Lista_Salas.getLast().getText();
            
            Lista_Salas.getLast().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Sala n=new Sala(t_Para_Sala, 4, menuAuxiliar, localAuxiliar);
                    n.setVisible(true);
                    setVisible(false);
                }
            });
            
            contenedor.add(Lista_Salas.removeLast());
        }
        
        //System.out.println("ya salio");
        
        
        //CASOS ESPECIALES
        //Aqui tenemos que declarar nuetro boton como un objeto de la clase ImageButton
        //Para poder instanciar un boton con una imagen de fondo en lugar de un texto
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/Interfaz/Images/hom2.png"));
        home=new ImageButton(iconHome.getImage());
        
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/Interfaz/Images/volver.png"));
        volver=new ImageButton(iconBack.getImage());
        
        
        
        
        //Boton de home, y back
        layout.putConstraint(SpringLayout.WEST, home, 435, SpringLayout.WEST, contenedor);  //Eje en x
        layout.putConstraint(SpringLayout.NORTH, home, 200, SpringLayout.NORTH, contenedor);  //Eje en y
        
        layout.putConstraint(SpringLayout.WEST, volver, 20, SpringLayout.WEST, contenedor);  //Eje en x
        layout.putConstraint(SpringLayout.NORTH, volver, 200, SpringLayout.NORTH, contenedor);  //Eje en y
        
        home.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(true);
                setVisible(false);
            }
        });
        
        volver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(true);
                setVisible(false);
            }
        });
        
       contenedor.add(home);
       contenedor.add(volver);
    }
    
    
    
    
}
