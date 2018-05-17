package webmember;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import user.dao.UserDao;
import user.dao.UserDaoInf;
import user.model.BoardVO;
import user.model.UserVO;

public class UserDaoTest {

	/**
	 * 
	* Method : loginTest
	* 최초작성일 : 2018. 5. 14.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* Method 설명 :로그인 테스트
	 */
	@Test
	public void loginTest() {
		/***Given***/
		UserDaoInf dao = new UserDao();
		String id = "1234";
		String pw = "1234";
		
		
		/***When***/
		UserVO vo = new UserVO();
		vo.setMem_id(id);
		vo.setMem_pass(pw);
		
		UserVO user =  dao.login(vo);
		
		/***Then***/
		assertEquals( "1234",user.getMem_id());
	}
	
	
	
	
	
	
	
	////////////////////////////////////////////////////
	//////////////////////게시글//////////////////////////
	////////////////////////////////////////////////////

	
	
	/**
	 * 
	* Method : getBoardTotalCntTest
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* Method 설명 : 게시글 전체 카운터 테스트
	 */
	@Test
	public void getBoardTotalCntTest(){
		/***Given***/
		UserDaoInf dao = new UserDao();
		
		
		/***When***/
		int TotalCnt = dao.getBoardTotalCnt();
		
		
		/***Then***/
		assertEquals(11,TotalCnt );
		
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
		UserDaoInf dao = new UserDao();
		
		int page = 1;
		int pageSize = 10;
		
		/***When***/
		List<BoardVO> boardList = dao.getBoardPageList(page, pageSize);
		
		
		
		/***Then***/
		assertNotNull(boardList);
		assertEquals(10, boardList.size());
	
	}
	
	/**
	 * 
	* Method : getBoard
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @param board_num
	* @return
	* Method 설명 :게시글의 상세 정보 조회 테스트
	 */
	@Test
	public void getBoardTest(){
		/***Given***/
		UserDaoInf dao = new UserDao();
		int board_num = 1;
		
		/***When***/
		BoardVO vo = dao.getBoard(board_num);
		
		/***Then***/
		assertEquals(1 , vo.getBoard_num());
		assertEquals("brwon" , vo.getBoard_mem_id());
		
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
		UserDaoInf dao = new UserDao();
		BoardVO vo = new BoardVO();
		
		vo.setBoard_title("??");
		vo.setBoard_content("???");
		
		/***When***/
		int insertBoard = dao.insertBoard(vo);

		
		/***Then***/
		assertEquals(1, insertBoard );
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////////////////
	//////////////////////게시판//////////////////////////
	////////////////////////////////////////////////////
	
	

	@Test
	public void getapNTotalCntTest(){
		/***Given***/
		UserDaoInf dao = new UserDao();
		
		
		/***When***/
		int TotalCnt = dao.getPanTotalCnt();
		
		
		/***Then***/
		assertEquals(2,TotalCnt );
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
