package demo.testing;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

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
			result = formatOutput((tax.compute(Double.parseDouble(salary))));
		}
		out.println("Your Tax in year 2014 : " + result + " Baht.");
		out.flush();
		out.close();
	}
	
	public String formatOutput(double tax) {
		NumberFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMinimumFractionDigits(2);
		decimalFormat.setMaximumFractionDigits(2);
		decimalFormat.setGroupingUsed(false);
		return decimalFormat.format(tax);
	}
}
