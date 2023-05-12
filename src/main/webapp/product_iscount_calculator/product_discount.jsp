<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2023
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/discount" method="post">
        <table>
            <tr>
                <td><span>Input Product Description: </span></td>
                <td><input type="text" name="productDescription" /></td>
            </tr>
            <tr>
                <td><span>Input List Price: </span></td>
                <td><input type="text" name="listPrice" /></td>
            </tr>
            <tr>
                <td><span>Input Discount Percent: </span></td>
                <td><input type="text" name="discountPercent" /></td>
            </tr>
        </table>
        <br/>
        <input type="submit" value="Calculate Discount" />
    </form>
</body>
</html>
