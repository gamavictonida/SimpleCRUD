/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgs.mgsproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User HP
 */
public class MahasiswaService {
   private Connection connection;

	public MahasiswaService() {
		connection = DbUtil.getConnection();
	}

	public void createMahasiswa(Mahasiswa mahasiswa) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into mahasiswa values (0, ?, ? )");
			// Parameters start with 1
			preparedStatement.setString(1, mahasiswa.getNama());
			preparedStatement.setString(2, mahasiswa.getAlamat());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int mahasiswaId) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from mahasiswa where nim=?");
			// Parameters start with 1
			preparedStatement.setInt(1, mahasiswaId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(Mahasiswa mahasiswa, String idMahasiswa) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("update mahasiswa set nama=?, alamat=?" +
							"where nim=?");
			// Parameters start with 1
			preparedStatement.setString(1, mahasiswa.getNama());
			preparedStatement.setString(2, mahasiswa.getAlamat());
			preparedStatement.setString(3, idMahasiswa);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Mahasiswa> getAllMahasiswas() {
		List<Mahasiswa> mahasiswas = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from mahasiswa");
			while (rs.next()) {
				Mahasiswa mahasiswa = new Mahasiswa();
				mahasiswa.setNim(rs.getInt("nim"));
				mahasiswa.setNama(rs.getString("nama"));
				mahasiswa.setAlamat(rs.getString("alamat"));
				mahasiswas.add(mahasiswa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mahasiswas;
	}
	
	public Mahasiswa getMahasiswaById(int mahasiswaId) {
		Mahasiswa mahasiswa = new Mahasiswa();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select * from mahasiswa where nim=?");
			preparedStatement.setInt(1, mahasiswaId);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				mahasiswa.setNim(rs.getInt("nim"));
				mahasiswa.setNama(rs.getString("nama"));
				mahasiswa.setAlamat(rs.getString("alamat"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mahasiswa;
	}
}
