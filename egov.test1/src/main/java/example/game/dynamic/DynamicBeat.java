package example.game.dynamic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private Image introBackground = new ImageIcon(Main.class.getResource("/image/background/bg1.jpg")).getImage();
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("/image/background/menubar.jpg")));
	
	private JButton exitTopMenuButton = new JButton(new ImageIcon(Main.class.getResource("/image/background/close.gif")));
	
	private ImageIcon startButtonEnterImage = new ImageIcon(Main.class.getResource(""));
	private JButton startButton = new JButton(startButtonEnterImage);
	
	private int mouseX, mouseY;

	
	public DynamicBeat() {
		setUndecorated(true);  // 기본적으로 제공하는 메뉴바가 보이지 않는다. 
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); // 화면에 정중앙 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창 종료했을 경우 프로그램 전체가 종료
		setVisible(true);
		
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		

		exitTopMenuButton.setBounds(1245,0,30,30);    // left top 
		exitTopMenuButton.setBorderPainted(false);
		exitTopMenuButton.setContentAreaFilled(false);
		exitTopMenuButton.setFocusPainted(false);
		exitTopMenuButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(exitTopMenuButton);
		
		menuBar.setBounds(0,0,1280,30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY=e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x=mouseX, y=mouseY);
			}
		});
		
		add(menuBar);
		

	}
	

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 30, null);
		paintComponents(g);		// 메뉴바와 같이 고정된 이미지를 그릴때 사용
		this.repaint();
	}
	
//	startButton.setBounds(1245,0,30,30);
//	startButton.setBorderPainted(false);
//	startButton.setContentAreaFilled(false);
//	startButton.setFocusPainted(false);
//	startButton.addMouseListener(new MouseAdapter() {
//		
//	});

		

}
