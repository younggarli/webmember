package user.dao;

import java.util.List;
import java.util.Map;

import user.model.BoardVO;
import user.model.PanVO;
import user.model.UserVO;

public interface UserDaoInf {

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
	public UserVO login(UserVO vo);
		
	////////////////////////////////////////////////////
	//////////////////////게시글//////////////////////////
	////////////////////////////////////////////////////

	
	/**
	 * 
	* Method : getBoardTotalCnt
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @return
	* Method 설명 : 게시글 전체 카운터 조회
	 */
	public int getBoardTotalCnt();
	
	
	
	
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
	public List<BoardVO> getBoardPageList(int page , int pageSize);


	
	
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
	public BoardVO getBoard(int board_num);
	
	
	
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
	public int insertBoard(BoardVO vo);
	
	
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
	public int modifyBoard(BoardVO vo);
	
	
	
	
	////////////////////////////////////////////////////
	//////////////////////게시판//////////////////////////
	////////////////////////////////////////////////////
	
	
	/**
	 * 
	* Method : getPAnTotalCnt
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "K.Y.G"
	* 변경이력 :
	* @return
	* Method 설명 :게시판 카운터 조회
	 */
	public int getPanTotalCnt();

//	/**
//	 * 
//	* Method : getPanPageList
//	* 최초작성일 : 2018. 5. 16.
//	* 작성자 : "K.Y.G"
//	* 변경이력 :
//	* @param page
//	* @param pageSize
//	* @return
//	* Method 설명 : 게시판 리스트 조회
//	 */
//	public List<PanVO> getPanPageList(int page , int pageSize);
}
