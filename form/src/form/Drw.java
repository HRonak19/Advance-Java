
package form;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class Drw extends Frame {
    
    public Drw(){
        
         setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        
         g.drawRect(60, 40, 340, 290);
         g.setColor(Color.red);
         g.fillRect(70, 50, 80, 220);
         g.setColor(Color.blue);
         g.fillRect(180, 50, 195, 220);
           g.drawLine(160, 40, 160, 330);
           
          
           g.drawLine(60, 280, 400, 280);
           
    }
    
    
    
    public static void main(String[] args) {
        
        new Drw();
    }
    
}
