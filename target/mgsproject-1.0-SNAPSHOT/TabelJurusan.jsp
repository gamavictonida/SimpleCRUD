<%-- 
    Document   : TabelJurusan
    Created on : Oct 9, 2017, 12:45:05 AM
    Author     : User HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabel Jurusan</h1>
        <table style="border: 2px solid blue">
            <thead>
                <tr>
                    <td>ID Jurusan</td>
                    <td>Nama Jurusan</td>
                    <td>Action</td>
                    
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${listJurusan}" var="jrs">
                <tr>
                    <td><c:out value="${jrs.idJurusan}" /></td>
                    <td><c:out value="${jrs.namaJurusan}" /></td>
                    <td><a href="JurusanServlet?action=update&idJurusan=${jrs.idJurusan}">edit</a></td>
                    <td><a href="JurusanServlet?action=delete&idJurusan=${jrs.idJurusan}">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <p><a href="CreateJurusan.jsp">Tambah Jurusan</a>|<a href="Index.jsp">Kembali</a><br/>
    </body>
</html>
