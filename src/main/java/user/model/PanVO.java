package user.model;

public class PanVO {
	private int pan_num;
	private String pan_nm;
	private String pan_day;
	private String pan_yn;
	private String pan_mem_id;
	
	public int getPan_num() {
		return pan_num;
	}
	public void setPan_num(int pan_num) {
		this.pan_num = pan_num;
	}
	public String getPan_nm() {
		return pan_nm;
	}
	public void setPan_nm(String pan_nm) {
		this.pan_nm = pan_nm;
	}
	public String getPan_day() {
		return pan_day;
	}
	public void setPan_day(String pan_day) {
		this.pan_day = pan_day;
	}
	public String getPan_yn() {
		return pan_yn;
	}
	public void setPan_yn(String pan_yn) {
		this.pan_yn = pan_yn;
	}
	public String getPan_mem_id() {
		return pan_mem_id;
	}
	public void setPan_mem_id(String pan_mem_id) {
		this.pan_mem_id = pan_mem_id;
	}
	@Override
	public String toString() {
		return "PanVO [pan_num=" + pan_num + ", pan_nm=" + pan_nm
				+ ", pan_day=" + pan_day + ", pan_yn=" + pan_yn
				+ ", pan_mem_id=" + pan_mem_id + "]";
	}
	public PanVO() {
	}
	public PanVO(int pan_num, String pan_nm, String pan_day, String pan_yn,
			String pan_mem_id) {
		this.pan_num = pan_num;
		this.pan_nm = pan_nm;
		this.pan_day = pan_day;
		this.pan_yn = pan_yn;
		this.pan_mem_id = pan_mem_id;
	}
	
}
