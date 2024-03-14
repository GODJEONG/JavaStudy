package grademanage_map;
public class Inout {

	// field ====================================================================
	private String name;
	private int kor;
	private int eng;
	private int mat;

	// ====================================================================
	public Inout() {
		this.name = "홍길동";
		this.kor = 0;
		this.eng = 0;
		this.mat = 0;
	}

	public Inout(String name, int kor, int eng, int mat) {
		this.name =name;
		this.kor =kor;
		this.eng =eng;
		this.mat = mat;
	}
	
	

	public int hashCode() { // 해쉬코드 일치여부 확인
		return (name+kor+eng+mat).hashCode();
	}
//	public int hashCode() {
//		return Objects.hash(name,kor,eng,mat);
//	}
	
	
	public boolean equals(Object obj) { // 문자그대로 일치여부 확인 
		if(obj instanceof Inout) {
			Inout temp = (Inout) obj;
			return name.equals(temp.name) &&
					kor == temp.kor &&
					eng == temp.eng &&
					mat == temp.mat;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		return this.getMat() + this.getEng() + this.getKor();
	}

	public float getAvg() {
		return (this.getMat() + this.getEng() + this.getKor()) / (float) 3;
	}
}
