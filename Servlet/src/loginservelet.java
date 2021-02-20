import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Servlet implementation

class logout*/
public class loginservelet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		/*

		@see HttpServlet#HttpServlet()
     */

		public loginservelet() {
			super();
			// TODO Auto-generated constructor stub
		}

		/*

		@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			request.getRequestDispatcher("index.html").include(request, response);
			Cookie ck = new Cookie("regno", "");
			ck.setMaxAge(0);
			response.addCookie(ck);
		}

		/*

		@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

}