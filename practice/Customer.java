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
		System.out.println("���Թ����� : "+menu.menuName+", ���� �� ���� �ݾ� : " + myMoney);
		bandingMachine.showBandingInfo();
		
	}
}
