<%-- 
    Document   : TabelMahasiswa
    Created on : Oct 9, 2017, 1:29:35 AM
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
        <h1>Tabel Mahasiswa</h1>
        <table style="border: 2px solid blue">
            <thead>
                <tr>
                    <td>NIM</td>
                    <td>Nama</td>
                    <td>Alamat</td>
                    <td>Action</td>
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${listMahasiswa}" var="mhs">
                <tr>
                    <td><c:out value="${mhs.nim}" /></td>
                    <td><c:out value="${mhs.nama}" /></td>
                    <td><c:out value="${mhs.alamat}" /></td>
                    <td><a href="MahasiswaServlet?action=update&nim=${mhs.nim}">edit</a></td>
                    <td><a href="MahasiswaServlet?action=delete&nim=${mhs.nim}">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <p><a href="CreateMahasiswa.jsp">Tambah Mahasiswa</a>|<a href="Index.jsp">Kembali</a><br/>
    </body>
</html>
