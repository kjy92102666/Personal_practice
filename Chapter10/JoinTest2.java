package Chapter10;
import java.util.ArrayList;

class BeforeThread1 extends Thread{
	public BeforeThread1 (String name) {
		super(name);
	}
	
	private void addCar() {
		System.out.println("addCar");
		JoinTest1.carList.add("그랜저");
		JoinTest1.carList.add("쏘나타");
		JoinTest1.carList.add("K9");
		JoinTest1.carList.add("SM7");

	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+"실행");
		try{
			sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		addCar();
	}
	
}

class AfterThread1 extends Thread{
	public AfterThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() + "실행");
		ArrayList<String> carList = JoinTest1.carList;
		for(int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i));
		}
	}
	
	
}



public class JoinTest2 {
	public static ArrayList<String> carList = new ArrayList<String>();
	//Join 기능을 적용한 멀티 스레드
	public static void main(String[] args) {
		
		System.out.println("afterThread 호출되는 위치 확인하고 결과 같게 하기.");
		BeforeThread1 beforeThread = new BeforeThread1("beforeThread");
		AfterThread1 afterThread = new AfterThread1("afterThread");
		beforeThread.start();
		try {
			beforeThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		afterThread.start();
	}
	
}
