package user.model;

import java.util.Date;

public class BoardVO {
	private int board_num;
	private int board_ppnum;
	private int group_seq;
	private String board_title;
	private String board_content;
	private String board_day;
	private String board_del;
	private int board_pan_num;
	private String board_mem_id;
	
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public int getBoard_ppnum() {
		return board_ppnum;
	}
	public void setBoard_ppnum(int board_ppnum) {
		this.board_ppnum = board_ppnum;
	}
	public int getGroup_seq() {
		return group_seq;
	}
	public void setGroup_seq(int group_seq) {
		this.group_seq = group_seq;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_day() {
		return board_day;
	}
	public void setBoard_day(String board_day) {
		this.board_day = board_day;
	}
	public String getBoard_del() {
		return board_del;
	}
	public void setBoard_del(String board_del) {
		this.board_del = board_del;
	}
	public int getBoard_pan_num() {
		return board_pan_num;
	}
	public void setBoard_pan_num(int board_pan_num) {
		this.board_pan_num = board_pan_num;
	}
	public String getBoard_mem_id() {
		return board_mem_id;
	}
	public void setBoard_mem_id(String board_mem_id) {
		this.board_mem_id = board_mem_id;
	}
	@Override
	public String toString() {
		return "BoardVO [board_num=" + board_num + ", board_ppnum="
				+ board_ppnum + ", group_seq=" + group_seq + ", board_title="
				+ board_title + ", board_content=" + board_content
				+ ", board_day=" + board_day + ", board_del=" + board_del
				+ ", board_pan_num=" + board_pan_num + ", board_mem_id="
				+ board_mem_id + "]";
	}
	public BoardVO() {
		
	}
	public BoardVO(int board_num, int board_ppnum, int group_seq,
			String board_title, String board_content, String board_day,
			String board_del, int board_pan_num, String board_mem_id) {
		this.board_num = board_num;
		this.board_ppnum = board_ppnum;
		this.group_seq = group_seq;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_day = board_day;
		this.board_del = board_del;
		this.board_pan_num = board_pan_num;
		this.board_mem_id = board_mem_id;
	}
	
	
	
}
