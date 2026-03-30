// awt without extending

import java.awt.*;
import java.awt.event.ActionListener;

class xyz {
    public static void main(String[] args) {
        Frame f = new Frame("First Frame");

        f.setSize(100,100);
        f.setVisible(true);         // default false
        f.setTitle("Registration"); // the text wich is written on tab with internet globe icon
        
        Label l1 = new Label("Name: ");
        l1.setBounds(20, 30,40,30);     // setBounds(x,y,height,width)
        f.add(l1);      // add method fo addin in webpage

        TextField tf = new TextField();
        tf.setBounds(50,30,40,100);     // most hard part of setting area
        f.add(tf);
        f.setLayout(null);              // if we are addin positions manually then it shiuld be null
        
        Button b = new Button("click");     // its Click or click i have to check
        b.setBounds(10,20,50,60);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void ActionPerformed(ActionEvent e) {
                l1.setText("Welcome");
            }
        });
    }
}