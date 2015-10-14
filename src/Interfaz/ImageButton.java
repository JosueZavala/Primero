/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author josue
 */
public class ImageButton extends JButton{
    private Image img;
    
    public ImageButton(Image img){
        this.img=img;
        
        Dimension dimension=new Dimension(img.getWidth(null), img.getHeight(null));
        
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);
        
        
    }
    
    public void nuevaDimension(Dimension dm){
        this.setPreferredSize(dm);
        this.setMaximumSize(dm);
        this.setMinimumSize(dm);
        this.setSize(dm);
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
 }
    

    
}
