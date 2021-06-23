/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alex Zumba
 */
public class PanelFigura extends JPanel {
    
    public Figura figura;
    private int tipoFigura;
    
    public PanelFigura() {
        setBounds(0, 0, 500, 500);
        figura = new Figura(0, 0, 200, 200);
        tipoFigura = 0;
    }
    
    @Override
    public void paint(Graphics lienzo){
        lienzo.clipRect(0, 0, 500, 500);
        lienzo.setColor(Color.blue);
        
        switch(tipoFigura){
            case 1: lienzo.drawLine(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
            break;
            case 2: lienzo.drawRect(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
                break;
            case 3: lienzo.drawOval(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
                break;
            case 4: lienzo.drawRoundRect(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto(), 50, 50);
                break;
        } 
    
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public int getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(int tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    
}
