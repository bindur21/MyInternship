import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao 
{
private String dburl=("jdbc:mysql://localhost/userdb");
private String dbuname="root";
private String dbpassword="mysql";
private String dbdriver="com.mysql.jdbc.Driver";
public void loadDriver(String dbDriver)
{
	try {
		 Class.forName("com.mysql.jdbc.Driver");
         
	}
	catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
}

public Connection getConnection()
{
	Connection con=null;
	try {
	con=DriverManager.getConnection(dburl, dbuname, dbpassword);
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}
	return con;
}
public String insert(Member member)
{
	loadDriver(dbdriver);
	Connection con=getConnection();
	String result="data entered successfully";
	String sql="insert into member('uname','password','email','phone') values(?,?,?,?)";
	try {
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, member.getUname());
	ps.setString(2, member.getPassword());
	ps.setString(3, member.getEmail());
	ps.setString(4, member.getPhone());
	ps.executeUpdate();
	
	}
	catch (SQLException e)
	{
		e.printStackTrace();
		result="data not entered";
	}
	
	return result;
	
	
	
}




}
