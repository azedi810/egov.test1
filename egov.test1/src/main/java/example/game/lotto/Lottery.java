package example.game.lotto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class Lottery extends JPanel {
 
    private JPanel top, mid, bot;
    private EachNum lotData;
    private JButton btnStart, btnReset;
    private LotteryListener listener;
     
    public Lottery() {
        this.setPreferredSize(new Dimension(400,300));
        this.setLayout(null);
         
        listener = new LotteryListener();
         
        top = new JPanel();
        top.setBackground(Color.black);
        top.setBounds(0, 0, 400, 50);
        this.add(top);
 
        JLabel lblTitle = new JLabel("To Be Rich Person");
        lblTitle.setFont(new Font("Monofur",Font.BOLD,20));
        lblTitle.setForeground(Color.white);
        top.add(lblTitle);
         
        lotData = new EachNum();
        lotData.setBackground(Color.white);
        lotData.setBounds(0, 50, 400, 200);
        this.add(lotData);     
         
        bot = new JPanel();
        bot.setBackground(Color.black);
        bot.setBounds(0, 250, 400, 50);
        this.add(bot);
                 
        btnStart = new JButton("generate");
        btnStart.addActionListener(listener);
        btnStart.setBackground(Color.white);
        btnStart.setFocusPainted(false);
        bot.add(btnStart);
         
    }   // Lottery()   
    private class LotteryListener implements ActionListener {      
        public void actionPerformed(ActionEvent event) {
 
            for(int i=0; i<7; i++) {
                lotData.makeNum();
            }
             
        } // actionPerformed()
         
    }   // LotteryListener class
     
}   // Lottery class


