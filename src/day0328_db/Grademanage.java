package day0328_db;

import java.util.Scanner;

public class Grademanage {

	Scanner sc;
	private int func; // 서비스 항목 선택 값
	private int func2; // 관리현황 조회 내 기능 선택 값
	Method_LinkedArray le;
	ConnectDatabase cd;
	Student_Info si;

	public Grademanage() {
		sc = new Scanner(System.in);
		func = 1;
		func2 = 1;
		le = new Method_LinkedArray();
		cd = new ConnectDatabase();
		si = new Student_Info();
	}

	public static void main(String[] args) {
		Grademanage gm = new Grademanage();

		System.out.println("안녕하세요, 성적관리 시스템입니다.");
		System.out.println("※정상적으로 시스템을 활용하기 위해서는 성적 조회를 먼저 진행하십시오. ");
		System.out.println("※성적 추가 및 삭제는 데이터에 바로 반영됩니다. ");
		System.out.println("");
		
		do {
			System.out.println("[서비스 항목]");
			System.out.println("1.성적 조회 2. 성적 추가 3. 성적 삭제 4. 관리 현황 조회 5. 성적 수정 6. 종료 ");
			System.out.print("항목 선택: ");
			gm.func = gm.sc.nextInt();

			switch (gm.func) {
			case 1:
				gm.cd.show_LinkedListSave();
				gm.le.prt();
				break;
			case 2:
				gm.cd.insert_data(gm.le.add(gm.le.info()));
				break;

			case 3:
				gm.cd.delete_data(gm.le.del(gm.sc));
				break;

			case 4:
				System.out.println("[상세 조회]");
				System.out.println("1. 특정 학생 조회 2. 특정 평균 이상 학생 조회");
				System.out.println("항목 입력: ");
				gm.func2 = gm.sc.nextInt();
				switch (gm.func2) {
				case 1:
					gm.le.prt_pickme(gm.sc);
					break;
				case 2:
					gm.le.prt_avgover(gm.sc);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;

			case 5:
				gm.cd.update_data(gm.le.modify(gm.sc));
				break;
			case 6:
				gm.cd.close();
				System.out.println("성적관리 시스템을 종료하겠습니다");
				System.out.println("감사합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		} while (gm.func != 6);

	}

}