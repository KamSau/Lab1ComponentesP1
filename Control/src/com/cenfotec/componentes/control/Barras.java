/*
 * Nombre del programa: Barras
 * Descripción: 
 * Fecha de creación: Sep 21, 2020
 * Autor: Kamil Sauma Zumbado 
 * Fecha de modificación: Sep 21, 2020
 * Modificado por: Kamil Sauma Zumbado.
 */

package com.cenfotec.componentes.control;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import javax.swing.JPanel;


public class Barras extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        BasicStroke bs1 = new BasicStroke(8, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL);
        
        g2d.setStroke(bs1);
        
        int x = 10;
        for(int i = 0; i<12; i++){
            x+=20;Random rand = new Random();
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            g2d.setColor(new Color(red, green, blue));
            g2d.drawLine(x, 10 + rand.nextInt(140 - 10 + 1), x, 140);
        }
        
        
        
        g2d.setColor(Color.BLACK);

        BasicStroke bs4 = new BasicStroke();
        g2d.setStroke(bs4);

        g2d.drawLine(20, 20, 20, 140);
        g2d.drawLine(270, 20, 270, 140);
        
        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
