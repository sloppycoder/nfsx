<html>
<head>
<link rel="stylesheet" href="css/wro.css"/>
</head>
<body>
  <p> hello ${customer.name} </p>
  <p>  </p>

  <#list cards>
  <table>
    <#items as card>
      <tr>
      <td>${card.productName}
      <td>${card.balance}
      <td>${card.availableLimit}
    </#items>
  </table>
  <#else>
   <p> no card information available
  </#list>

  <form id="ssoLogoutForm" role="form" action="${sso_logout_url}" method="post">
      <button class="btn btn-primary" type="submit">Logout</button>
  </form>

  <script src="js/wro.js" type="text/javascript"></script>
</body>
</html>
