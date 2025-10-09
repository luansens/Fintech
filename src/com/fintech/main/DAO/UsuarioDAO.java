package com.fintech.main.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.fintech.main.usuario.Usuario;

public class UsuarioDAO {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public List<Usuario> getAll() {
        List<Usuario> users = new ArrayList<>();
        String sql = "SELECT id, nome, documento, dataNascimento, fotoDePerfilUrl, senha FROM users";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Usuario user = new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("documento"),
                    rs.getDate("dataNascimento").toLocalDate(),
                    rs.getString("fotoDePerfilUrl"),
                    rs.getString("senha")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
