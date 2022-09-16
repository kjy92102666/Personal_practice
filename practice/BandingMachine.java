package practice;

public class BandingMachine {
	Menu menu;
	int income;
	
	public BandingMachine(Menu menu) {
		this.menu = menu;
	}
	
	public Menu getMenuItem() {
		income += menu.price;
		return menu;
	}
	
	public void showBandingInfo() {
		System.out.println("menu's name is " + menu.menuName);
		System.out.println("banding machine income is " + income);
	}
}
