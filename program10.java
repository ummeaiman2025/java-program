
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SumApplet extends JFrame implements ActionListener {

    private final JTextField t1, t2, t3;
    private final JButton b;

    SumApplet() {
        super("Sum Calculator");
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        setLayout(new FlowLayout());
        setSize(420, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("NAME: UMME AIMAN"));
        add(new JLabel("REG NO: 25BTIT115"));

        add(new JLabel("First Number:"));
        t1 = new JTextField(10);
        add(t1);

        add(new JLabel("Second Number:"));
        t2 = new JTextField(10);
        add(t2);

        b = new JButton("Calculate Sum");
        add(b);

        add(new JLabel("Sum:"));
        t3 = new JTextField(10);
        t3.setEditable(false);
        add(t3);

        b.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            t3.setText(String.valueOf(a + b));
        }
        catch (NumberFormatException ex) {
            t3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SumApplet::new);
    }
}
