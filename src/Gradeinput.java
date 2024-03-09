//이름 및 성적 관련 getter setter
public class Gradeinput {
    // field ====================================================================
	Name name;
	Subject kor;
	Subject eng;
	Subject mat;

	// constructor ====================================================================

	public Gradeinput() { //내부 

		name = new Name();
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
	};
	
	public Gradeinput(Name name, Subject kor, Subject eng, Subject mat) {  //외부 

		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
	}
	
	public void setName(String name) {
		this.name.setName(name);
	}

	public void setKor(int kor) {
		this.kor.setSubject(kor);
	}
	
	public void setEng(int eng) {
		this.eng.setSubject(eng);
	}
	
	public void setMat(int mat) {
		this.mat.setSubject(mat);
	}
	
	public String getName() {
		return this.name.getName();
	}
	public int getKor() {
		return this.kor.getSubject();
	}
	public int getEng() {
		return this.eng.getSubject();
	}
	public int getMat() {
		return this.mat.getSubject();
	}
	
	public int getTotal() {
		return this.kor.getSubject()+this.eng.getSubject()+this.mat.getSubject();
	}
	
	public String getAvg() {
		return String.format("%.2f",((this.kor.getSubject() + this.eng.getSubject() + this.mat.getSubject()) / (float)3) );
	}
	
	
	// main method ====================================================================
	public static void main(String[] args) {

		// 내부 -------------------------------------------
//		 HasA3 stu = new HasA3();
		
		// 외부 -------------------------------------------
		// 객체선언
		Name name = new Name();
		Subject kor = new Subject();
		Subject eng = new Subject();
		Subject mat = new Subject();

		Gradeinput stu = new Gradeinput( name,  kor,  eng,  mat);
		
		// 외부 -------------------------------------------
		
		stu.setName("홍길동");
		stu.setKor(10);
		stu.setMat(0);
		stu.setEng(70);

		System.out.println(stu.getName());
		System.out.println(stu.getKor());
		System.out.println(stu.getMat());
		System.out.println(stu.getEng());
		System.out.println(stu.getTotal());
		System.out.println(stu.getAvg());

	}

}