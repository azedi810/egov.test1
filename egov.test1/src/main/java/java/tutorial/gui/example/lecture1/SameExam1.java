package java.tutorial.gui.example.lecture1;
import java.awt.*;
import javax.swing.*; 
 
public class SameExam1 extends JFrame{

    // 생성자를 통해 GUI 초기 세팅을 해준다.
	SameExam1(){
//        
//        // 윈도우 제목(Title)을 생성
//        setTitle("GUI TITLE");
//        
//        // 이 부분부터 원하는 버튼, 레이블, 콤보박스 등등 설정
//        
//        // BorderLayout을 이용하고, 수평 및 수직 간격은 10px이다.
//        this.setLayout(new BorderLayout(10,10));
//        
//        JButton btn1 = new JButton("버튼1");    
//        this.add(btn1, BorderLayout.NORTH);        
//        
//        JButton btn2 = new JButton("버튼2");  
//        this.add(btn2, BorderLayout.WEST);          
//        
//        JButton btn3 = new JButton("버튼3");  
//        this.add(btn3, BorderLayout.CENTER);          
//        
//        JButton btn4 = new JButton("버튼4");
//        this.add(btn4, BorderLayout.EAST);
//        
//        JButton btn5 = new JButton("버튼5");  
//        this.add(btn5, BorderLayout.SOUTH);      
//                    
//        // 종료 버튼 생성
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // 윈도우 창 크기 설정(가로, 세로)
//        setSize(500, 500);
//        
//        // 이 메소드를 이용해야 윈도우 창이 나타난다.
//        setVisible(true);
    }

	
	public static void main(String[] args){
	    
//	    new SameExam1();
		SameExam1 sameExam1 = new SameExam1();
		sameExam1.examJtable();
	}

	public void  examDefault() {
        setTitle("GUI TITLE");
        
        // 이 부분부터 원하는 버튼, 레이블, 콤보박스 등등 설정
        
        // BorderLayout을 이용하고, 수평 및 수직 간격은 10px이다.
        this.setLayout(new BorderLayout(10,10));
        
        JButton btn1 = new JButton("버튼1");    
        this.add(btn1, BorderLayout.NORTH);        
        
        JButton btn2 = new JButton("버튼2");  
        this.add(btn2, BorderLayout.WEST);          
        
        JButton btn3 = new JButton("버튼3");  
        this.add(btn3, BorderLayout.CENTER);          
        
        JButton btn4 = new JButton("버튼4");
        this.add(btn4, BorderLayout.EAST);
        
        JButton btn5 = new JButton("버튼5");  
        this.add(btn5, BorderLayout.SOUTH);      
                    
        // 종료 버튼 생성
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 윈도우 창 크기 설정(가로, 세로)
        setSize(500, 800);
        
        // 이 메소드를 이용해야 윈도우 창이 나타난다.
        setVisible(true);
	}
	
	public void  examJtable() {
        setTitle("GUI examJtable");
        
         
        // 종료 버튼 생성
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 윈도우 창 크기 설정(가로, 세로)
        setSize(500, 800);
        
        // 이 메소드를 이용해야 윈도우 창이 나타난다.
        setVisible(true);
	}
	

}
