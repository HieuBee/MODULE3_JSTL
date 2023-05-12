<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2023
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    tr>td {
        text-align: center;
        padding-top: 10px;
        padding-right: 10px;
    }
</style>
<body>
    <h1>List Customer</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Img</th>
        </tr>
        <c:forEach items="${customerList}" var="c">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.birthday}</td>
                <td>${c.address}</td>
                <td>
                    <img src="${c.picture}" alt="anh" width="100px">
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
