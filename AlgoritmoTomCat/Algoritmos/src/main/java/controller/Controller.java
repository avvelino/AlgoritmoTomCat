package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.algoritmosJava;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Controller
 */

@WebServlet(urlPatterns = { "/Js", "/Java", "/Cont", "/teste" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private algoritmosJava modeloJava = new algoritmosJava();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/Js")) {
			apJs(request, response);
		} else if (action.equals("/Java")) {
			apJv(request, response);
		} else if (action.equals("/teste")) {
			System.out.println(action);
			formNPrimo(request, response);
		}

	}

	protected void apJs(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("appJS.html");
	}

	protected void apJv(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("appJava.jsp");
	}

	protected void formNPrimo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String t = request.getParameter("txtTeste");
		System.out.println(t);
		String testando = modeloJava.nPrimo(t);
		request.setAttribute("txt", testando);
		RequestDispatcher rd = request.getRequestDispatcher("appJava.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
