package scenario.clothing;

public class Clothing {
	private int code;			// 의류코드
	private String color;		// 색상
	private String size;			// 사이즈
	private boolean top;		// 상하의 구분
	private String material;		// 원단
	private String season;		// 계절
	
	public Clothing() {}
	
	public Clothing(int code, String color, String size, boolean top, String material, String season) {
		super();
		this.code = code;
		this.color = color;
		this.size = size;
		this.top = top;
		this.material = material;
		this.season = season;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isTop() {
		return top;
	}
	public void setTop(boolean top) {
		this.top = top;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}	

}
