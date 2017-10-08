<%-- 
    Document   : CreateMahasiswa
    Created on : Oct 9, 2017, 1:46:42 AM
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
        <h2>Mahasiswa Baru</h2>
				<form method="POST" action='MahasiswaServlet' class="form-inline">
					<input type="hidden" name="nim" value="">
					<div class="form-group">
						<label for="nama">Nama:</label> <input type=text"
							class="form-control"  name="nama"
							placeholder="Masukkan nama">
					</div>
					<div class="form-group">
						<label for="alamat">Alamat:</label> <input type="text"
							class="form-control" id="alamat" name="alamat"
							placeholder="Masukkan alamat">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
        
    </body>
</html>
