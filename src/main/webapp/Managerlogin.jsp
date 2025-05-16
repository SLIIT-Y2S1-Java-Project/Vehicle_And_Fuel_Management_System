<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<!-- IT22555380 L.P.P.Wijesinghe -->
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
  

    <title>Manager Login</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
    <form action="login" method="post" class="form-signin">
      <img class="mb-4" src="logo/user.png" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Sign in</h1>
    
      <input type="text" id="inputEmail" name="username" class="form-control" placeholder="User Name" required autofocus>
    <br>
      <input type="password"  name="password" id="inputPassword" class="form-control" placeholder="Password" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit" name="submit">Sign in</button>
      
         <p class="mt-5 mb-20 text-muted">&copy; IT22555380 L.P.P. Wijesinghe</p> 
         </form>
  </body>
</html>
