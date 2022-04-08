package br.com.mariojp.condominio.controllers;

import java.io.IOException;

import br.com.mariojp.condominio.dao.UsuarioDAO;
import br.com.mariojp.condominio.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class cadastroController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioDAO dao = new UsuarioDAO();

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");

		Usuario user = new Usuario(login, senha);
		// String nulo = "";
		if ((login.equals("")) || (senha.equals(""))) {
			resp.sendRedirect("/cadastro.jsp");
		} else {
			dao.save(user);
			resp.sendRedirect("/lista.jsp");
		}

	}
}
