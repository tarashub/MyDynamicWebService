<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<title>Title</title>
<sf:form action="addUser" modelAttribute="eUser" method="post">
    <sf:input path="name"/>
    <sf:errors path="name"/>
    <input type="submit"/>
</sf:form>
</body>
</html>
