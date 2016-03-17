<html>
<head>
    <link rel="stylesheet" href="css/wro.css"/>
</head>
<body>
<p> hello ${user} </p>
</b>
<p> Here are your clients </p>

<table class="table table-striped" width="80%">
<#list clients as client>
  <tr>
    <td>${client.clientId}
    <td>${client.name}
    <td>${client.countryCode}
</#list>
</table>

<form id="LogoutForm" role="form" action="/logout" method="post">
    <button class="btn btn-primary" type="submit">Logout</button>
</form>

<script src="js/wro.js" type="text/javascript"></script>
</body>
</html>
