<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>注册学生</p>
<form action="registerServlet" method="post">
    <table>
        <tr>
            <td>id:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>gender:</td>
            <td><input type="text" name="gender"></td>
        </tr>
        <tr>
            <td>email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="注册学生"></td>
        </tr>
    </table>
</form>
</body>
</html>