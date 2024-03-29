
// 급여 관리 프로그램
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Salarymanagement_program {
	Info_emplyee_pro[] info_emp = new Info_emplyee_pro[999]; // 고객 기본 정보 setter&getter
	Info_work_pro[] info_work = new Info_work_pro[999]; // 일자별 근무 정보 setter&getter
	Salary_statement_pro[] day_salary = new Salary_statement_pro[999]; // 고객별 일자별 급여
	System_salary_pro salaryinfo = new System_salary_pro(); // 급여 기본 체계(연차,고용형태,성과등급,성과급)	
	System_tax_pro tax = new System_tax_pro(); // 월단위 급여 이상 계산 시 세금 반영 Class
	SimpleDateFormat format = new SimpleDateFormat("MMdd"); // 오늘 == 생일 및 결혼축하금 비교 // 성과금 활용
	Date now = new Date();
	String now_dt = format.format(now);

	Scanner sc = new Scanner(System.in);

	private int f = 1; // 서비스 항목 선택
	private int num_emp = 0; // 고객 기본 정보(info_emp)에 저장되는 고객수
	private int num_work = 0; // 일자별 근무 정보(info_work)에 저장되는 고객수
	private int save = 0; // 고객별 일자별 급여(day_salary)에 저장되는 고객수

	public static void main(String[] args) {

		Salarymanagement_program salary = new Salarymanagement_program();

		System.out.println("안녕하세요, 급여 관리 시스템입니다.");
		do {
			System.out.println("[서비스 항목]");
			System.out.println("1.직원 정보 입력 2. 근무 정보 입력 3. 급여 계산 4. 급여 조회 5. 종료 ");
			System.out.print("항목 선택: ");
			salary.f = salary.sc.nextInt();

			switch (salary.f) {
			case 1: // 직원 정보 입력 > info_emp(고객 기본 정보)
				salary.info_emp[salary.num_emp] = new Info_emplyee_pro();
				System.out.println("==========================================");
				System.out.println("(관리자용)직원 정보를 입력해주세요. / 최초 한번만 이용");
				System.out.print("사번: ");
				salary.info_emp[salary.num_emp].setKbpin(salary.sc.next());
				System.out.print("이름: ");
				salary.info_emp[salary.num_emp].setName(salary.sc.next());
				System.out.println("근무 기간: 1. 5년 이하 2. 6~10년 3. 11~15년 4. 16~20년 5. 20년 이상");
				System.out.print("위 구간을 확인하고 해당되는 구간 숫자를 입력하세요: ");
				salary.info_emp[salary.num_emp].setJoindate(salary.sc.nextInt());
				System.out.print("고용 형태(정규직: 1 계약직: 2): ");
				salary.info_emp[salary.num_emp].setEmptype(salary.sc.nextInt());
				System.out.print("결혼기념일(MMdd): ");
				salary.info_emp[salary.num_emp].setAnniversary(salary.sc.next());
				System.out.print("배우자 생일(MMdd): ");
				salary.info_emp[salary.num_emp].setMatebirth(salary.sc.next());
				System.out.print("부모님 생일(MMdd): ");
				salary.info_emp[salary.num_emp].setParentbirth(salary.sc.next());
				System.out.print("성과 등급(등급: 1 / 2 / 3): ");
				salary.info_emp[salary.num_emp].setGrade(salary.sc.nextInt());
				System.out.print("급여일(dd): ");
				salary.info_emp[salary.num_emp].setSalaryday(salary.sc.nextInt());
				System.out.print("급여은행: ");
				salary.info_emp[salary.num_emp].setSalarybank(salary.sc.next());
				System.out.print("급여계좌('-'빼고 입력): ");
				salary.info_emp[salary.num_emp].setSalaryaccount(salary.sc.next());
				salary.num_emp++;
				break;

			case 2: // 근무 정보 입력 info_emp()
				salary.info_work[salary.num_work] = new Info_work_pro();
				System.out.println("==========================================");
				System.out.println("(관리자용)근무 정보를 입력해주세요 ");
				System.out.print("사번: ");
				salary.info_work[salary.num_work].setKbpin(salary.sc.next());
				System.out.print("근무한 날짜(YYYYMMDD): ");
				salary.info_work[salary.num_work].setWorkdate(salary.sc.next());
				System.out.print("주간 근무시간(8시간 이하 입력): ");
				salary.info_work[salary.num_work].setDayworktime(salary.sc.nextInt());
				System.out.print("야간 근무시간(4시간 이하 입력): ");
				salary.info_work[salary.num_work].setNightworktime(salary.sc.nextInt());
				System.out.print("휴일 근무시간: ");
				salary.info_work[salary.num_work].setHoildyworktime(salary.sc.nextInt());

				salary.num_work++;
				break;

			case 3:
				salary.salarycalcul();
				System.out.println("급여 계산 완료");
				break;
			case 4:
				int a = 0;
				System.out.println("일 단위: 상세 조회 가능 / 월 단위: 급여만 조회");
				System.out.print("급여 단위를 선택해주세요(1.일 2.월): ");
				a = salary.sc.nextInt();
				switch (a) {
				case 1:
					salary.salary_day1();
					break;
				case 2:

					System.out.println("==========================================");
					System.out.println("[월 급여 조회] 1. 사번 입력 2. 조회년월 입력");
					salary.salary_month(salary.sc.next(), salary.sc.next());
					break;
				}
				break;

			case 5:
				System.out.println("==========================================");
				System.out.println("급여관리 시스템을 종료하겠습니다");
				System.out.println("감사합니다.");
				break;
			default:
				System.out.println("==========================================");
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		} while (salary.f != 5);
	}

	public void salarycalcul() { // 급여 계산 함수

		System.out.println("==========================================");
		System.out.print("[급여 계산] 사번 입력: ");
		String key = sc.next();
		int check = 0; // 입력한 사번과 동일한 사번 있는지 체크 변수

		for (int j = 0; j < num_emp; j++) {
			if (key.equals(info_emp[j].getKbpin())) {
				for (int i = 0; i < num_work; i++) {
					// System.out.print(day_salary[i]);
					day_salary[i] = new Salary_statement_pro();
					if (key.equals(info_work[i].getKbpin())) {
						day_salary[i].setKbpin(info_emp[j].getKbpin());
						day_salary[i].setWorkdate(info_work[i].getWorkdate());
						day_salary[i].setDay_daysalary((int) info_work[i].getDayworktime()
								* salaryinfo.getSalaryinfo_base(info_emp[j].getJoindate() - 1,
										info_emp[j].getEmptype() - 1, info_emp[j].getGrade() - 1, 0));

						day_salary[i].setNight_daysalary((int) info_work[i].getNightworktime()
								* salaryinfo.getSalaryinfo_base((info_emp[j].getJoindate()) - 1,
										info_emp[j].getEmptype() - 1, info_emp[j].getGrade() - 1, 1));

						day_salary[i].setHoliday_daysalary((int) info_work[i].getHoildyworktime()
								* salaryinfo.getSalaryinfo_base(info_emp[j].getJoindate() - 1,
										info_emp[j].getEmptype() - 1, info_emp[j].getGrade() - 1, 2));

					}
					check++;

				}

			}

		}

		if (check == 0) {
			System.out.println("입력한 직원 정보와 일치하는 근무 정보가 없어 급여를 조회할 수 없습니다.");
		}

		for (int i = 0; i < num_emp; i++) {
			for (int j = 0; j < num_work; j++) {
				if (key.equals(info_work[j].getKbpin()) & key.equals(day_salary[j].getKbpin())
						& info_work[j].getWorkdate().substring(4, 8).equals(info_emp[i].getAnniversary())) {

					day_salary[j].setAnniversarybonus(500000);
				}
				if (key.equals(info_work[j].getKbpin()) & key.equals(day_salary[j].getKbpin())
						& info_work[j].getWorkdate().substring(4, 8).equals(info_emp[i].getMatebirth())) {
					day_salary[j].setBirthbonus(200000);
				}
				if (key.equals(info_work[j].getKbpin()) & key.equals(day_salary[j].getKbpin())
						& info_work[j].getWorkdate().substring(4, 8).equals(info_emp[i].getParentbirth())) {
					day_salary[j].setCongratebonus(200000);

				}
			}
		}
		for (int i = 0; i < num_emp; i++) {
			for (int j = 0; j < num_work; j++) {
				if (key.equals(info_work[j].getKbpin()) & key.equals(day_salary[j].getKbpin())) {
					day_salary[j]
							.setTotal_daysalary(day_salary[j].getDay_daysalary() + day_salary[j].getNight_daysalary()
									+ day_salary[j].getHoliday_daysalary() + day_salary[j].getBirthbonus()
									+ day_salary[j].getCongratebonus() + day_salary[j].getAnniversarybonus());

				}
			}
		}
	}

	public void salary_day1() { // 일단위 급여 산출

		System.out.println("==========================================");
		System.out.println("[일 단위 급여] ");
		System.out.print("사번 입력: ");
		String key = sc.next();
		int check = 0; // 입력한 사번과 동일한 사번 있는지 체크 변수
		
		for (int j = 0; j < num_emp; j++) {
			save=0;
			if (key.equals(info_emp[j].getKbpin())) {
				for (int i = 0; i < num_work; i++) {
					if (key.equals(info_work[i].getKbpin())) {
						System.out.println("=========근무일자: " + info_work[i].getWorkdate() + " 현황==============");
						System.out.println("사번: " + info_emp[j].getKbpin());
						System.out.println("이름: " + info_emp[j].getName());
						System.out.println("근무일자: " + info_work[i].getWorkdate());
						System.out.println("고용 형태: " + info_emp[j].getEmptype());
						System.out.println("주간 근무 시간: " + info_work[i].getDayworktime());
						System.out.println("야간 근무 시간: " + info_work[i].getNightworktime());
						System.out.println("주말 근무 시간: " + info_work[i].getHoildyworktime());
						System.out.println("연차: " + (info_emp[j].getJoindate() - 1));
						System.out.println("고용형태: " + (info_emp[j].getEmptype() - 1));
						System.out.println("성과등급: " + (info_emp[j].getGrade() - 1));
						System.out.println("주간 급여: " + day_salary[save].getDay_daysalary());
						System.out.println("야간 급여: " + day_salary[save].getNight_daysalary());
						System.out.println("휴일 급여: " + day_salary[save].getHoliday_daysalary());

					}
					save++;
					check++;

				}
			}
		}
		if (check == 0) {
			System.out.println("입력한 직원 정보와 일치하는 근무 정보가 없어 급여를 조회할 수 없습니다.");
		}
		System.out.println("===========근무 외 급여==============");
		System.out.println("* 근무외급여는 해당일에 출근해야 지급됩니다. ");

		for (int i = 0; i < num_emp; i++) {
			for (int j = 0; j < num_work; j++) {
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin()) & info_emp[i]
						.getAnniversary().substring(0, 2).equals(info_work[j].getWorkdate().substring(4, 6))) {

					System.out.println("결혼기념일 축하금: " + day_salary[j].getAnniversarybonus());
				}
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin()) & info_emp[i]
						.getMatebirth().substring(0, 2).equals(info_work[j].getWorkdate().substring(4, 6))) {

					System.out.println("배우자생일 축하금: " + day_salary[j].getBirthbonus());
				}
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin()) & info_emp[i]
						.getParentbirth().substring(0, 2).equals(info_work[j].getWorkdate().substring(4, 6))) {

					System.out.println("부모님생일 축하금: " + day_salary[j].getCongratebonus());
				}
			}
		}

	}

	public void salary_month(String kbpin, String workdate) { // 월단위 급여 산출
		double salary_month = 0;

		for (int i = 0; i < num_work; i++) {

			if ((day_salary[i].getKbpin().equals(kbpin))
					&& day_salary[i].getWorkdate().substring(0, 6).equals(workdate)) {
				salary_month += (double) day_salary[i].getTotal_daysalary();
				System.out.println(kbpin);

			}
		}
		;
		System.out.println("세전 급여: " + salary_month + "원");
		System.out.println("세금 비율: " + tax.tax(salary_month) + "%");
		salary_month *= (1 - tax.tax(salary_month));
		System.out.println("[계산 결과]");
		System.out.println("사번이 " + kbpin + "인 직원의 " + workdate.substring(0, 4) + "년 " + workdate.substring(4, 6)
				+ "월 세후 급여는 " + (salary_month) + "원 입니다.");

	}

}