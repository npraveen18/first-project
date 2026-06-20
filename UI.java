import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UI{
    public static String test = "";
    public static void main(String[] args) {

        int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.5);
        int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.5);

        JFrame frame = new JFrame("Student Planner App");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ClassRoom example = new ClassRoom("Math", 101);
        

        JTextField input = new JTextField("Type Class Here");
        input.setBounds(0,screenHeight,100,50);

        JLabel l = new JLabel();
        l.setBounds(0,0,(int)(screenWidth/0.5),200);
        frame.add(l);

        input.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    test += input.getText();
                    test += "<br>";
                    l.setText("<html>" + test + "</html>");
                }
            }
        });


        frame.add(input);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}