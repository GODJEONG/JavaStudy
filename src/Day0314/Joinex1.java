package Day0314;

public class Joinex1 implements Runnable {
	private int[] temp;

	public Joinex1() {
		temp = new int[10];
		for (int s = 0; s < temp.length; s++) {
			temp[s] = s;
		}
	}

	public void run() {
		for (int s : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드 이름: %s ,", Thread.currentThread().getName());
			System.out.printf("temp value: %d %n", s);
			
		}
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}

	public void second() {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "start");	
		Joinex1 te = new Joinex1();
		Thread tt= new Thread(te, "superman");
		tt.start();
		
		try {
			tt.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "end");
	}

}
