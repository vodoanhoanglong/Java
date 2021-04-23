import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testJFrame
{
    private JPanel TestJFrame;
    private JButton button1;

    public testJFrame()
    {
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Dit me may");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("App");
        frame.setSize(1000, 400);
        frame.setContentPane(new testJFrame().TestJFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}