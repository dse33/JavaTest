package Szt.test.SqlHelp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class SqlConnect {
	
	@Value("${datasource.url}")
	private String url;
	@Value("${datasource.username}")
	private String username;
	@Value("${datasource.password}")
	private String password;
	
  public String SqlSend() throws SQLException{


      String sql = "{call dbo.Prd_Item_LotCode_Message(?,?)} ";
	  Connection conn = DriverManager.getConnection(url, username, password);
	  CallableStatement proc = conn.prepareCall(sql);
	  proc.setString(1, "sdasd");
	  proc.setString(2, "sdasd");
	  proc.execute();
	  return "sadss";
  }
}
