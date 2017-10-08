<%-- 
    Document   : UpdateJurusan
    Created on : Oct 9, 2017, 3:09:07 AM
    Author     : User HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Update Data Jurusan</h2>
				<form method="POST" action='JurusanServlet' class="form-inline">
					<input type="hidden" name="idJurusan" value="${jurusan.idJurusan}">
					<div class="form-group">
						<label for="namaJurusan">Nama Jurusan:</label> <input type=text"
                                                                                       class="form-control"  name="namaJurusan" value="${jurusan.namaJurusan}"
							placeholder="Masukkan nama">
					</div>
					
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
    </body>
</html>
