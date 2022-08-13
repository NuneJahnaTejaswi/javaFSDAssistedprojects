<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

  <center> <h1> Login for Learners Portal </h1> </center>   
    <form action="AdminControllerServlet" method="POST">  
        <center> <div>   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   
            <br/>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br><br/>
            <button type="submit">Login</button>   
            <br/>
             
        </div></center>  
    </form>     


</body>
</html>