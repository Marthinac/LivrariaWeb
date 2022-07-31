<%--
  Created by IntelliJ IDEA.
  User: marth
  Date: 30/07/2022
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Book's List</title>
</head>
<body>
<table border ="solid">
    <tr>
        <th>Name</th>
        <th>Autor</th>
    </tr>
    <c:forEach var="livro" items="${livros}" varStatus="id">
        <tr>

            <td>${livro.nome}</td>
            <td>${livro.autor}</td>
        </tr>
    </c:forEach>
</table>
<a href="cadastro-livro.jsp">Register another book</a>
</body>
</html>