class AA {
	int aa;

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getAa() {
		return aa;
	}

}

class BB {
	int aa;

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getAa() {
		return aa;
	}

}

class CC {
	int aa;

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getAa() {
		return aa;
	}

}

public class HasA2 { 
	private AA aa;
	private BB bb;
	private CC cc;
	
	public static void main(String[] args) {

		HasA2 hasa2 = new HasA2();
		AA a = new AA();
	
		hasa2.setAA(a);
		
	}
	
	void setAA(AA aa) {
		this.aa= aa;
	}
	
}
