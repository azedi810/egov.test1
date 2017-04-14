package java.tutorial.gui.example.lecture1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class DBUtils {
 
// 마리아db 연결과 설정
 // 1. JDBC MARIADB JAR 파일 받고 클래스 패스 (라이브러리) 추가해주기 
 
 // 2. MariaDB URL (저장 장소) 지정
 private String url = "jdbc:mariadb://localhost:3306/java";
 
 // 3. MariaDB DriverClass (객체 로딩) 실행
 private String driverClass = "org.mariadb.jdbc.Driver";
 
 // Username, Password 설정
 private String dbuid = "java";
 private String dbpwd = "java";
 
// 로그인 메서드
 public boolean login(String username, String password) {
 
  try {
   // 드라이버 클래스 로딩
   Class.forName(driverClass);
   // 커넥션 개체 가져오기 (위에서 설정한 url, username, password)
   Connection connection = DriverManager.getConnection(url, dbuid, dbpwd);
 
   // Preparedstatement 사용 sql 쿼리 보내기
   String sql = "select * from people_login where username = '" + username + "' AND password = '" + password + "'";
   PreparedStatement preparedStatement = connection.prepareStatement(sql);
 
   // 쿼리 실행하기
   ResultSet resultSet = preparedStatement.executeQuery();
    if (resultSet.next()) {
     return true;
    } else {
     return false;
    }
 
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  return false;
 }
 
// 새로운 사용자 추가 메서드
 public boolean insert (String username, String password) {
 
  try {
   // 드라이버 클래스 로딩
   Class.forName(driverClass);
   // 커넥션 개체 가져오기 (위에서 설정한 url, username, password)
   Connection connection = DriverManager.getConnection(url, dbuid, dbpwd);
 
   // Preparedstatement 사용 sql 쿼리 보내기
   String sql = "insert into java.people_login (username, password) values ('" + username + "','" + password + "')";
   PreparedStatement preparedStatement = connection.prepareStatement(sql);
 
   // 쿼리 실행하기
   int rowCount = preparedStatement.executeUpdate();
   
    if (rowCount > 0) {
     return true;
    } else {
     return false;
    }
 
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  return false;
 }
}
