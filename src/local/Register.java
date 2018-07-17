package local;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/register")
 
public class Register extends HttpServlet {
	
   
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String code = request.getParameter("code");
        String title = request.getParameter("title");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String job_title = request.getParameter("job_title");
        String industry = request.getParameter("industry");
        String address = request.getParameter("address");
        String organization = request.getParameter("organization");
        String type_member = request.getParameter("type_member");
        String fiabci_membership = request.getParameter("fiabci_membership");
        String postal_code = request.getParameter("postal_code");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String phone = request.getParameter("phone");
        String mobile = request.getParameter("mobile");
        
     
        String url = "jdbc:sqlserver://localhost:1433;instanceName=Fiabci";
    	String uname = "AliSql";
    	String pass = "sa4067673";
        try{
        	
        
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 

          Connection  con=DriverManager.getConnection  (url, uname, pass);
 
        	
       
        	
        PreparedStatement ps=con.prepareStatement ("insert Fiabci.dbo.web_guests (code \r\n" + 
        		"      ,title \r\n" + 
        		"      ,first_name \r\n" + 
        		"      ,last_name \r\n" + 
        		"      ,email \r\n" + 
        		"      ,gender \r\n" + 
        		"      ,age \r\n" + 
        		"      ,job_title \r\n" + 
        		"      ,industry \r\n" + 
        		"      ,address \r\n" + 
        		"      ,organization \r\n" + 
        		"      ,type_member \r\n" + 
        		"      ,fiabci_membership \r\n" + 
        		"      ,postal_code \r\n" + 
        		"      ,city \r\n" + 
        		"      ,country \r\n" + 
        		"      ,phone \r\n" + 
        		"      ,mobile) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
       
        
        ps.setString(1,code);
        ps.setString(2, title);
        ps.setString(3, first_name);
        ps.setString(4, last_name);
        ps.setString(5, email);
        ps.setString(6, gender);
        ps.setString(7, age);
        ps.setString(8, job_title);
        ps.setString(9, industry);
        ps.setString(10, address);
        ps.setString(11, organization);
        ps.setString(12, type_member);
        ps.setString(13, fiabci_membership);
        ps.setString(14, postal_code);
        ps.setString(15, city);
        ps.setString(16, country);
        ps.setString(17, phone );
        ps.setString(18, mobile);
       /* if(gender=="checked") 
            gender="Male";
    else if(gender=="checked") 
            gender="Female";*/
        int i=ps.executeUpdate();
       
        
          if(i>0)
          {
            out.println("You are sucessfully registered");
          }else{
	  out.println("Failed in  registration");
	  } con.close();
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
            System.out.println("There is some error ");
            
        }
	
      
	
	
      } 
    
  }