package game.lotto;

import java.awt.*;
import javax.swing.*;
 
public class EachNum extends JPanel {
    private int lotNum[];   
    JLabel title[], lotLabel[];
     
    public EachNum() {
        this.setLayout(new GridLayout(2,7));
         
        title = new JLabel[7];
        for(int i=0; i<7; i++) {
            if(i == 6) {
                title[i] = new JLabel("Bonus");
                this.add(title[i]);
            } else {
                title[i] = new JLabel((i+1)+"th");
                this.add(title[i]);
            } // if.. else
            title[i].setHorizontalAlignment(SwingConstants.CENTER);
            title[i].setFont(new Font("Monofur",Font.PLAIN,14));
        } // for i
         
        lotLabel = new JLabel[7];
        for(int i=0; i<7; i++) {
            lotLabel[i] = new JLabel();
            lotLabel[i].setVisible(false);
            lotLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
            lotLabel[i].setVerticalAlignment(SwingConstants.CENTER);
            lotLabel[i].setFont(new Font("Monofur",Font.BOLD,14));
            lotLabel[i].setForeground(Color.darkGray);
            this.add(lotLabel[i]);
        } // for i
    }   // EachNum()
 
       public void makeNum() {      
    }   
} // EachNum class


