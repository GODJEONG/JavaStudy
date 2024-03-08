public class In { 
	private AA aa ;
	private BB bb ;
	private CC cc ;
	
	public In() { //생성자
		aa = new AA(); 
		bb = new BB();
		cc = new CC();
	}
	
	public void setAa(String a,int b,int c) {
		this.aa.setAa(a);
		this.bb.setAa(b);
		this.cc.setAa(c);
	}
	
	public String getA() {
		return aa.getAa(); 	}
	public int getB() {
		return bb.getAa();	}
	public int getC() {
		return cc.getAa();	}

	public static void main(String[] args) {
		 In In = new In();
		AA aa = new AA(); //
		BB bb = new BB(); //
		CC cc = new CC(); //

		In.setAa("ff",4,5);
		aa.setAa("tt"); //
		
		System.out.println(aa.getAa());
		System.out.println(bb.getAa());
		System.out.println(cc.getAa());
		
		System.out.println(In.getA());
		System.out.println(In.getB());
		System.out.println(In.getC());

}
}