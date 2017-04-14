package example.ibatismysql;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
//import com.ibatis.common.logging.LogFactory;
//import com.mysql.jdbc.log.Log;
//import common.Logger;

public class IbatisConnect {

//	private static final Log LOG = (Log) LogFactory.getLog(IbatisConnect.class);	
//	private  Logger log =  Logger.getLogger(this.getClass());
	
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		final SqlMapClient sqlMap;
    	System.out.println("###############" );
    	
//    	LOG.logInfo("vvvvvv");
        try {
        	System.out.println("config/sql/SqlMapConfig.xml  reading.............  " );
        	
//        	LOG.info("config/sql/SqlMapConfig.xml  reading.............  " );
        	
            Reader reader = Resources.getResourceAsReader("config/sql/SqlMapConfig.xml");
//            Reader reader = Resources.getResourceAsReader("config/sql/SqlMapConfig.xml");
            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
            
            List list = sqlMap.queryForList("MyLottoSql.getList","a");
            for(int i=0; i < list.size(); i++) {
            	System.out.println("--> " + list.get(i) );
            }
        } catch (IOException e) {
            throw new RuntimeException("  ###  IOException  vv 에러 1 :### " + e, e);
        } catch (Exception e){
            //throw new RuntimeException("  ### Exception 에러 vv  2 : ###" + e, e);
            e.printStackTrace();
        }
        
	}

}
