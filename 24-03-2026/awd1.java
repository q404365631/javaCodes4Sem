import java.awd.*;

class xyz extends Frame {
    xyz() {             // constructor
        SetSize(100,100);
        SetVisible(true);   // default false
        SetTitle("Hello");
    }
    public static void main(String[] args) {
        xyz x = new xyz();
    }
}