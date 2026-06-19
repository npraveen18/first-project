import javax.swing.*;
import java.awt.Toolkit;

public class UI{
    public static void main(String[] args) {

        int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().width * 0.5);
        int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().height * 0.5);

        JFrame frame = new JFrame("Student Planner App");
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}