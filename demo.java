import java.sql.*;
class demo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ami", "root", " ");
			System.out.println("connected");
			con.close();
		}	
		catch(Exception e)
		{
		System.out.println("not connect");		
		}
	}
}