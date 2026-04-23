import java.applet.Applet;
import java.awt.*;

class xyz extends Applet {
    TextField tf1,tf2;
    Button b1,b2;

    public void init() {
        tf1 = new TextField("Enter Username");
        tf2 = new TextField("Password");
        tf2.setEchoChar('c');
        b1 = new Button("Click");
    }
    public static void main(String[] args) {
        // noic
    }
}

// How to use?
// compile this file which gives .class file
// then add that file in HTML webpage
// this feature was used till before java 9 after that it was removed