public class Out { //외부에서 만든 객체를 넣는 것_객체di
	private AA aa;
	private BB bb;
	private CC cc;

	
	public Out(AA aa, BB bb, CC cc) {
		this.aa=aa;
		this.bb=bb;
		this.cc=cc;
	}
	
	public void setAa(String a,int b,int c) {
		this.aa.setAa(a);
		this.bb.setAa(b);
		 this.cc.setAa(c);
	}
	
	public String getA() {
		return aa.getAa();
	}
	
	public int getB() {
		return bb.getAa();
	}
	
	public int getC() {
		return cc.getAa();
	}

	public static void main(String[] args) {
//		 Out hasa2 = new Out();
		AA a = new AA();
		BB b = new BB();
		CC c = new CC();
		 Out hasa2 = new Out(a,b,c);
		
//		 a.setAa("5");
//		 b.setAa(1);
//		 c.setAa(2);
		hasa2.setAa("5",1,2);
		
//		
		System.out.println(a.getAa());
		System.out.println(b.getAa());
		System.out.println(c.getAa());
		
		System.out.println(hasa2.getA());
		System.out.println(hasa2.getB());
		System.out.println(hasa2.getC());
		
	//	System.out.println(hasa2.getAA());
}

}