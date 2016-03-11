/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author familia
 */
public class Prueba extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    ArrayList<Point> moves = new ArrayList<Point>();
    
    public Prueba (int _x, int _y, int _width,Color _color, boolean _relleno){

           this.npoints = 3;
 
             for (int i = 0; i <3; i++) {
                 this.xpoints[i]= this.xpoints[i]+_x;
                 this.ypoints[i]= this.xpoints[i]+_y;
                 
                 
                 
             }
            this.color = _color;
            this.relleno = _relleno;


}
    public void pintaYColorea(Graphics2D g2){
            g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
}
