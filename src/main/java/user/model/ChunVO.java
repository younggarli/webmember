package user.model;

public class ChunVO {
	private String chum_num;
	private String chum_write_num;
	private String chum_route;
	
	
	public String getChum_num() {
		return chum_num;
	}
	public void setChum_num(String chum_num) {
		this.chum_num = chum_num;
	}
	public String getChum_write_num() {
		return chum_write_num;
	}
	public void setChum_write_num(String chum_write_num) {
		this.chum_write_num = chum_write_num;
	}
	public String getChum_route() {
		return chum_route;
	}
	public void setChum_route(String chum_route) {
		this.chum_route = chum_route;
	}
	@Override
	public String toString() {
		return "ChunVO [chum_num=" + chum_num + ", chum_write_num="
				+ chum_write_num + ", chum_route=" + chum_route + "]";
	}
	public ChunVO() {
	}
	
	
	public ChunVO(String chum_num, String chum_write_num, String chum_route) {
		this.chum_num = chum_num;
		this.chum_write_num = chum_write_num;
		this.chum_route = chum_route;
	}
	
	
}
