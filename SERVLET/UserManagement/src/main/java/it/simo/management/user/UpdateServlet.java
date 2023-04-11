package it.simo.management.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/aggiornaUtente")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	public void init() {
		try {
			System.out.println("init()");
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "simodev20");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		System.out.println("doPost()");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("UPDATE user SET password='"+password+"' WHERE email='"+email+"'");
			PrintWriter out = response.getWriter();
			if (result > 0) {
				out.print("<H1>La password è stata modificata</H1");
			} else {
				out.print("<H1>Errore nel salvare l'utente</H1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void destroy() {
		try {
			System.out.println("destroy()");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}