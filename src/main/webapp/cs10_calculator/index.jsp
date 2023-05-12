<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/5/2023
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple calculator</h1>
<form action="/calculator" method="post">
    <table>
        <tr>
            <td>Input first number: </td>
            <td><input type="text" name="firstNumber"></td>
        </tr>
        <tr>
            <td>Select operator: </td>
            <td>
                <select name="operator">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Input second number: </td>
            <td><input type="text" name="secondNumber"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Calculator"></td>
        </tr>
    </table>
</form>
</body>
</html>
