package game.lotto;

import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Dimension; 
import java.awt.Font; 
import java.awt.GridLayout; 
import java.awt.Toolkit; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 

public class Main2 extends JFrame implements ActionListener { 
    JButton btn_lottoNum[] = new JButton[6]; 
    JTextField txt_Result = new JTextField(); 
    JButton btn_start = new JButton("숫자생성"); 
     
    JPanel pCenter = new JPanel(); 
    JPanel pNorth = new JPanel(); 
     
    int x_l,y_l; 
     
    public Main2() { 
        super("로또 자동 생성기"); 
         
        Toolkit tk = Toolkit.getDefaultToolkit();//구현된 Toolkit객체를 얻는다. 
        Dimension screenSize=tk.getScreenSize();//화면의 크기를 구한다. 
         
        //화면의 크기의 절반값에서 Frame크기의 절반값을뺀 위치로하면 
        //Frame이 화면 가운데 위치하게된다. 
         
         
        pCenter.setLayout(new GridLayout(2, 3)); 
        for (int i = 0; i < 6; i++) { 
            btn_lottoNum[i] = new JButton(Integer.toString(i + 1)); 
            btn_lottoNum[i].setFont(new Font("궁서", Font.BOLD, 25)); 
            btn_lottoNum[i].setBackground(Color.DARK_GRAY); 
            btn_lottoNum[i].setForeground(Color.white); 
                         
            pCenter.add(btn_lottoNum[i]); 
             
        } 
        txt_Result.setFont(new Font("궁서", Font.BOLD, 14)); 
        txt_Result.setForeground(Color.red); 
        txt_Result.setBackground(new Color(248, 244, 173)); 
        btn_start.setBackground(Color.LIGHT_GRAY); 
        btn_start.setForeground(new Color(44, 142, 241)); 
        btn_start.setFont(new Font("바탕", Font.PLAIN, 15)); 
        pNorth.setLayout(new BorderLayout()); 
        pNorth.add(txt_Result, "Center"); 
        pNorth.add(btn_start, "East"); 

        add(pCenter, "Center"); 
        add(pNorth, "South"); 
         
        //크기지정 
        setSize(300, 250); 
         
        //Frame이 화면 중앙에 나타나게 설정 
        x_l = screenSize.width/2-this.getWidth()/2; //x좌표구하기 
        y_l = screenSize.height/2-this.getHeight()/2;//y좌표구하기 
        //위치지정 
        setLocation(x_l,y_l); 
        setResizable(false); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         
        btn_start.addActionListener(this); 
    } 

    public static void main(String[] args) { 
        new Main2(); 
    } 

    @Override 
    public void actionPerformed(ActionEvent e) { 
        if(e.getSource() == btn_start){ 
            ArrayListLotto LottoNum = new ArrayListLotto(); 
            LottoNum.randomAdd(); 
            LottoNum.lottoSortAsc(); 
            String temp=""; 
            txt_Result.setText(""); //이벤트가 발생할때마다 초기화 
             
            for(int i = 0; i<6;i++) 
            { 
                 
                btn_lottoNum[i].setText(LottoNum.get(i)); 
                //txt_Result.setText(txt_Result.getText()+LottoNum.get(i)+" "); 
                //결과 누적 
                temp = temp + "["+LottoNum.get(i)+ "]"; 
            } 
            txt_Result.setText(temp);             
        }         
    } 
} 


