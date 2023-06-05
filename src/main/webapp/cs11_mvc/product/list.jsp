<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/8/2023
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display all product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <style>
        th, td{
            padding: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>All product</h1>
                <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px">
                    <a style="color: white; text-decoration: none" href="/product?action=create">Create new product</a>
                </button>
                <fmt:setLocale value="vi_VN"/>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Origin</th>
                        <th></th>
                    </tr>
                    <c:forEach items="${products}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td><fmt:formatNumber value="${p.price}" type="currency"/></td>
                            <td style="text-align: center">${p.quantity}</td>
                            <td>${p.origin}</td>
                            <td>
                                <button type="button" class="btn btn-primary">
                                    <a style="color: white; text-decoration: none" href="/product?action=detail&id=${p.id}">Detail</a>
                                </button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#${p.id}">
                                    Delete
                                </button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-secondary">
                                    <a style="color: white; text-decoration: none" href="/product?action=update&id=${p.id}">Update</a>
                                </button>
                            </td>
                        </tr>
                        <%-- Delete --%>
                        <div class="modal fade" id="${p.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        Are you sure?
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                        <button type="button" class="btn btn-primary">
                                            <a style="color: white" href="/product?action=delete&id=${p.id}">Delete</a>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%-- End Delete --%>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</body>
<script>
    // const myModal = document.getElementById('myModal')
    // const myInput = document.getElementById('myInput')
    //
    //
    // myModal.addEventListener('shown.bs.modal', () => {
    //     myInput.focus()
    // })
    // const myModal = new bootstrap.Modal(document.getElementById('myModal'), options)
</script>
</html>
