package ex06_list;

public class MenuItem_1 {
	// 1. 메뉴보기
	// 2. 주문하기
	// 3. 결제하기
	// 4. 취소하기
	// 5. 프로그램 종료
	
	private String americano = "1. 아메리카노";
	private int americanoPrice = 3000;
	private String latte = "2. 라떼";
	private int lattePrice = 3500;
	private String cappuccino = "3. 카푸치노";
	private int cappuccinoPrice = 4000;

	public void setAmericano(String americano) {
		this.americano = americano;
	}
	
	public String getAmericano() {
		return americano;
	}
	
	public void setAmericanoPrice(int americanoPrice) {
		this.americanoPrice = americanoPrice;
	}
	
	public int getAmericanoPrice() {
		return americanoPrice;
	}
	
	public void setLatte(String latte) {
		this.latte = latte;
	}
	
	public String getLatte() {
		return latte;
	}
	
	public void setLattePrice(int lattePrice) {
		this.lattePrice = lattePrice;
	}
	
	public int getLattePrice() {
		return lattePrice;
	}
	
	public void setCappuccino(String cappuccino) {
		this.cappuccino = cappuccino;
	}
	
	public String getCappuccino() {
		return cappuccino;
	}
	
	public void setCappuccinoPrice(int cappuccinoPrice) {
		this.cappuccinoPrice = cappuccinoPrice;
	}
	
	public int getCappuccinoPrice() {
		return cappuccinoPrice;
	}
}
