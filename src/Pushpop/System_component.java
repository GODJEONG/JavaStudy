package Pushpop;

public class System_component {
	private int workyear;
	private int emptype;
	private int grade;
	private int salary_daywork;
	private int salary_nightwork;
	private int salary_hoildaywork;

	public System_component(int workyear, int emptype, int grade, int salary_daywork, int salary_nightwork,
			int salary_hoildaywork) {
		this.workyear = workyear;
		this.emptype = emptype;
		this.grade = grade;
		this.salary_daywork = salary_daywork;
		this.salary_nightwork = salary_nightwork;
		this.salary_hoildaywork = salary_hoildaywork;
	}

	public int getWorkyear() {
		return workyear;
	}

	public void setWorkyear(int workyear) {
		this.workyear = workyear;
	}

	public int getEmptype() {
		return emptype;
	}

	public void setEmptype(int emptype) {
		this.emptype = emptype;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSalary_daywork() {
		return salary_daywork;
	}

	public void setSalary_daywork(int salary_daywork) {
		this.salary_daywork = salary_daywork;
	}

	public int getSalary_nightwork() {
		return salary_nightwork;
	}

	public void setSalary_nightwork(int salary_nightwork) {
		this.salary_nightwork = salary_nightwork;
	}

	public int getSalary_hoildaywork() {
		return salary_hoildaywork;
	}

	public void setSalary_hoildaywork(int salary_hoildaywork) {
		this.salary_hoildaywork = salary_hoildaywork;
	}

}
