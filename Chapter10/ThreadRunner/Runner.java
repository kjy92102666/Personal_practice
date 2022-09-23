package Chapter10.ThreadRunner;

class Runner extends Thread{
	String r_name;
	int meter;
	Runner(String name){
		r_name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			meter+=10;
			if(meter==100) {
				System.out.println(r_name+"ÁÖÀÚ µµÂø");
			}else {
				System.out.println(r_name+"ÁÖÀÚ "+meter+"M µµÂø.");
			}
			try {
				int num = (int)(Math.random()*1000);
				Thread.sleep(num);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}