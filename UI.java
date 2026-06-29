import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UI{
    public static String test = "";
    public static int alternator = 0;
    public static void main(String[] args) {
        ArrayList<ClassRoom> classes = new ArrayList<>();
        Color[] colors = {Color.gray, Color.darkGray};
        
        ArrayList<JButton> buttons = new ArrayList<>();


        int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().width);
        int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().height);

        //frame
        JFrame frame = new JFrame("Student Planner App");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //frame

        ClassRoom example = new ClassRoom("Math", 101);

        //input
        JTextField input = new JTextField();
        input.setBounds(100,100,100,100);
        //input

        //container for labels
        JPanel container = new JPanel();
        container.setBounds(0,0,screenWidth,100);
        container.setBackground(Color.red);
        

        JButton addClass = new JButton();
        addClass.setBounds(200,100,100,100);
        addClass.setText("Add Class");
        addClass.setBackground(Color.yellow);
        addClass.addActionListener(e -> {
            if (!input.getText().equals("")){
                ClassRoom addition = new ClassRoom(input.getText(), 101);
                classes.add(addition);
                alternator = 1 - alternator;
                JButton but = new JButton(addition.getName());
                but.setBounds(0,0,50,50);
                but.setBackground(colors[alternator]);
                but.addActionListener(s -> {
                    JFrame window = new JFrame(addition.getName());
                    window.setSize(200,200);
                    window.setLayout(null);
                    window.setLocationRelativeTo(null);
                    window.setVisible(true);

                    JPanel cont = new JPanel();
                    cont.setBounds(0,0,window.getWidth(), 20);
                    cont.setBackground(Color.blue);
                    window.add(cont);
                    
                    if (addition.getAssignments().size() == 0){
                        JLabel noneLabel = new JLabel("No Assignments");
                        noneLabel.setBounds(0,0,window.getWidth(),20);
                        window.add(noneLabel);
                    }   
                    else{
                        ArrayList<Assignment> a = addition.getAssignments();
                        for (Assignment as: a){
                            JLabel individual = new JLabel(as.getTitle());
                            individual.setBounds(0,0,100,100);
                            cont.add(individual);
                        }
                    }

                    JTextField secondInput = new JTextField();
                    secondInput.setBounds(50, 50, 100, 100);
                    window.add(secondInput);

                    JButton assignmentAdder = new JButton("Add Assignment");
                    assignmentAdder.setBounds(150,50,100,100);
                    window.add(assignmentAdder);

                    assignmentAdder.addActionListener(a -> {
                        JLabel lLabel = new JLabel(secondInput.getText());
                        lLabel.setBounds(0,0,100,100);
                        cont.add(lLabel);
                    });


                    cont.revalidate();
                    cont.repaint();
                });
                container.add(but);
                buttons.add(but);
                container.revalidate();
                container.repaint();
                input.setText("");
            }
        });

        


        frame.add(addClass);
        frame.add(input);
        frame.add(container);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    
}