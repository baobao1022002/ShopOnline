package vn.projectLTW.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DBConnection {
	private final static String serverName="localhost";//., 127.0.0.1
	private final static String dbName="ShopOnline" ;
	private final static String  portNumber="1433";//8391  ,1433
	private final static String  instance="";//SQL2019,MSQLSERVER
	private final String  userID="sa";
	private final String  password="bao01652";
	
	
	public Connection getConnection() throws Exception{
		Connection connection=null;
		String connectionURL="jdbc:sqlserver://"+serverName+":"+portNumber+instance+";databaseName="+dbName;
		 if(instance==null || instance.trim().isEmpty())
			 connectionURL="jdbc:sqlserver://"+serverName+":"+portNumber+instance+";databaseName="+dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection=DriverManager.getConnection(connectionURL,"sa","bao01652");
		System.out.println("Ket noi co so du lieu thanh cong");
		
		return connection;
	}
	

		
	


	public static void main(String[] args) throws SQLException{
		try {
			System.out.println(new DBConnection().getConnection());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
			
}
