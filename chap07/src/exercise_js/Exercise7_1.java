package exercise_js;

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		System.out.println();
		
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		System.out.println();
		
		SutdaCard card = deck.pick(3);
		System.out.println(card);
		
		SutdaCard card2 = deck.pick();
		System.out.println(card2);
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for (int i = 0; i < CARD_NUM; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10)&&(num == 1 || num == 3 || num == 8) ? true : false;
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < CARD_NUM; i++) {
			int j = (int)(Math.random() * CARD_NUM);
			SutdaCard tmp = new SutdaCard();
			
			tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	public SutdaCard pick(int idx) {
		return cards[idx];
	}
	
	public SutdaCard pick() {
		int idx = (int)(Math.random() * CARD_NUM);
		return cards[idx];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

