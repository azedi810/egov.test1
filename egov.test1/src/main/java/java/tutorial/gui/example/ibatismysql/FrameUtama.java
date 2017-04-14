package java.tutorial.gui.example.ibatismysql;


import com.ibatis.sqlmap.client.SqlMapClient;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class FrameUtama extends JFrame implements ActionListener {
 
    private JTextField txtNama = new JTextField();
    private JTextField txtAlamat = new JTextField();
    private JButton cmdButton = new JButton("Save");
 
    public FrameUtama(){
        setLayout(new GridLayout(3, 3));
        Container con = this.getContentPane();
        con.add(new JLabel("nama : "));
        con.add(txtNama);
        con.add(new JLabel("Alamat : "));
        con.add(txtAlamat);
        con.add(cmdButton);
 
        cmdButton.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e) {
    	
        if(e.getSource() == cmdButton){
            Contoh contoh = new Contoh();
            contoh.setNo(txtNama.getText());
            contoh.setNum(txtAlamat.getText());

        	System.out.println("###############" );
        	
            SqlMapClient sqlMapClient = SqlMapConfig.getSqlMap();
            try {
            	System.out.println("111111" );
                sqlMapClient.insert("contoh.insertContoh", contoh);
                System.out.println("Success");
            } catch (SQLException ex) {
            	System.out.println("222" );
                ex.printStackTrace();
            }
        }
    }
 
    public static void main(String[] edw) {
        FrameUtama frameUtama = new FrameUtama();
        frameUtama.setVisible(true);
        frameUtama.setSize(300,150);
        frameUtama.setLocationRelativeTo(null);
    }
    
    
 
}