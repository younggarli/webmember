package user.servlet;

import java.io.IOException;
import java.util.Map;

import javax.print.attribute.standard.Severity;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.service.UserService;
import user.service.UserServiceInf;

@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInf service;
	
    public BoardServlet() {
        super();
        service = new UserService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pageString = request.getParameter("page");
		int page = pageString == null ? 1: Integer.parseInt(pageString);	

		String pageSizeString = request.getParameter("pageSize");
		int pageSize = pageSizeString == null ? 10: Integer.parseInt(pageSizeString);	
		
		Map<String, Object> resultMap = service.getBoardPageList(page, pageSize);
		request.setAttribute("boardList", resultMap.get("boardList"));
		request.setAttribute("pageNav", resultMap.get("pageNav"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/BoardList.jsp");
		rd.forward(request, response);
	}


}
