package demo;

import demo.grade.Login;
import demo.tennis.TennisScoreAnnouncer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet(name = "TennisController", urlPatterns = { "/tennis" })
public class TennisController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("first_player_score", "x");
		request.setAttribute("second_player_score", "x");

        String firstPlayerWin = request.getParameter("first_player_win");

        TennisScoreAnnouncer tennisScoreAnnouncer =
                new TennisScoreAnnouncer();

        if(firstPlayerWin !=null) {
            tennisScoreAnnouncer.firstPlayerWin();
        }

        String result = tennisScoreAnnouncer.getAnnouncement();

		request.setAttribute("result", result);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("tennis.jsp");
		requestDispatcher.forward(request, response);
	}
}
