package demo;

import demo.tennis.Grade;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet(name = "GradeController", urlPatterns = { "/grade" })
public class GradeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String score = req.getParameter("score");

        //TODO
		Grade grade = new Grade();
		String result = grade.convert(Integer.parseInt(score));

        String output = "You got grade " + result;
		out.write(output.getBytes("UTF-8"));

		out.flush();
		out.close();
	}
}
