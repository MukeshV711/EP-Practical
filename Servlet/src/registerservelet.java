import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Servelet implementation

class registerservelet*/

public class registerservelet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		/*

		@see HttpServlet#HttpServlet()
     */

		public registerservelet() {
			super();
			// TODO Auto-generated constructor stub
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("username");
			String password = request.getParameter("pass");
			int section = Integer.parseInt(request.getParameter("section"));
			int year = Integer.parseInt(request.getParameter("year"));

			Bean obj = new Bean();
			obj.setId(id);
			obj.setName(name);
			obj.setPassword(password);
			obj.setSection(section);
			obj.setYear(year);

			DAO obj2 = new DAO();
			try {
				int i = obj2.insert(obj);
				if (i > 0) {
					PrintWriter pw = response.getWriter();
					pw.print("insertion successfull");

				} else {
					PrintWriter pw = response.getWriter();
					pw.print("failed");
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}