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

        

        Color mauve = new Color(0xdabfff);
        Color softPeriwinkle = new Color(0x907ad6);
        Color dustyGrape = new Color(0x4f518c);
        Color spaceIndigo = new Color(0x2c2a4a);

        colors[0] = mauve;
        colors[1] = softPeriwinkle;

        int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().width);
        int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().height);

        //frame
        JFrame frame = new JFrame("Student Planner App");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setForeground(spaceIndigo);
        //frame.setLayout(null);
        //frame

        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(spaceIndigo);
        frame.setContentPane(backgroundPanel);
        frame.setLayout(null);
        

        //input
        JTextField input = new JTextField();
        input.setBounds(10,410,200,50);
        //input

        //container for labels
        JPanel container = new JPanel();
        container.setBounds(0,0,400,400);
        container.setBackground(spaceIndigo);
        container.setLayout(new GridLayout(0, 1, 0, 2));

        JButton addClass = new JButton();
        addClass.setBounds(220,410,160,50);
        addClass.setText("Add Class");
        addClass.setBackground(dustyGrape);
        addClass.addActionListener(e -> {
            if (!input.getText().equals("")){
                ClassRoom addition = new ClassRoom(input.getText(), 101);
                classes.add(addition);
                alternator = 1 - alternator;
                JButton but = new JButton(addition.getName());
                but.setBounds(0,0,50, 50);
                but.setBackground(colors[alternator]);
                but.addActionListener(s -> {
                    JFrame window = new JFrame(addition.getName());
                    window.setSize(350,400);
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
                    secondInput.setBounds(5, 310, 165, 50);
                    window.add(secondInput);

                    JButton assignmentAdder = new JButton("Add Assignment");
                    assignmentAdder.setBounds(170,310,160,50);
                    window.add(assignmentAdder);

                    assignmentAdder.addActionListener(a -> {
                        if (!secondInput.getText().equals("")){
                            JLabel lLabel = new JLabel(secondInput.getText());
                            Assignment k = new Assignment(secondInput.getText());
                            addition.addAssignment(k);
                            lLabel.setBounds(0,0,100,100);
                            cont.add(lLabel);
                            cont.revalidate();
                            cont.repaint();
                        }
                    });


                    window.revalidate();
                    window.repaint();
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