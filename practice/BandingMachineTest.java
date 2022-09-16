package practice;

public class BandingMachineTest {
	public static void main(String[] args) {
		
		Menu menu = new Menu("ÄµÄ¿ÇÇ", 500);
		BandingMachine bandingMachine = new BandingMachine(menu);
		Customer customer = new Customer(10000, bandingMachine);
		customer.insertCoin();
		
	}
}
