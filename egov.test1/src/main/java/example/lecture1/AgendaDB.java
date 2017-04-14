package example.lecture1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
 
public class AgendaDB extends JDialog {
 
    private final JPanel contentPanel = new JPanel();
    private JLabel lblNewLabel;
    private JLabel label;
    private JTextField agendaTitle;
    private JTextField agendaText;
    private JButton saveButton;
    private JLabel console;
    private JLabel label_1;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    }
 
    /**
     * Create the dialog.
     */
    // 수정부분
    public AgendaDB(Window owner, ModalityType modalityType, String sqlDay) {
        super(owner, modalityType);
        setTitle(sqlDay);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
 
        // 여기까지
 
        setBounds(100, 100, 315, 303);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
 
        lblNewLabel = new JLabel("\uC81C  \uBAA9");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lblNewLabel.setBounds(12, 32, 57, 15);
        contentPanel.add(lblNewLabel);
        
        label_1 = new JLabel("*");
        label_1.setForeground(Color.RED);
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        label_1.setBounds(10, 32, 14, 15);
        contentPanel.add(label_1);
 
        label = new JLabel("\uB0B4  \uC6A9");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        label.setBounds(12, 88, 57, 15);
        contentPanel.add(label);
 
        agendaTitle = new JTextField();
        agendaTitle.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent arg0) {
                do_agendaTitle_caretUpdate(arg0);
            }
        });
        
        console = new JLabel("\uC81C\uBAA9\uC744 \uC785\uB825\uD574 \uC8FC\uC138\uC694.");
        console.setForeground(Color.GRAY);
        console.setHorizontalAlignment(SwingConstants.CENTER);
        console.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
        console.setBounds(167, 8, 120, 19);
        contentPanel.add(console);
        agendaTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
        agendaTitle.setBounds(64, 32, 223, 46);
        contentPanel.add(agendaTitle);
        agendaTitle.setColumns(10);
 
        agendaText = new JTextField();
        agendaText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
        agendaText.setColumns(10);
        agendaText.setBounds(64, 88, 223, 135);
        contentPanel.add(agendaText);
        {
            JButton cancelButton = new JButton("\uCDE8\uC18C");
            cancelButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
            cancelButton.setBounds(217, 233, 70, 23);
            contentPanel.add(cancelButton);
            cancelButton.setBackground(SystemColor.control);
            cancelButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    do_cancelButton_actionPerformed(arg0);
                }
            });
            cancelButton.setActionCommand("Cancel");
        }
 
        saveButton = new JButton("\uC800\uC7A5");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    do_saveButton_actionPerformed(e);
                } catch (ClassNotFoundException | SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        saveButton.setBackground(SystemColor.control);
        saveButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
        saveButton.setBounds(144, 233, 70, 23);
        contentPanel.add(saveButton);
        saveButton.setEnabled(false);
    }
 
    protected void do_cancelButton_actionPerformed(ActionEvent arg0) {
        this.dispose();
    }
 
    // 일정 추가하기
    protected void do_saveButton_actionPerformed(ActionEvent e) throws ClassNotFoundException, SQLException {
        // String url = "jdbc:mariadb://localhost:3306/java";
        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        // String driverClass = "org.mariadb.jdbc.Driver";
        String driverClass = "oracle.jdbc.OracleDriver";
 
        String dbuid = "java";
        String dbpwd = "java";
 
        Class.forName(driverClass);
 
        Connection connection = DriverManager.getConnection(url, dbuid, dbpwd);
 
        if (!agendaTitle.getText().equals("")) {
            // String sql = "INSERT INTO `Agenda`.`agendadb` (`AgendaDate`, `AgendaTitle`, `AgendaText`) VALUES ('"+ getTitle() + "' , '" + agendaTitle.getText() + "' , '" + agendaText.getText() + "')";
 
            String sql = "INSERT INTO AGENDA_DATA VALUES (SEQUENCE_AGENDA.NEXTVAL, '" + getTitle() + "', '"
                    + agendaTitle.getText() + "', '" + agendaText.getText() + "')";
 
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeQuery(sql);
            connection.close();
            dispose();
        }
    }
    
    // 조회하기
    protected int Search(String sqlInput) throws ClassNotFoundException, SQLException {
 
        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String driverClass = "oracle.jdbc.OracleDriver";
        String dbuid = "java";
        String dbpwd = "java";
 
        Class.forName(driverClass);
 
        Connection connection = DriverManager.getConnection(url, dbuid, dbpwd);
        String sql = "SELECT * FROM AGENDA_DATA WHERE AGENDA_DATE = '" + sqlInput + "'";
 
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery(sql);
        connection.close();
 
        int result = 0;
 
//         일정이 있으면
//        while (rs.next()) {
//            result++;
//        }
//
        return result;
    }
 
    // save버튼 비활성화/활성화
    protected void do_agendaTitle_caretUpdate(CaretEvent arg0) {
        if (!agendaTitle.getText().equals("")) {
            saveButton.setEnabled(true);
            console.setText("");
        } else {
            saveButton.setEnabled(false);
            console.setText("제목을 입력해 주세요.");
        }
    }
} 
