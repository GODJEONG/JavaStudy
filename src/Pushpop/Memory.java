package Pushpop;

abstract class Memory {
	int[] arr = new int[5];
	private int i = 0;

	public void push(int a) {
		arr[i] = a;
		i++;
	};

	public int setcnt(int i) {
		return this.i = i;
	}

	public int getcnt() {
		return i;
	}

	public abstract void pop();

}

class Mystack extends Memory {

	@Override
	public void pop() {
		arr[getcnt() - 1] = 0;
		setcnt(getcnt() - 1);
	}

}

class Myqueue extends Memory {

	@Override
	public void pop() {
		for (int i = 0; i <4; i++) {
			arr[i] = arr[i+1];
			arr[4]=0;
		}
//		arr[0]=arr[1];
//		arr[1]=arr[2];
//		arr[2]=arr[3];
//		arr[3]=arr[4];
//		arr[4]=0;
		setcnt(getcnt() - 1);
	}
}
