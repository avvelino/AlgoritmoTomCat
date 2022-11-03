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

@WebServlet(urlPatterns = { "/Js", "/Java", "/Cont", "/algoritmo1", "/algoritmo2", "/algoritmo3", "/algoritmo4", "/algoritmo5", "/algoritmo6" })
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
		} else if (action.equals("/algoritmo1")) {
			System.out.println(action);
			formNPrimo(request, response);
		} else if (action.equals("/algoritmo2")) {
			System.out.println(action);
			formSomatorio(request, response);
		}else if (action.equals("/algoritmo3")) {
			System.out.println(action);
			formFibo(request, response);
		}else if (action.equals("/algoritmo4")) {
			System.out.println(action);
			formMDC(request, response);
		}else if (action.equals("/algoritmo5")) {
			System.out.println(action);
			formSort(request, response);
		}else if (action.equals("/algoritmo6")) {
			System.out.println(action);
			formCont(request, response);
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
		String alg = modeloJava.nPrimo(t);
		request.setAttribute("txt", alg);
		RequestDispatcher rd = request.getRequestDispatcher("appJava.jsp");
		rd.forward(request, response);
	}
	
	protected void formSomatorio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String t = request.getParameter("txtTeste");
		System.out.println(t);
		String alg = modeloJava.somatorio(t);
		request.setAttribute("txt", alg);
		RequestDispatcher rd = request.getRequestDispatcher("appJava.jsp");
		rd.forward(request, response);
	}
	
	protected void formFibo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String t = request.getParameter("txtTeste");
		System.out.println(t);
		String alg = modeloJava.fibonacci(t);
		request.setAttribute("txt", alg);
		RequestDispatcher rd = request.getRequestDispatcher("appJava.jsp");
		rd.forward(request, response);
	}
	
	protected void formMDC(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String t1 = request.getParameter("txtTeste");
		String t2 = request.getParameter("txtTeste1");
		System.out.println(t1+" "+t2);
		String alg = modeloJava.calculaMDC(t1, t2);
		request.setAttribute("txt", alg);
		RequestDispatcher rd = request.getRequestDispatcher("appJava.jsp");
		rd.forward(request, response);
	}
	
	protected void formSort(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String t = request.getParameter("txtTeste");
		System.out.println(t);
		String alg = modeloJava.quickShort(t);
		request.setAttribute("txt", alg);
		RequestDispatcher rd = request.getRequestDispatcher("appJava.jsp");
		rd.forward(request, response);
	}
	
	protected void formCont(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String t = request.getParameter("txtTeste");
		String t1 = request.getParameter("txtTeste1");
		System.out.println(t);
		System.out.println(t1);
		String alg = modeloJava.contagem(t, t1);
		request.setAttribute("txt", alg);
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
