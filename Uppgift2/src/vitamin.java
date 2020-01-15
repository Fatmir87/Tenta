

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class vitamin
 */
@WebServlet("/vitamin")
public class vitamin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vitamin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		
		String animal = request.getParameter("index");
		
		if(animal.equals("elephant"))
		{
			getAttribute("elephant");	
			out.print("<br>");
			System.out.print("<img src=\"1.png\">");
		}
		if(animal.equals("Car"))
		{
			getAttribute("car");	
			out.print("<br>");
			System.out.print("<img src=\"2.png\">");
		}
		if(animal.equals("Dog"))
		{
			getAttribute("dog");
			out.print("<br>");
			System.out.print("<img src=\"3.png\">");
		}

		if(animal.equals("Cat"))
		{
			getAttribute("cat");	
			out.print("<br>");
			System.out.print("<img src=\"4.png\">");
		}
		
	}

	private void getAttribute(String string) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
