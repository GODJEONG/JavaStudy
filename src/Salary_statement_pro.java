
public class Salary_statement_pro {
	private String kbpin;
	private String workdate;
	private int day_daysalary;
	private int night_daysalary;
	private int holiday_daysalary;
	private int birthbonus=0;
	private int congratebonus =0;
	private int anniversarybonus=0;
	private int total_daysalary ;

	public Salary_statement_pro() {
	};

	
	public String getWorkdate() {
		return workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public int getBirthbonus() {
		return birthbonus;
	}

	public void setBirthbonus(int birthbonus) {
		this.birthbonus = birthbonus;
	}

	public int getCongratebonus() {
		return congratebonus;
	}

	public void setCongratebonus(int congratebonus) {
		this.congratebonus = congratebonus;
	}

	public int getAnniversarybonus() {
		return anniversarybonus;
	}

	public void setAnniversarybonus(int anniversarybonus) {
		this.anniversarybonus = anniversarybonus;
	}

	public String getKbpin() {
		return kbpin;
	}

	public void setKbpin(String kbpin) {
		this.kbpin = kbpin;
	}

	public int getDay_daysalary() {
		return day_daysalary;
	}

	public void setDay_daysalary(int day_daysalary) {
		this.day_daysalary = day_daysalary;
	}

	public int getNight_daysalary() {
		return night_daysalary;
	}

	public void setNight_daysalary(int night_daysalary) {
		this.night_daysalary = night_daysalary;
	}

	public int getHoliday_daysalary() {
		return holiday_daysalary;
	}

	public void setHoliday_daysalary(int holiday_daysalary) {
		this.holiday_daysalary = holiday_daysalary;
	}

	public int getTotal_daysalary() {
		return total_daysalary;
	}

	public void setTotal_daysalary(int total_daysalary) {
		this.total_daysalary = total_daysalary;
	}

}
