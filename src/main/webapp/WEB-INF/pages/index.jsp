
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello, ${key}

<form action="/save" method="post">
    <input type="text" name="name" placeholder="name">
    <input type="text" name="lastName" placeholder="lastName">
    <input type="submit" value="save">
</form>

You have ${keyProduct}

<form action="/saveProduct" method="post">
    <input type="text" name="productName" placeholder="product">
    <input type="submit" value="buy"/>
</form>
<a href="form">go to springform</a>
</body>
</html>
