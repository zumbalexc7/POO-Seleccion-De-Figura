/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alex Zumba
 */
public class VentanaFigura extends JFrame {
    
    public PanelFigura panelFigura;
    public JPanel panelBotones;
    public JButton btnLinea;
    public JButton btnCuadrado;
    public JButton btnCirculo;
    public JButton btnCirculoCuadrado;

    public VentanaFigura() {
        setTitle("Ventana de las Figuras");
        setBounds(0, 0, 600, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponent();
    }
    
    public void initComponent(){
        panelBotones = new JPanel();
        panelFigura = new PanelFigura();
        
        btnLinea = new JButton("Linea");
        panelBotones.add(btnLinea);
        
        btnCuadrado = new JButton("Cuadrado");
        panelBotones.add(btnCuadrado);
        
        btnCirculo = new JButton("Circulo");
        panelBotones.add(btnCirculo);
        
        btnCirculoCuadrado = new JButton("CirculoCuadrado");
        panelBotones.add(btnCirculoCuadrado);
        
         add(panelBotones, BorderLayout.NORTH);
         add(panelFigura, BorderLayout.CENTER);
         
         btnLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelFigura.setTipoFigura(1);
                panelFigura.getFigura().setX(100);
                panelFigura.getFigura().setY(100);
                panelFigura.getFigura().setAncho(200);
                panelFigura.getFigura().setAlto(200);
                panelFigura.repaint();
            }
         });
         
         btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelFigura.setTipoFigura(2);
                panelFigura.getFigura().setX(100);
                panelFigura.getFigura().setY(100);
                panelFigura.getFigura().setAncho(200);
                panelFigura.getFigura().setAlto(200);
                panelFigura.repaint();
            }
         });
         
         btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelFigura.setTipoFigura(3);
                panelFigura.getFigura().setX(100);
                panelFigura.getFigura().setY(100);
                panelFigura.getFigura().setAncho(200);
                panelFigura.getFigura().setAlto(200);
                panelFigura.repaint();
            }
         });
         
         btnCirculoCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelFigura.setTipoFigura(4);
                panelFigura.getFigura().setX(100);
                panelFigura.getFigura().setY(100);
                panelFigura.getFigura().setAncho(200);
                panelFigura.getFigura().setAlto(200);
                panelFigura.repaint();
            }
         });
         
        
    }
    
    
   
    
}
