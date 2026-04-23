import java.applet.*;
import java.awt.*; 

public class xyz extends Applet {
    Button b1;
    Label L1;

    public void init() {
        setLayout(new BorderLayout());
        b1 = new Button("Click");
        L1 = new Label("Hello");
        add(b1, BorderLayout.NORTH);
        add(L1, BorderLayout.WEST);
    }
}
