import java.awt.*;
import java.awt.event.WindowAdapter;


class xyz {
    public static void main(String[] args) {
        Frame f = new Frame("JJ");
        f.setSize(400,400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {   // WindowAdapter() is new tin
            // some un known code
        });

        // some code
    }
}