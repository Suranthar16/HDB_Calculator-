
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;


import HDB_DAO.DAO;
import HDB_DTO.DTO;

/**
 * Servlet implementation class HDB_LoginServlet
 */
@WebServlet("/HDB_LoginServlet")
public class HDB_LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HDB_LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		DTO dto = new DTO();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		dto.setUsername(username);
		dto.setPassword(password);

		System.out.println("input_username=" + username);
		System.out.println("input_password=" + password);

		DAO dao = new DAO();

		jsonread jsread = new jsonread();
		boolean result= jsread.main(dto);

		

		dao.calculator(dto);

		if (result) {
			response.sendRedirect("HDB_Calculator.jsp");
		} else {
			response.sendRedirect("HDB_Login.jsp?error="+"Your Username and Password Missmatch!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
