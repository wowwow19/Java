package chap06;

public class Marine {
	// 인스턴스별 개별적 값을 가져야 하는 필드
	int posX;		// X좌표
	int posY;		// Y좌표
	int kills;		// 킬수
	int hp = 40;	// 현재 체력
	
	// 모든 인스턴스가 공통된 값을 공유해야 하는 필드 : 클래스 변수로 작성(static)
	static int maxHp = 40;	// 최대 체력
	static int weapon = 6;	// 무기 공격력
	static int armor;		// 방어력
	
	@Override
	public String toString() {
		return "Marine [posX=" + posX + ", posY=" + posY + ", kills=" + kills + ", hp=" + hp + "] " 
				+ maxHp + ", " + weapon + ", " + armor;
	}
}
