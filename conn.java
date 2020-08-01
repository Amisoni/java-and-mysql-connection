import java.sql.*;  
class conn{  
public static void main(String args[]){  
		try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ami","root","");  
//here ami is database name, root is username and ""(this is for your password if you have password in your db write "")  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from reg"); //write your table name 
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  // write your table fields
				con.close();  
			}
			catch(Exception e)
			{ 
				System.out.println(e);
			}  
										}  
		} 