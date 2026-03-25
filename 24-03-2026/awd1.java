import java.awt.*;

class xyz extends Frame {
    xyz() {             // constructor
        setSize(100,100);
        setVisible(true);   // default false
        setTitle("Hello");
    }
    public static void main(String[] args) {
        xyz x = new xyz();
    }
}

// tis is use of java.awt (not awd) with extending Frame class