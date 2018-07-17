package local;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Display() {
        super();
      
    }

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			PrintWriter out = response.getWriter();
		String url = "jdbc:sqlserver://localhost:1433;instanceName=Fiabci";
		String uname = "AliSql";
		String pass = "sa4067673";
		//String query = "insert Sql.dbo.Student (userid,username) values (9, 'Allah ho')";
		String query = "select * from Fiabci.dbo.web_guests" ;
		//String query = "{call spStudent}";
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//Class.forName("com.sqlserver.jdbc.driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
	//	CallableStatement st=con.prepareCall(query);
		ResultSet rs= st.executeQuery(query);
		String str="<table border=1><tr><th>code</th><th>title</th><th>first_name</th><th>last_name</th><th>email</th><th>gender</th><th>age</th><th>job_title</th><th>industry</th><th>address</th><th>organization</th><th>type_member</th><th>fiabci_membership</th><th>postal_code</th><th>city</th><th>country</th><th>phone</th><th>mobile</th></tr>";
		while(rs.next()) {
		
			str +="<tr><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"</td><td>"+rs.getString(13)+"</td><td>"+rs.getString(14)+"</td><td>"+rs.getString(15)+"</td><td>"+rs.getString(16)+"</td><td>"+rs.getString(17)+"</td><td>"+rs.getString(18)+"</td><td>"+rs.getString(19)+"</td></tr>";
		/*
		 String code = rs.getString("code");
	        String title = rs.getString("title");
	        String first_name = rs.getString("first_name");
	        String last_name = rs.getString("last_name");
	        String email = rs.getString("email");
	        String gender = rs.getString("gender");
	        String age = rs.getString("age");
	        String job_title = rs.getString("job_title");
	        String industry = rs.getString("industry");
	        String address = rs.getString("address");
	        String organization = rs.getString("organization");
	        String type_member = rs.getString("type_member");
	        String fiabci_membership = rs.getString("fiabci_membership");
	        String postal_code = rs.getString("postal_code");
	        String city = rs.getString("city");
	        String country =rs.getString("country");
	        String phone = rs.getString("phone");
	        String mobile = rs.getString("mobile");
		
	
	  out.format("%s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s,  %s\n",code
		      ,title
		    	      ,first_name
		    	      ,last_name
		    	      ,email
		    	      ,gender
		    	      ,age
		    	      ,job_title
		    	      ,industry
		    	      ,address
		    	      ,organization
		    	      ,type_member
		    	      ,fiabci_membership
		    	      ,postal_code
		    	      ,city
		    	      ,country
		    	      ,phone
		    	      ,mobile);*/
		}
		str +="</table>";
		out.println(str);
		st.close();
		con.close();
		}catch(Exception se)
        {
            se.printStackTrace();
            System.out.println("There is some error ");
            
        }
	}

}
