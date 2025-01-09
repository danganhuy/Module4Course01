<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer list</title>
    <style>
        table {
            border: 1px solid #000;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #000;
        }
    </style>
</head>
<body>
    <table>
        <caption>Customers List ${value}</caption>
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Email</th>
                <th>Địa chỉ</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${requestScope.customers}">
                <tr>
                    <td><c:out value="${c.id}"/></td>
                    <td><a href="">${c.name}</a></td>
                    <td><c:out value="${c.email}"/></td>
                    <td><c:out value="${c.address}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
