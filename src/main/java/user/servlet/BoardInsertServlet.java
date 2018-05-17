package user.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import user.model.BoardVO;
import user.service.UserService;
import user.service.UserServiceInf;
import util.FileUtil;

@WebServlet("/BoardInsertServlet")
public class BoardInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInf service;
	
    public BoardInsertServlet() {
        super();
        service = new UserService();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String board_title = request.getParameter("board_title");
		String board_content = request.getParameter("board_content");
	
		
		//파일 전송부분
		String[] userIds = request.getParameterValues("userId");
		
		Collection<Part> parts = request.getParts();
		
		for (Part part : parts) {
			if (part.getName().equals("profile")) {
				String contentString = part.getHeader("Content-disposition");
				String fileName = FileUtil.getFileName(contentString);

				String uploadPath = getServletContext().getRealPath("/uploadFolder");
				String filePaht = uploadPath + java.io.File.separator + UUID.randomUUID().toString();
				part.write(filePaht);
				part.delete();
				
			}
		}
		
		//내용 삽입 부분
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");
		
		
		BoardVO bvo = new BoardVO();
		bvo.setBoard_title(board_title);
		bvo.setBoard_content(board_content);
		bvo.setBoard_mem_id(userId);
		
		int insertCnt = service.insertBoard(bvo);
		
		
		
		
		//정상적으로 신규 회원이 입력된 경우 : 회원 리스트 페이지로 이동
		if(insertCnt == 1){
			response.sendRedirect(request.getContextPath() + "/BoardServlet");
		}
		//정상적으로 회원 입력을 하지 못한 경우 : 신규 회원 입력 페이지
		else{
			response.sendRedirect(request.getContextPath() + "/BoardInsertServlet");
		}

	
	}

}
