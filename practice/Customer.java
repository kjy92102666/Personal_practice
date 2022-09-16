package practice;

public class Customer {
	int myMoney;
	BandingMachine bandingMachine;
	
	public Customer(int myMoney, BandingMachine bandingMachine) {
		this.myMoney = myMoney;
		this.bandingMachine = bandingMachine;
	}
	
	public void insertCoin() {
		Menu menu = bandingMachine.getMenuItem();
		myMoney -= menu.price;
		System.out.println("구입물건은 : "+menu.menuName+", 구입 후 남은 금액 : " + myMoney);
		bandingMachine.showBandingInfo();
		
	}
}
