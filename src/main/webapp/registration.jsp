<%--
  Created by IntelliJ IDEA.
  User: marth
  Date: 30/07/2022
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Books Registration</title>
</head>
<body>
<h1>Books Registration</h1>
<fieldset>
    <legend>Basic Data</legend>
    <form action="livro-servlet" method="post">

        <div>
            <label for="idName">Nome:</label>
            <input type="text" id="idName" name="Name">
        </div>
        <div>
            <label for="idAutor">Autor:</label>
            <input type="text" id="idAutor" name="Autor">
        </div>

        <input type="submit" value="Send">
    </form>
</fieldset>

</body>
</html>