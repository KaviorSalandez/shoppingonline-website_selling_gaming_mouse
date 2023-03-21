<%-- 
    Document   : login
    Created on : Oct 16, 2022, 9:21:05 PM
    Author     : Can Duy Khanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Register form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
.login-form {
    width: 340px;
    margin: 50px auto;
  	font-size: 15px;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
    font-size: 15px;
    font-weight: bold;
}
</style>
</head>
<body>
<div class="login-form">
    <form action="register" method="post">
        <h2 class="text-center">Register</h2>       
        <div class="form-group">
            <input name="user" type="text" class="form-control" placeholder="Username" required="required">
        </div>
        <div class="form-group">
            <input name="pass"    type="password" class="form-control" placeholder="Password" required="required">
        </div>
         <div class="form-group">
             <input name="name" type="text" class="form-control" placeholder="Name" required="required">
        </div>
         <div class="form-group">
             <input name="email" type="email" class="form-control" placeholder="Email" required="required">
        </div>
         <div class="form-group">
             <input  name="phone" type="text" class="form-control" placeholder="Phone Number" required="required">
        </div>
         <div class="form-group">
            <input name="address" type="text" class="form-control" placeholder="Address" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Create a new account</button>
        </div>
        <div>
            <h4 style="color:red">${requestScope.ms}</h4>
        </div>

    </form>
    <p class="text-center"><a href="login.jsp">Already have an account? Login </a></p>
</div>
</body>
</html>
