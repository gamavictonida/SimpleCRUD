<%-- 
    Document   : CreateJurusan
    Created on : Oct 9, 2017, 2:51:38 AM
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
        <h2>Jurusan Baru</h2>
				<form method="POST" action='JurusanServlet' class="form-inline">
					<input type="hidden" name="idJurusan" value="">
					<div class="form-group">
						<label for="namaJurusan">Nama:</label> <input type=text"
							class="form-control"  name="namaJurusan"
							placeholder="Masukkan nama">
					</div>

					<button type="submit" class="btn btn-default">Submit</button>
				</form>
        
    </body>
</html>
