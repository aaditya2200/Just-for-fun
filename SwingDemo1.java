import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo1 implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
    SwingDemo1()
    {

    JFrame f = new JFrame("first frame");

    f.setSize(400,300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel l1 = new JLabel("Length of the hypotenuse");
    JLabel l2 = new JLabel("Length of the side adjacent to angle");
    JLabel l3 = new JLabel("Cosine value is: ");
    JLabel l4 = new JLabel();

    JTextField t1 = new JTextField(12);
    JTextField t2 = new JTextField(12);

    JButton b1 = new JButton("Calculate");
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            float hyp = Float.parseFloat(t1.getText());
            float adj = Float.parseFloat(t2.getText());
            String val = Float.toString(adj/hyp);
            l4.setText(val);
        }
    });

    f.setLayout(new FlowLayout());
    f.add(l1);
    f.add(l2);
    f.add(t1);
    f.add(t2);
    f.add(b1);
    f.add(l3);
    f.add(l4);
    f.setVisible(true);

    }

    public static void main(String args[])

    {

        SwingDemo1 s = new SwingDemo1();

    }

}