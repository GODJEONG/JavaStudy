// 성적 및 이름 관련 setter getter

package grademanage;
// import java.lang.String;

public class Inout {
    // field ====================================================================
	String name;
	Number kor;
	Number eng;
	Number mat;

	// constructor ====================================================================

	public Inout() { //내부 

		name = new String();
		kor = new Number();
		eng = new Number();
		mat = new Number();
	};
	
	public Inout(String name, Number kor, Number eng, Number mat) {  //외부 

		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
	}
	
	public void setName(java.lang.String string) {
		this.name.setStringg(string);
	}

	public void setKor(int kor) {
		this.kor.setNumber(kor);
	}
	
	public void setEng(int eng) {
		this.eng.setNumber(eng);
	}
	
	public void setMat(int mat) {
		this.mat.setNumber(mat);
	}
	
	public java.lang.String getName() {
		return this.name.getString();
	}
	public int getKor() {
		return this.kor.getNumber();
	}
	public int getEng() {
		return this.eng.getNumber();
	}
	public int getMat() {
		return this.mat.getNumber();
	}
	
	public int getTotal() {
		return this.kor.getNumber()+this.eng.getNumber()+this.mat.getNumber();
	}
	
	public float getAvg() {
		return (this.kor.getNumber() + this.eng.getNumber() + this.mat.getNumber()) / (float)3 ;
	}
	/*
	public static void main(String[] args) {
		Inout inout = new Inout();
	}
*/

}
	