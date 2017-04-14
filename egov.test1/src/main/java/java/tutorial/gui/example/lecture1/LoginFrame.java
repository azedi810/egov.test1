package java.tutorial.gui.example.lecture1;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
 
public class LoginFrame extends JFrame {
 
 private JPanel contentPane;
 private JLabel lblUsername;
 private JLabel lblPassword;
 private JTextField textFieldUsername;
 private JTextField textFieldPassword;
 private JButton btnLogIn;
 private JButton btnInsert;
 
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     LoginFrame frame = new LoginFrame();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }
 
 /**
  * Create the frame.
  */
 public LoginFrame() {
  setBackground(SystemColor.desktop);
  setTitle("\uB85C\uADF8\uC778");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 318, 300);
  contentPane = new JPanel();
  contentPane.setBackground(SystemColor.menu);
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
 
  lblUsername = new JLabel("\uC544\uC774\uB514");
  lblUsername.setFont(new Font("맑은 고딕", Font.BOLD, 12));
  lblUsername.setBounds(22, 103, 60, 15);
  contentPane.add(lblUsername);
 
  lblPassword = new JLabel("\uBE44\uBC00\uBC88\uD638");
  lblPassword.setFont(new Font("맑은 고딕", Font.BOLD, 12));
  lblPassword.setBounds(22, 128, 60, 15);
  contentPane.add(lblPassword);
 
  textFieldUsername = new JTextField();
  textFieldUsername.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
  textFieldUsername.setBounds(81, 100, 147, 21);
  contentPane.add(textFieldUsername);
  textFieldUsername.setColumns(10);
 
  textFieldPassword = new JTextField();
  textFieldPassword.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
  textFieldPassword.setColumns(10);
  textFieldPassword.setBounds(81, 125, 147, 21);
  contentPane.add(textFieldPassword);
 
  btnLogIn = new JButton("\uB85C\uADF8\uC778");
  btnLogIn.setBackground(SystemColor.control);
  btnLogIn.setFont(new Font("맑은 고딕", Font.BOLD, 12));
  btnLogIn.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    do_btnLogin_actionPerformed(e);
   }
  });
  btnLogIn.setBounds(22, 153, 97, 23);
  contentPane.add(btnLogIn);
 
  btnInsert = new JButton("INSERT");
  btnInsert.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    do_btnInsert_actionPerformed(e);
   }
  });
  btnInsert.setFont(new Font("맑은 고딕", Font.BOLD, 12));
  btnInsert.setBounds(131, 153, 97, 23);
  contentPane.add(btnInsert);
 }
 
// 로그인 버튼
 protected void do_btnLogin_actionPerformed(ActionEvent e) {
 
  DBUtils dbUtils = new DBUtils();
  String u = textFieldUsername.getText();
  String p = textFieldPassword.getText();
 
  if (dbUtils.login(u, p) == true) {
   JOptionPane.showMessageDialog(this, "로그인 성공");
   this.setVisible(false);
 
  } else {
   JOptionPane.showMessageDialog(this, "로그인 실패");
   textFieldUsername.setText("");
   textFieldPassword.setText("");
   textFieldUsername.grabFocus();
  }
 }
 
// 삽입 버튼
 protected void do_btnInsert_actionPerformed(ActionEvent e) {
 
  DBUtils dbUtils = new DBUtils();
  String u = textFieldUsername.getText();
  String p = textFieldPassword.getText();
 
  if (dbUtils.insert(u, p) == true) {
   JOptionPane.showMessageDialog(this, "데이터 쓰기 성공");
   this.setVisible(false);
 
  } else {
   JOptionPane.showMessageDialog(this, "데이터 쓰기 실패");
   textFieldUsername.setText("");
   textFieldPassword.setText("");
   textFieldUsername.grabFocus();
  }
 }
}
 
