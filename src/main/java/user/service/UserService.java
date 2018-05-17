package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import user.dao.UserDao;
import user.dao.UserDaoInf;
import user.model.BoardVO;
import user.model.UserVO;

public class UserService implements UserServiceInf {

	private UserDaoInf userDao;

	private UserVO vo;
	
	public UserService(){
		userDao = new UserDao();
	}

	/**
	 * 
	* Method : login
	* 최초작성일 : 2018. 5. 14.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param vo
	* @return
	* Method 설명 :로그인 여부
	 */
	@Override
	public UserVO login(UserVO vo) {
		
		return userDao.login(vo);
	}

	/**
	 * 
	* Method : getBoardList
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param page
	* @param pageSize
	* @return
	* Method 설명 : 게시글 리스트 조회
	 */
	@Override
	public Map<String, Object> getBoardPageList(int page, int pageSize) {
		Map<String, Object> resultMap =  new HashMap<String, Object>();
		
		List<BoardVO> boardList = userDao.getBoardPageList(page, pageSize);
		String pageNav = makePageNav(page,userDao.getBoardTotalCnt());
		
		resultMap.put("boardList", boardList);
		resultMap.put("pageNav", pageNav);
		
		return resultMap;
	}

	/**
	 * 
	* Method : makePageNav
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param page
	* @param boardTotalCnt
	* @return
	* Method 설명 : 페이지 네비게이션 생성
	 */

	private String makePageNav(int page, int boardTotalCnt) {
		//boardTotalCnt 11
		//pageSize 10
		//totalPage 2 
		
		int pageTotalCnt = (int)Math.ceil((double)boardTotalCnt / 10);
		
		StringBuffer pageNav = new StringBuffer();
		pageNav.append("<nav>");
		pageNav.append("	<ul class=\"pagination\">");
		pageNav.append("		<li>");
		pageNav.append("			<a href=\"BoardServlet?page=1&pageSize=10\" aria-label=\"Previous\">");
		pageNav.append(" 				<span aria-hidden=\"true\">&laquo;</span>");
		pageNav.append("			 </a>");
		pageNav.append("		 </li>");
		
		//pageTotalCnt
		for (int i = 1; i <= pageTotalCnt; i++) {
			if(i == page)
				pageNav.append(" 	<li class=\"active\"><a href=\"BoardServlet?page="+i+"&pageSize=10\">" + i + "</a></li>");
			else
				pageNav.append(" 	<li><a href=\"BoardServlet?page="+i+"&pageSize=10\">" + i + "</a></li>");
		}
		
		pageNav.append("	<li>");
		pageNav.append("		<a href=\"BoardServlet?page=" + pageTotalCnt +"&pageSize=10\" aria-label=\"Next\">");
		pageNav.append("			<span aria-hidden=\"true\">&raquo;</span>");
		pageNav.append("		</a>");
		pageNav.append("	</li>");
		pageNav.append("	</ul>");
		pageNav.append("</nav>");
		
		return pageNav.toString();
	}

	
	/**
	 * 
	* Method : getBoard
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param board_num
	* @return
	* Method 설명 :게시글의 상세 정보 조회
	 */
	@Override
	public BoardVO getBoard(int board_num) {
		
		return userDao.getBoard(board_num);
	}

	
	/**
	 * 
	* Method : insertBoard
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param vo
	* @return
	* Method 설명 :새로운글 추가
	 */
	@Override
	public int insertBoard(BoardVO vo) {
		return userDao.insertBoard(vo);
	}

	
	
	/**
	 * 
	* Method : modifyBoard
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param vo
	* @return
	* Method 설명 : 글 수정
	 */
	@Override
	public int modifyBoard(BoardVO vo) {
		return userDao.modifyBoard(vo);
	}

	
	
	
}
