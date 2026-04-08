import java.awt.*;

class test {
    public static void main(String args) {
        Frame f= new Frame("test");
        Label l1 = new Label("Username/Email");
        l1.setBounds(40, 50, 120, 40);
        l1.setBackground(Color.RED);
        TextField user = new TextField();
        user.setBounds(170, 50, 120, 40);

        f.add(l1);
        f.add(user);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

        // code
    }
}