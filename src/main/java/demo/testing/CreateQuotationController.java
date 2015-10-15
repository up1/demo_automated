package demo.testing;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(name = "GradeController", urlPatterns = { "/quotation/create" })
public class CreateQuotationController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QuotationView quotationView = new QuotationView();
		quotationView.setTitle("DEMO");
		
		
		
		req.setAttribute("quotation", quotationView);
		req.getRequestDispatcher("/quotation.jsp").forward(req,resp);
	}
}
