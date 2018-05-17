package webmember;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import user.dao.UserDao;
import user.dao.UserDaoInf;
import user.model.BoardVO;
import user.model.UserVO;
import user.service.UserService;
import user.service.UserServiceInf;

public class UserServiceTest {

	/**
	 * 
	* Method : loginTest
	* 최초작성일 : 2018. 5. 14.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* Method 설명 :로그인 서비스 테스트
	 */
	@Test
	public void loginTest() {
		/***Given***/
		UserServiceInf service = new UserService();
		String id = "1234";
		String pw = "1234";
		
		/***When***/
		UserVO vo = new UserVO();
		vo.setMem_id(id);
		vo.setMem_pass(pw);
		
		UserVO user =  service.login(vo);
		
		/***Then***/
		assertEquals( "1234",user.getMem_id());
		
	}
	
	/**
	 * 
	* Method : getBoardPageListTest
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* Method 설명 :게시글 페이지 사이즈 테스트
	 */
	@Test
	public void getBoardPageListTest(){
		/***Given***/
		UserServiceInf service = new UserService();
		int page = 1;
		int pageSize = 10;
		
		/***When***/
		Map<String, Object> resultMap = service.getBoardPageList(page, pageSize);
		
		/***Then***/
		List<BoardVO> boardList = (List<BoardVO>) resultMap.get("boardList");
		
		assertNotNull(boardList);
		assertEquals(10, boardList.size());
		
	}
	/**
	 * 
	* Method : sumTotalPageCnt
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* Method 설명 : 게시글 총페이지수 계산 테스트
	 */
	
	//총 글수 11
	//최대 사이즈 10
	//총 페이지수2
	@Test
	public void sumTotalPageCnt(){
		/***Given***/
		int boardTotalCnt=11;
		int pageSize=10;
		
		/***When***/
		int pageTotalcnt =  (int)Math.ceil((double)boardTotalCnt/10);
		
		/***Then***/
		assertEquals(2, pageTotalcnt);
		
	}
	
	/**
	 * 
	* Method : getBoard
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* Method 설명 : 게시글 상세정보 조회 테스트
	 */
	@Test
	public void getBoard(){
		/***Given***/
		UserServiceInf service = new UserService();
		int num = 1;
		
		/***When***/
		BoardVO vo = service.getBoard(num);
		
		/***Then***/
		assertEquals(1, vo.getBoard_num());
		
	}
	
	
	/**
	 * 
	* Method : insertBoard
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param vo
	* @return
	* Method 설명 :새로운글 추가
	 */
	@Test
	public void insertBoardTest(){
		/***Given***/
		UserServiceInf service = new UserService();
		BoardVO vo = new BoardVO();
		
		vo.setBoard_title("??");
		vo.setBoard_content("???");
		
		/***When***/
		int insertBoard = service.insertBoard(vo);

		
		/***Then***/
		assertEquals(1, insertBoard );
		
		
		
	}
	
}
