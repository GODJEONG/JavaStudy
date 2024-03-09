package grademanage;

import java.util.Scanner;

public class Grademanage {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int func = 1;
		int num = 0;
		System.out.println("안녕하세요, 성적관리 시스템입니다.");

		Inout[] list = new Inout[99];

		do {
			System.out.println("[서비스 항목]");
			System.out.println("1.성적 입력 2. 성적 조회 3. 특정 학생 성적 검색 4. 성적 수정 5. 종료 ");
			System.out.print("항목 선택: ");
			func = sc.nextInt();

			switch (func) {
			case 1:
				list[num] = new Inout();
				System.out.print("이름 입력: ");
				list[num].setName(sc.next()); // 왜 java.lang.String로 선언해야 되죠!?
				System.out.print("국어 성적 입력: ");
				list[num].setKor(sc.nextInt());
				System.out.print("수학 성적 입력: ");
				list[num].setMat(sc.nextInt());
				System.out.print("영어 성적 입력: ");
				list[num].setEng(sc.nextInt());
				num++;
				break;

			case 2:
				for (int i = 0; i <= num; i++) {
					System.out.println(" -------" + (i + 1) + " 번째 학생 성적 ------- ");
					System.out.println("이름: " + list[i].getName());
					System.out.print("국어: " + list[i].getKor() + "점 ");
					System.out.print("수학: " + list[i].getMat() + "점 ");
					System.out.println("영어: " + list[i].getEng() + "점 ");
					System.out.print("총합: " + list[i].getTotal() + "점 ");
					System.out.println("평균: " + list[i].getAvg() + "점 ");
				}
				break;

			case 3:
				System.out.print("조회할 학생 이름을 입력하세요: ");
				java.lang.String student = sc.next(); // 타입 왜??
				for (int i = 0; i <= num; i++) {
					if (student.equals(list[i].getName())) {
						System.out.println("이름: " + list[i].getName());
						System.out.print("국어: " + list[i].getKor() + "점 ");
						System.out.print("수학: " + list[i].getMat() + "점 ");
						System.out.println("영어: " + list[i].getEng() + "점 ");
						System.out.print("총합: " + list[i].getTotal() + "점 ");
						System.out.println("평균: " + list[i].getAvg() + "점 ");
					} else
						System.out.println(student + " 라는 학생은 관리명단에 없습니다. ");
					}
				break;
			case 4:
				System.out.print("수정할 학생 이름을 입력하세요: ");
				java.lang.String student2 = sc.next(); // 타입 왜??
				for (int i = 0; i <= num; i++) {
					if (student2.equals(list[i].getName())) {
						System.out.println(student2 + "학생 정보를 수정하겠습니다. ");
						System.out.print("변경할 이름: ");
						list[i].setName(sc.next());
						System.out.println("");
						System.out.print("변경할 국어점수: ");
						list[i].setKor(sc.nextInt());
						System.out.println("");
						System.out.print("변경할 영어점수: ");
						list[i].setEng(sc.nextInt());
						System.out.println("");
						System.out.print("변경할 수학점수: ");
						list[i].setMat(sc.nextInt());
						System.out.println("");
						System.out.println("변경된 정보는 아래와 같습니다. ");
						System.out.println("이름: " + list[i].getName());
						System.out.print("국어: " + list[i].getKor() + "점 ");
						System.out.print("수학: " + list[i].getMat() + "점 ");
						System.out.println("영어: " + list[i].getEng() + "점 ");
						System.out.print("총합: " + list[i].getTotal() + "점 ");
						System.out.println("평균: " + list[i].getAvg() + "점 ");
					} else {
						System.out.println(student2 + " 라는 학생은 관리명단에 없습니다. ");
					}
				}
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
