package br.com.mariojp.condominio.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.mariojp.condominio.dao.UsuarioDAO;
import br.com.mariojp.condominio.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");

		UsuarioDAO dao = new UsuarioDAO();
		Usuario u = dao.findByLogin(login);
		UsuarioListController user = new UsuarioListController();
		//UsuarioListDisp userEnt = new UsuarioListDisp();
        //tentar usar o doGet
		if (u == null) {
			
			resp.sendRedirect("/login.jsp");
		} else {
			if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
				user.doGet(req, resp);
				//esse doGet aponta para lista.jsp
				//resp.sendRedirect("/lista.jsp");
			} else { 
				
				resp.sendRedirect("/login.jsp");
			}
		}

	}
}

