package com.fintech.tests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.fintech.main.DAO.UsuarioDAO;
import static org.junit.jupiter.api.Assertions.*;


class UsuarioDAOTests {

    private UsuarioDAO usuarioDAO;

    @BeforeEach
    void setUp() {
        usuarioDAO = new UsuarioDAO();
    }

    @Test
    void getAllUsuarios() {
        var usuarios = usuarioDAO.getAll();
        assertNotNull(usuarios, "The list of users should not be null");
        assertTrue(usuarios.size() >= 0, "The list of users should have zero or more users");
    }
}