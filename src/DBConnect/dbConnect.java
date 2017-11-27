package DBConnect;
import java.sql.*;
public class dbConnect {
    public String url = "localhost";
    public String port = "8889";
    public String database = "HacklnJava";
    public String user = "root";
    public String password = "root";
    public String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    Connection conn = null;

    //Function to Connect to DB
    public void Connect2DB()
    {
        String DB_URL = "jdbc:mysql://"+url+":"+port+"/"+database;
        Statement dbstmt=null;
        try {
            conn = DriverManager.getConnection(DB_URL,user,password);//Connect
            //dbstmt = conn.createStatement();
            System.out.println("Connected");
        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        //return dbstmt;
    }

}
