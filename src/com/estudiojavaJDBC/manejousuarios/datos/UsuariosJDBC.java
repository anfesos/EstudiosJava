package com.estudiojavaJDBC.manejousuarios.datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.estudiojavaJDBC.manejousuarios.domain.*;

public class UsuariosJDBC {

	private final static String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?,?)";

	private final static String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario=?";

	private final static String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

	private final static String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario ORDER BY id_usuario";

	public int insert(String usuario, String password) {

		Connection userConn = null;
		PreparedStatement ps = null;

		int rows = 0;

		try {

			userConn = Conexion.getConnection();
			ps = userConn.prepareStatement(SQL_INSERT);
			int index = 1;
			System.out.println("Ejecutando Query: " + SQL_INSERT);
			ps.setString(index++, usuario);
			ps.setString(index, password);
			rows = ps.executeUpdate();
			System.out.println("Número de registros insertados: " + rows);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexion.close(ps);
			Conexion.close(userConn);
		}

		return rows;
	}

	public int update(String usuario, String password, int id_usuario) {

		Connection userConn = null;
		PreparedStatement ps = null;

		int rows = 0;

		try {
			userConn = Conexion.getConnection();
			ps = userConn.prepareStatement(SQL_UPDATE);
			System.out.println("Ejecutando Query: " + SQL_UPDATE);
			int index = 1;

			ps.setString(index++, usuario);
			ps.setString(index++, password);
			ps.setInt(index, id_usuario);

			rows = ps.executeUpdate();

			System.out.println("Número de registros actualizados: " + rows);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexion.close(ps);
			Conexion.close(userConn);
		}

		return rows;
	}

	public int delete(int id_usuario) {

		Connection userConn = null;
		PreparedStatement ps = null;

		int rows = 0;

		try {
			userConn = Conexion.getConnection();
			ps = userConn.prepareStatement(SQL_DELETE);
			System.out.println("Ejecutando Query: " + SQL_DELETE);
			ps.setInt(1, id_usuario);
			rows = ps.executeUpdate();
			System.out.println("Número de registros eliminados: " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexion.close(ps);
			Conexion.close(userConn);
		}

		return rows;
	}

	public List<Usuario> select() {

		Connection userConn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario user = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			
			userConn = Conexion.getConnection();
			ps = userConn.prepareStatement(SQL_SELECT);
			rs = ps.executeQuery();

			while (rs.next()) {

				int id_usuario = rs.getInt(1);
				String usuario = rs.getString(2);
				String password = rs.getString(3);
				user = new Usuario();
				user.setId_usuario(id_usuario);
				user.setUsuario(usuario);
				user.setPassword(password);
				usuarios.add(user);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexion.close(rs);
			Conexion.close(ps);
			Conexion.close(userConn);
		}

		return usuarios;

	}

}
