<html>
<head>
<link rel="stylesheet" href="css/wro.css"/>
</head>
<body>
  <p>hello ${customer.name} </p>
  <form role="form" action="logout" method="post">
      <input type="hidden" id="csrf_token" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <button class="btn btn-primary" type="submit">Logout</button>
  </form>
  <script src="js/wro.js" type="text/javascript"></script>
</body>
</html>
