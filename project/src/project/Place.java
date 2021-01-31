package project;

public class Place {
	private String name;
	private String region;
	private Comment[] comments = new Comment[5];
	private int comtNum = 0;
	
	public Place(String name, String region) {
		this.name = name;
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Comment[] getComments() {
		return comments;
	}

	public void setComments(Comment[] comments) {
		this.comments = comments;
	}

	public int getComtNum() {
		return comtNum;
	}

	public void setComtNum(int comtNum) {
		this.comtNum = comtNum;
	}
	
	
}
