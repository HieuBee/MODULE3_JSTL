<%@ page import="com.example.module3_javaweb.entity.ProductDiscount" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2023
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>Product Description: </td>
            <td>${productDescription}</td>
        </tr>
        <tr>
            <td>List Price: </td>
            <td>${listPrice}</td>
        </tr>
        <tr>
            <td>Discount Percent: </td>
            <td>${discountPercent / 100}</td>
        </tr>
        <tr>
            <td>Discount Amount: </td>
            <td>${listPrice * discountPercent * 0.01}</td>
        </tr>
        <tr>
            <td>Discount Price: </td>
            <td>${listPrice * (listPrice * discountPercent * 0.01)}</td>
        </tr>
    </table>
</body>
</html>
