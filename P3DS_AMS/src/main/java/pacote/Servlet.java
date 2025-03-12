package pacote;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(
				request.getParameter("num"));
		
		HttpSession session = request.getSession();
		int resp = fatorial(num);
		
		StringBuilder textoSb = new StringBuilder();
		for (int i=num;i>0;i--) {
			textoSb.append(i+" . ");
		}
		String texto = textoSb.toString().substring(0,textoSb.toString().length()-3);
		
		session.setAttribute("num", num);
		session.setAttribute("resp", resp);
		session.setAttribute("texto", texto);
		response.sendRedirect("resp.jsp");
	}

	private int fatorial(int num) {
		int resp = 1;
		for (int i=num;i>0;i--) {
			resp = resp * i;
		}
		
		return resp;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
