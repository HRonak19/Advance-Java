
package form;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.RadialGradientPaint;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Form extends Frame {

  // object declare
  Label L1,L2,L3,L4,L5,L6,L7,L8,L9;
  
  TextField T1,T2,T3;
  
  JRadioButton R1,R2,R3;
  
  Checkbox C1,C2,C3,C4;
  
  Button B1;
  
  TextArea TA1;
  
    public Form(){
        
        L1 = new Label(" NAME : ");
        L1.setBounds(80, 50, 50, 20);
        add(L1);
                T1 = new TextField("Enter Name",20);
                T1.setBounds(180, 50, 200, 25);
                add(T1);
        
       L7 = new Label(" Email : ");
       L7.setBounds(80, 90, 50, 20);
       add(L7);
       
                T2 = new TextField("Enter Email");
                T2.setBounds(180, 90, 200, 25);
                add(T2);
            
        L8 = new Label("PASSWORD : ");
        L8.setBounds(80, 130, 70, 20);
        add(L8);
        
                T3 = new TextField("Enter PASSWORD");
                T3.setBounds(180, 130, 200, 25);
                add(T3);
                
        L9 = new Label("SUBJECT : ");
        L9.setBounds(80, 170, 70, 20);
        add(L9);
        
            C1 = new Checkbox("C");
            C1.setBounds(180, 170, 27, 20);
            add(C1);
            
            C2 = new Checkbox("C++");
            C2.setBounds(215, 170, 40, 20);
            add(C2);
            
            C3 = new Checkbox("JAVA");
            C3.setBounds(260, 170, 45, 20);
            add(C3);
       
            C4 = new Checkbox("PYTHON");
            C4.setBounds(310, 170, 80, 20);
            add(C4);
            
        L2 = new Label("Gender");
        L2.setBounds(80, 200, 50, 20);
        add(L2);
            
            
            L3 = new Label("Male"); 
            L3.setBounds(198, 200, 30, 20);
            add(L3);
                R1 = new JRadioButton();
                R1.setBounds(180, 200, 20, 20);
                add(R1);
                
            L4 = new Label("Female");
            L4.setBounds(250, 200, 45, 20);
            add(L4);
                R2 = new JRadioButton();
                R2.setBounds(230, 200, 20, 20);
                add(R2);
            
            L6 = new Label("Other");
            L6.setBounds(315, 200, 40, 20);
            add(L6);
                R3 = new JRadioButton();
                R3.setBounds(295, 200, 20, 20);
                add(R3);
            
        L5 = new Label("Address : ");
        L5.setBounds(80, 230, 70, 20);
        add(L5);
            TA1 = new TextArea();
            TA1.setBounds(180, 230, 200, 40);
            add(TA1);
            
        
        B1 = new Button("SAVE");
        B1.setBounds(200, 290, 80, 20);
        B1.setBackground(Color.red);
        add(B1);
       
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        
           g.drawRect(60, 40, 340, 290);
           g.drawLine(160, 40, 160, 330);
           
    }
    
    public static void main(String[] args) {
        new Form();
    }
    
}
