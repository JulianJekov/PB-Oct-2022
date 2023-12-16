
import javax.swing.*;
import java.awt.*;


public class demo {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("thumbs.png");
        JLabel label = new JLabel();

        label.setIcon(icon);

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(0, 0, 120, 40);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 40, 120, 40);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 80, 120, 40);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(120, 120);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(whitePanel);
        frame.add(greenPanel);
        frame.add(redPanel);

    }
}














/*String name = JOptionPane.showInputDialog("Enter your name");
JOptionPane.showMessageDialog(null,"Hello "+name);

int age=Integer.parseInt(JOptionPane.showInputDialog("Enter you age "));
JOptionPane.showInternalMessageDialog(null,"You are "+age+" years old");
double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
JOptionPane.showInternalMessageDialog(null,"You are "+height+"cm tall");*/