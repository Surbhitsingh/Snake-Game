import java.awt.Color;

import javax.swing.JFrame;

public class snakegame{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // make a frame with title
        JFrame frame = new JFrame("Snake Game");
        // set dimenstions 
        frame.setBounds(50,50,905,700);
        // disable minimise button
        frame.setResizable(false);     
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // object of gamepanel
        gamepanel panel1 = new gamepanel();
        panel1.setBackground(Color.DARK_GRAY);
        frame.add(panel1);
        frame.setVisible(true);
        

    }
}