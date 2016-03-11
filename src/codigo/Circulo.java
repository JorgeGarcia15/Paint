/*
 * Mi primera clase java

La clase círculo permite almacenar un círculo
además de su posición en la pantalla, si está relleno o no
, su color etc
 */
package codigo;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Jorge Cisneros
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    public String tipoRelleno = null;
    public Stroke contorno = null;
    public GradientPaint degradado = null;
    
 
    
    public Circulo (int _x, int _y, int _width,  Color _color,Color _color2, boolean _relleno,String _tipoRelleno ,float _grosor){
        this.x = _x - _width/2;
        this.y = _y - _width/2;
        this.width = _width;
        this.height = _width;
        this.color = _color;
        this.relleno = _relleno;

        this.color = _color2;
        this.color = _color;
        this.relleno = _relleno;
        this.tipoRelleno = _tipoRelleno;
        
        
        contorno = new BasicStroke(_grosor);
        degradado = new GradientPaint(_x-_width/2,_y,_color,_x + _width/2, _y,_color2);
        
    }
    
    public void pintaYColorea(Graphics2D g2){
            g2.setColor(color);
            if(tipoRelleno==" Si"){
            g2.setPaint(degradado);
            }
            g2.setStroke(contorno);
            if (this.relleno) {
                
               
                g2.fill(this);
                
            
            } else{
                g2.draw(this);
            }
    }
}
