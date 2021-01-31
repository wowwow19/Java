package project;

import static project.Data.*;

public class User {
	private String id;
	private String pw;
	private Place[] favList;
	
	{
		setUserNum(getUserNum()+1);
	}
	
	public User() {
		this(null, null);
	}
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Place[] getFavList() {
		return favList;
	}

	public void setFavList(Place[] favList) {
		this.favList = favList;
	}
	
}
