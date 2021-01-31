package project;

public class Comment {
	private String content;
	private int like;
	
	public Comment(String content, int like) {
		this.content = content;
		this.like = like;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
}
