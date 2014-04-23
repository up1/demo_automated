package demo.testing;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(name = "TaxController", urlPatterns = { "/tax/calculate" })
public class TaxController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		String result = "";
		String salary = req.getParameter("salary");
		if( salary != null && !salary.equals("") ) {
			Tax tax = new Tax();
			result = Double.toString(tax.compute(Integer.parseInt(salary)));
		}
		out.println("<H2>Your Tax in this 2014 : " + result + " Baht.</H2>");
		out.flush();
		out.close();
	}
}
