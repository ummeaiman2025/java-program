
import javax.swing.*;
import java.awt.event.*;

class SumCalculator extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton b;

    SumCalculator() {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        setTitle("Sum Calculator");
        setSize(350, 250);
        setLayout(null);

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(30, 30, 100, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(140, 30, 150, 25);
        add(t1);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(30, 70, 100, 25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(140, 70, 150, 25);
        add(t2);

        b = new JButton("Calculate Sum");
        b.setBounds(90, 110, 150, 30);
        add(b);

        JLabel l3 = new JLabel("Sum:");
        l3.setBounds(30, 160, 100, 25);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(140, 160, 150, 25);
        t3.setEditable(false);
        add(t3);

        b.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            t3.setText(String.valueOf(a + b));
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new SumCalculator();
    }
}
