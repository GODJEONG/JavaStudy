package grademanage_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Grademanage {

	
	public static void main(String[] args) {
		ArrayList<Inout> gradelist = new ArrayList<Inout>();
		// Grademanage gm = new Grademanage();
		Summary_grade sg = new Summary_grade();

		Scanner sc = new Scanner(System.in);
		int func = 1; // 서비스 항목 선택 값
		int func2 = 1; // 관리현황 조회 내 기능 선택 값

		System.out.println("안녕하세요, 성적관리 시스템입니다.");

		do {
			System.out.println("[서비스 항목]");
			System.out.println("1.성적 입력 2. 성적 조회 3. 관리 현황 조회 4. 성적 수정 5. 종료 ");
			System.out.print("항목 선택: ");
			func = sc.nextInt();

			switch (func) {
			case 1:
				gradelist.add(sg.inputGrade(sc));
				break;

			case 2:
				sg.ouputGrade(gradelist);
				break;

			case 3:
				System.out.println("[조회 항목]");
				System.out.println("1. 특정 학생 조회 2. 특정 평균 이상 학생 조회");
				System.out.println("항목 입력: ");
				func2 = sc.nextInt();
				switch (func2) {
				case 1:
					sg.searchStudent(gradelist, sc);
					break;
				case 2:
					sg.outputavgover(gradelist, sc);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;

			case 4:
				sg.modifygrade(gradelist, sc);
				break;
			case 5:
				System.out.println("성적관리 시스템을 종료하겠습니다");
				System.out.println("감사합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		} while (func != 5);

	}

}