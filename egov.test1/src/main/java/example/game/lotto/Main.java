package example.game.lotto;

import java.awt.*;
import javax.swing.*;
 
public class Main{
     
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lottery");
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        Lottery primary = new Lottery();
         
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);     
    }   
}


