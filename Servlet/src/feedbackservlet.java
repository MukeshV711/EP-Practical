import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Servlet implementation

class feedbackservlet*/
public class feedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * 
	 * @see HttpServlet#HttpServlet()
	 */

	public feedbackservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 * response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie ck[] = request.getCookies();

		if (ck != null) {
			String id = ck[0].getValue();
			String feedback = (request.getParameter("rating"));
			String suggestions = request.getParameter("suggestions");

			int regno = Integer.parseInt(id);
			feedbackBean fb = new feedbackBean();
			fb.setId(regno);
			fb.setFeedback(feedback);
			fb.setSuggestions(suggestions);
			DAO d = new DAO();
			try {
				int i = d.sendfeedback(fb);
				PrintWriter pw = response.getWriter();
				if (i > 0) {
					pw.print("Feedback Taken");
				} else {
					pw.print("Feedback failed");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			response.sendRedirect("index.html");
		}

	}

	/*
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}