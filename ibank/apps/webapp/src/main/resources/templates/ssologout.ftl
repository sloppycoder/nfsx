<html>
<head>
<link rel="stylesheet" href="css/wro.css"/>
    <script type="text/javascript">

        window.onload = function()  {
            $('#logoutForm').submit();
        };

    </script>

</head>
<body>
  <form id="logoutForm" role="form" action="/logout" method="post">
      <input type="hidden" id="csrf_token" name="${_csrf.parameterName}" value="${_csrf.token}"/>
  </form>

  <script src="js/wro.js" type="text/javascript"></script>

</body>
</html>
