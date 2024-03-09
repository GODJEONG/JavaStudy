
// 소스 추가
public class Out { 
	private AA aa;
	private BB bb;
	private CC cc;

	public Out(AA aa, BB bb, CC cc) {
		this.aa=aa;
		this.bb=bb;
		this.cc=cc;
	}
	
	public void setAa(String a,int b,int c) {
		aa.setAa(a);
		bb.setAa(b);
		 cc.setAa(c);
	}
	
	public String getA() {
		return aa.getAa();	}
	public int getB() {
		return bb.getAa();	}
	public int getC() {
		return cc.getAa();	}

	public static void main(String[] args) {

		AA a = new AA();
		BB b = new BB();
		CC c = new CC();
		Out hasa2 = new Out(a,b,c);
		
		hasa2.setAa("5",1,2);

		System.out.println(a.getAa());
		System.out.println(b.getAa());
		System.out.println(c.getAa());
		
		System.out.println(hasa2.getA());
		System.out.println(hasa2.getB());
		System.out.println(hasa2.getC());

}
}