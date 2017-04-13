package egovframework.example.bbs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.example.bbs.web.EgovBBSController;

public class BBSDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EgovBBSController.class);
	
	DataSource ds;
	
	public BBSDao() {
		try {
			Context context = new InitialContext();
			Context envCtx = (Context)context.lookup("java:comp/env");
			ds = (DataSource)envCtx.lookup("jdbc/Oracle11g");
		} catch(NamingException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BBSDto>  list() {
		
		ArrayList<BBSDto> bdto = new ArrayList<BBSDto>();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet  rs = null;
		LOGGER.info("########################### BBSDao ######### ");
		
		try {
			conn = ds.getConnection();
			String query = "SELECT NUM, UPDATE_D, SU1, SU2, SU3, SU4, SU5, SU6, SU7   "
					+ "FROM T_ETC_LOTTO "
					+ "ORDER BY NUM DESC";
			
			LOGGER.info("오라클접속 리스트 query --> " + query);
			
			st = conn.prepareStatement(query); 
			rs = st.executeQuery();
			
			if(rs.next()) {
				do {
					int num=rs.getInt("NUM");
					int su1=rs.getInt("SU1");
					String update_d=rs.getString("UPDATE_D");
					int su2=rs.getInt("SU2");
					int su3=rs.getInt("SU3");
					int su4=rs.getInt("SU4");
					int su5=rs.getInt("SU5");
					int su6=rs.getInt("SU6");
					int su7=rs.getInt("SU7");
					
					//LOGGER.info("오라클접속 데이터 뿌리기 --> " + num + ", " + update_d + ", " + su1 + ", " + su2 + ", " + su3 + ", " + su4 + ", " + su5 + ", " + su6 + ", ");
					BBSDto dto = new BBSDto(num, su1, su2, su3, su4, su5, su6, su7, update_d);
					bdto.add(dto);
				} while(rs.next());
			} else {
				LOGGER.info("테이터가 없습니다. ");
			}
		} catch (Exception e) {
			LOGGER.info("오라클접속 Exception --> " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		 
		
		return bdto;
		
	}

}
