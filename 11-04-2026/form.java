import java.awt.*;
import java.awt.event.*;

class form {
public static void main(String... ab) {

Frame f = new Frame();
f.setTitle("Reg. Form");
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);

Label l1 = new Label("Name: ");
f.add(l1);
l1.setBounds(15, 40, 40, 20);
l1.setForeground(Color.WHITE);
l1.setBackground(new Color(0,0,0,25));

Label l2 = new Label("UID: ");
f.add(l2);
l2.setBounds(15, 70, 40, 20);
l2.setForeground(Color.WHITE);
l2.setBackground(new Color(0,0,0,25));

TextField tf1 = new TextField("John Doe");
tf1.setBounds(65, 40, 100, 25);
tf1.setForeground(Color.WHITE);
tf1.setBackground(new Color(100,100,100));

TextField tf2 = new TextField("1234");
tf2.setBounds(65, 70, 100, 25);
tf2.setForeground(Color.WHITE);
tf2.setBackground(new Color(100,100,100));

Button b = new Button("Submit");
b.setBounds(15, 120, 60, 20);

Label l3 = new Label("Click to Submit");
l3.setBounds(15, 130, 100, 20);
l3.setForeground(Color.BLACK);
l3.setBackground(new Color(0,0,0));

f.add(tf1);
f.add(tf2);
f.add(b);

b.addActionListener( new ActionListener() {
public void actionPerformed(ActionEvent e) {
	l3.setText("Form Submitted");
   }
});	

}
}