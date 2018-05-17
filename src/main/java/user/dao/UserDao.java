package user.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import user.model.BoardVO;
import user.model.UserVO;

public class UserDao implements UserDaoInf {

	
		private SqlSessionFactory sqlSessionFactory;
		
		//생성자
		public UserDao(){
			String resource = "mybatis/mybatis-config.xml";
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
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
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			UserVO login = sqlSession.selectOne("user.login" , vo);
			sqlSession.close();
			
			return login;
		}


		
		/**
		 * 
		* Method : getBoardTotalCnt
		* 최초작성일 : 2018. 5. 15.
		* 작성자 : "K.Y.G"
		* 변경이력 :
		* @return
		* Method 설명 : 게시글 전체 카운터 조회
		 */
		@Override
		public int getBoardTotalCnt() {
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int boardTotalCnt = sqlSession.selectOne("user.getBoardTotalCnt");
			sqlSession.close();
			
			return boardTotalCnt;
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
		public List<BoardVO> getBoardPageList(int page, int pageSize) {
			
			Map<String, Integer> paraMap = new HashMap<String, Integer>();
			paraMap.put("page", page);
			paraMap.put("pageSize", pageSize);
			
			SqlSession slqSession = sqlSessionFactory.openSession();
			List<BoardVO> list = slqSession.selectList("user.getBoardPageList", paraMap);
			slqSession.close();
			
			return list;
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

			SqlSession sqlSession = sqlSessionFactory.openSession();
			BoardVO vo= sqlSession.selectOne("user.getBoard", board_num);
			sqlSession.close();
			
			return vo;
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
		@Override
		public int insertBoard(BoardVO vo) {
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int insertBoard = sqlSession.insert("user.insertBoard", vo);
			sqlSession.commit();
			sqlSession.close();
			
			return insertBoard;
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
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int modifyBoard = sqlSession.insert("user.modifyBoard", vo);
			sqlSession.commit();
			sqlSession.close();
			
			return modifyBoard;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

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
		@Override
		public int getPanTotalCnt() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int panTotalCnt = sqlSession.selectOne("user.getPanTotalCnt");
			sqlSession.close();
			
			return panTotalCnt;
		}



		

		
		
		
		
		
}

