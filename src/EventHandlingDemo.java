import java.awt.*;
import java.awt.event.*;

class EventHandlingDemo extends Frame implements ActionListener
{
    TextField tf;
    EventHandlingDemo()
    {
        tf=new TextField();
        tf.setText("Welcome");
        Button b=new Button("Click here");
        tf.setBounds(50,100,50,100);
        b.setBounds(100,150,100,150);
        b.addActionListener(this);
        add(tf);
        add(b);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Bye");
    }
}
class DemoClass
{
    public static void main(String args[])
    {
        new EventHandlingDemo();
    }
}