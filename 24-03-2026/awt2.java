// awt without extending

import java.awt.*;

class xyz {
    public static void main(String[] args) {
        Frame f = new Frame("First Frame");

        f.setSize(100,100);
        f.setVisible(true);         // default false
        f.setTitle("Registration"); // the text wich is written on tab with internet globe icon
        
        Label l1 = new Label("Name: ");
        l1.setBounds(20, 30,40,30);     // setBounds(x,y,height,width)
        f.add(l1);      // add method fo addin in webpage
    }
}