<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
Please Enter The Detail For FIABCI Conference 
</head>
<body>
 <form method="post" action="register">
                      <select name="title">
    <option value="Mr">Mr</option>
    <option value="Miss">Miss</option>
    <option value="Mrs">Mrs</option>
    
  </select><br/>
       Fist Name:<input type="text" name="first_name" /><br/>
        Last Name:<input type="text" name="last_name" /><br/>
        User Email:<input type="text" name="email" /><br/>
       Gender:   <input type="radio" name="gender" value="male" checked> Male<br>
          <input type="radio" name="gender" value="female"> Female<br>
          Age:<input type="text" name="age" /><br/>
          Job Title:<input type="text" name="job_title" /><br/>
          Industry:<input type="text" name="industry" /><br/>
          Organization:<input type="text" name="organization" /><br/>
         
          Fiabci Membership:<input type="text" name="fiabci_membership" /><br/>
         Member Type:<input type="text" name="type_member" /><br/>
         Address:<input type="text" name="address" /><br/>
          Code:<input type="text" name="code" /><br/>
        Postal Code:<input type="text" name="postal_code" /><br/>
         City:<input type="text" name="city" /><br/>
          Country:<input type="text" name="country" /><br/>
         Phone Number:<input type="text" name="phone" /><br/>
          Mobile Number:<input type="text" name="mobile" /><br/>
  <br>
        <input type="submit" value="register" />
        </form>
        <form action="display" >
        For Display Data <input type="submit" value="Display">
        
        
        </form>
</body>
</html>