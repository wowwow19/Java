package project;

public class Data {
	private static User[] users = new User[10];
	private static Place[] placeList = new Place[10];
	private static int userNum = 0;
	
	
	public static User[] getUsers() {
		return users;
	}


	public static void setUsers(User[] users) {
		Data.users = users;
	}


	public static Place[] getPlaceList() {
		return placeList;
	}


	public static void setTours(Place[] placeList) {
		Data.placeList = placeList;
	}


	public static int getUserNum() {
		return userNum;
	}


	public static void setUserNum(int userNum) {
		Data.userNum = userNum;
	}


	static {
		// 기본계정
		users[0] = new User("admin", "1234");
		users[1] = new User("guest", "0000");
		
		// 관광지 데이터
		placeList[0] = new Place("경복궁", "서울");
		placeList[1] = new Place("홍대입구", "서울");
		placeList[2] = new Place("해운대", "부산");
		placeList[3] = new Place("수원화성", "경기");
		placeList[4] = new Place("경포대", "강원");
		placeList[5] = new Place("무등산", "광주");
		placeList[6] = new Place("대구타워", "대구");
		placeList[7] = new Place("첨성대", "경상");
		placeList[8] = new Place("전주한옥마을", "전라");
		placeList[9] = new Place("성심당", "대전");
		
		// 댓글 데이터
			// 경복궁
		placeList[0].getComments()[0] = new Comment("아이들 데리고 다니기 좋아요", 152);
		placeList[0].getComments()[1] = new Comment("아이들 데리고 다니기 좋아요", 152);
		placeList[0].getComments()[2] = new Comment("아이들 데리고 다니기 좋아요", 152);
		placeList[0].getComments()[3] = new Comment("아이들 데리고 다니기 좋아요", 152);
			// 홍대입구
//		placeList[1].getComments()[0] = new Comment("아이들 데리고 다니기 좋아요", 152);
//		placeList[1].getComments()[1] = new Comment("아이들 데리고 다니기 좋아요", 152);
//		placeList[1].getComments()[2] = new Comment("아이들 데리고 다니기 좋아요", 152);
//		placeList[1].getComments()[3] = new Comment("아이들 데리고 다니기 좋아요", 152);

	}
}
