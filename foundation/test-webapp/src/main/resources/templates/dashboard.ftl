<html>
<head>
    <link rel="stylesheet" href="css/wro.css"/>
</head>
<body>
<p> hello ${user} </p>
</b>
<p> Here are your clients </p>

<#--<#list cards>-->
<#--<table>-->
  <#--<#items as card>-->
  <#--<tr>-->
      <#--<td>${card.productName}-->
      <#--<td>${card.balance}-->
  <#--<td>${card.availableLimit}-->
    <#--</#items>-->
<#--</table>-->
<#--<#else>-->
<#--<p> no card information available-->
<#--</#list>-->

<form id="LogoutForm" role="form" action="/logout" method="post">
    <button class="btn btn-primary" type="submit">Logout</button>
</form>

<script src="js/wro.js" type="text/javascript"></script>
</body>
</html>
