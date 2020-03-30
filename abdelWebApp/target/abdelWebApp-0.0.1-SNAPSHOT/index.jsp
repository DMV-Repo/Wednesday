<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <c:out value="Jetty JSP Configuration Example"></c:out>
    <br /> 
    <% System.out.println("Hello Java Code Geeks"); %>
    <div align="center" style="margin-top: 50px;">
  
        <form id="loginForm">
            Please enter your Username:  <input type="text" name="username" size="20px"> <br>
            Please enter your Password:  <input type="text" name="password" size="20px"> <br><br>
            <input type="submit" value="submit">
        </form>
  
        </div>
    </body>
</html>
