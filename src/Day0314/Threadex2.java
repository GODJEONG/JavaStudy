package Day0314;

public class Threadex2 implements Runnable {
	private int[] temp;

	public Threadex2() {
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
	}

	public static void main(String[] args) {
		Threadex2 te = new Threadex2();
		Thread tt= new Thread(te, "superman");
		tt.start();

	}

}
