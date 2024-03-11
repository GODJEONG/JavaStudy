public class Test {

	public void salary_day() {

		day_salary[save] = new Day_salary_pro();

		System.out.println("==========================================");
		System.out.println("급여 계산할 사번을 입력해주세요. ");
		System.out.print("사번: ");
		String key = sc.next();
		int check = 0; // 입력한 사번과 동일한 사번 있는지 체크 변수

		for (int i = 0; i < num_work; i++) {
			if (key.equals(info_work[i].getKbpin())) {
				for (int j = 0; j < num_emp; j++) {
					if (key.equals(info_emp[i].getKbpin())) {
						System.out.println("=========근무일자: " + info_work[j].getWorkdate() + " 현황==============");
						System.out.println("사번: " + info_emp[i].getKbpin());
						day_salary[save].setKbpin(info_emp[i].getKbpin());
						System.out.println("이름: " + info_emp[i].getName());
						System.out.println("근무일자: " + info_work[j].getWorkdate());
						day_salary[save].setWorkdate(info_work[j].getWorkdate());
						System.out.println("고용 형태: " + info_emp[i].getEmptype());
						System.out.println("주간 근무 시간: " + info_work[j].getDayworktime());
						System.out.println("야간 근무 시간: " + info_work[j].getNightworktime());
						System.out.println("주말 근무 시간: " + info_work[j].getHoildyworktime());
						System.out.println("연차: " + (info_emp[i].getJoindate() - 1));
						System.out.println("고용형태: " + (info_emp[i].getEmptype() - 1));
						System.out.println("성과등급: " + (info_emp[i].getGrade() - 1));
						day_salary[save].setDay_daysalary((int) info_work[j].getDayworktime()
								* salaryinfo.getSalaryinfo_base(info_emp[i].getJoindate() - 1,
										info_emp[i].getEmptype() - 1, info_emp[i].getGrade() - 1, 0));
						System.out.println("주간 급여: " + day_salary[save].getDay_daysalary());

						day_salary[save].setNight_daysalary((int) info_work[j].getNightworktime()
								* salaryinfo.getSalaryinfo_base((info_emp[i].getJoindate()) - 1,
										info_emp[i].getEmptype() - 1, info_emp[i].getGrade() - 1, 1));
						System.out.println("야간 급여: " + day_salary[save].getNight_daysalary());

						day_salary[save].setHoliday_daysalary((int) info_work[j].getHoildyworktime()
								* salaryinfo.getSalaryinfo_base(info_emp[i].getJoindate() - 1,
										info_emp[i].getEmptype() - 1, info_emp[i].getGrade() - 1, 2));

						System.out.println("휴일 급여: " + day_salary[save].getHoliday_daysalary());

						check++;
						save++;
					}
				}
			}
		}
		if (check == 0) {
			System.out.println("입력한 직원 정보와 일치하는 근무 정보가 없어 급여를 조회할 수 없습니다.");
		}

		for (int i = 0; i < num_emp; i++) {
			for (int j = 0; j < num_emp; j++) {
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin())
						& info_emp[i].getAnniversary().equals(now_dt)) {
					day_salary[j].setBirthbonus(500000);
					System.out.println("생일 축하금: " + day_salary[j].getBirthbonus());
				}
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin())
						& info_emp[i].getMatebirth().equals(now_dt)) {
					day_salary[j].setCongratebonus(200000);
					System.out.println("배우자생일 축하금: " + day_salary[j].getCongratebonus());
				}
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin())
						& info_emp[i].getParentbirth().equals(now_dt)) {
					day_salary[j].setAnniversarybonus(200000);
					System.out.println("부모님생일 축하금: " + day_salary[j].getAnniversarybonus());
				}
			}
		}
		for (int i = 0; i < num_emp; i++) {
			for (int j = 0; j < num_emp; j++) {
				if (key.equals(info_emp[i].getKbpin()) & key.equals(day_salary[j].getKbpin())) {
					day_salary[j]
							.setTotal_daysalary(day_salary[j].getDay_daysalary() + day_salary[j].getNight_daysalary()
									+ day_salary[j].getHoliday_daysalary() + day_salary[j].getBirthbonus()
									+ day_salary[j].getCongratebonus() + day_salary[j].getAnniversarybonus());
					System.out.println("==========================================");
					System.out.println("총 급여: " + day_salary[j].getTotal_daysalary());
					System.out.println("지급 은행: " + info_emp[j].getSalarybank());
					System.out.println("지급 계좌: " + info_emp[j].getSalaryaccount());
					System.out.println("==========================================");

				}
			}
		}
	}
	}
}
