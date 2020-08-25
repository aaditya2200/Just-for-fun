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

    JLabel l1 = new JLabel("Enter x:");
    JLabel l2 = new JLabel("Enter precision:");
    JLabel l3 = new JLabel("Cosine value is: ");
    JLabel l4 = new JLabel();

    JTextField t1 = new JTextField(12);
    JTextField t2 = new JTextField(12);

    JButton b1 = new JButton("Calculate");
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int f = 1;
            float sum = 1.0f;
            float x = Float.parseFloat(t1.getText());
            int pres = Integer.parseInt(t2.getText());
            for (int i = 0; i < pres; i++)
            {
                for (int j = 1; j < i; j++)
                {
                    f = f * j;
                }
                sum += (Math.pow(-1, i+1) * x / f);

            }
            l4.setText(Float.toString(sum));
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