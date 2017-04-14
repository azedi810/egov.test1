package java.tutorial.gui.example.ibatismysql;


import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
 
import java.io.IOException;
import java.io.Reader;
 
public class SqlMapConfig {
 
    protected static final SqlMapClient sqlMap;
 
    static {
        try {
        	System.out.println("config/sql/SqlMapConfig.xml  읽는다 222  " );
            Reader reader = Resources.getResourceAsReader("config/sql/SqlMapConfig.xml");
            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
        } catch (IOException e) {
            throw new RuntimeException("  ###  IOException  vv 에러 1 :### " + e, e);
        } catch (Exception e){
            throw new RuntimeException("  ### Exception 에러 vv  2 : ###" + e, e);
        }
    }
 
    public static SqlMapClient getSqlMap() {
        return sqlMap;
    }
}
/*
Caused by: java.lang.RuntimeException:  
IOException 에러 1 Fatal Error, ga dapet sqlmapconfignya.  

Cause: java.io.IOException: 

Could not find resource config/sql/SqlMapMysqlConfig.xml
at example.ibatismysql.SqlMapConfig.<clinit>(SqlMapConfig.java:21)
... 37 more*/