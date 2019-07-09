import javax.swing.*;
import java.awt.*;

public class Sample extends JFrame{
    public static void main(String[] args){
        new Sample(); 
}
    public Sample(){ 
        this.setTitle("Hello World from CSC3301");
        this.setSize(220, 130); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnlOne = new JPanel();
        pnlOne.setLayout(new GridBaglayout);
        JButton btn = new JButton("Submit");
        JTextField txt1 = new JTextField(10);
        JTextField txt2 = new JTextField(10);
        JTextField txt3 = new JTextField(10);
        JLabel lbl1 = new JLabel("Name: ");
        JLabel lbl2 = new JLabel("Title: ");
        JLabel lbl3 = new JLabel("address: ");
        pnlOne.add(lbl1); 
        pnlOne.add(txt1);
        pnlOne.add(lbl2); 
        pnlOne.add(txt2);
        pnlOne.add(lbl3); 
        pnlOne.add(txt3); 
        pnlOne.add(btn); 

        this.add(pnlOne);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        }
        }
