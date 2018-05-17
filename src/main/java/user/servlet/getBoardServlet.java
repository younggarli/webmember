package user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.BoardVO;
import user.service.UserService;
import user.service.UserServiceInf;

@WebServlet("/getBoardServlet")
public class getBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInf service;
	
    public getBoardServlet() {
        super();
        service = new UserService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		
		BoardVO boardVO = service.getBoard(board_num);
		
		request.setAttribute("boardVO", boardVO);
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/Board.jsp");
		rd.forward(request, response);
	}


}
