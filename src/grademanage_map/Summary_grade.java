package grademanage_map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Summary_grade {
	
	public Inout inputGrade(Scanner sc) { // 왜 스태틱만 가능한가?
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("국어 성적 입력: ");
		int kor = sc.nextInt();
		System.out.print("수학 성적 입력: ");
		int math = sc.nextInt();
		System.out.print("영어 성적 입력: ");
		int eng = sc.nextInt();
		return new Inout(name, kor, eng, math); // ???
	}

	// ----------------------------------------------------

	public void ouputGrade(HashMap<Integer, Inout> a) {
		Set<Integer> keys = a.keySet();
		for (Integer i : keys) {
			System.out.println("이름: " + a.get(i).getName());
			System.out.print("국어: " + a.get(i).getKor() + "점 ");
			System.out.print("수학: " + a.get(i).getMat() + "점 ");
			System.out.println("영어: " + a.get(i).getEng() + "점 ");
			System.out.print("총합: " + a.get(i).getTotal() + "점 ");
			System.out.println("평균: " + a.get(i).getAvg() + "점 ");
			System.out.println("===================================");
		}
	}

	public void searchStudent(HashMap<Integer, Inout> a, Scanner sc) {
		System.out.print("조회할 학생 이름을 입력하세요: ");
		String student = sc.next();
		int aa = 0;
		Set<Integer> keys = a.keySet();
		for (Integer i : keys) {
			if (student.equals(a.get(i).getName())) {
				System.out.println("이름: " + a.get(i).getName());
				System.out.print("국어: " + a.get(i).getKor() + "점 ");
				System.out.print("수학: " + a.get(i).getMat() + "점 ");
				System.out.println("영어: " + a.get(i).getEng() + "점 ");
				System.out.print("총합: " + a.get(i).getTotal() + "점 ");
				System.out.println("평균: " + a.get(i).getAvg() + "점 ");
				aa++;
			}
		}
		if (aa == 0) {
			System.out.println(student + " 라는 학생은 관리명단에 없습니다. ");
		}
	}

	public void outputavgover(HashMap<Integer, Inout> a, Scanner sc) {
		System.out.print("평균 점수를 입력하세요: ");
		int avg = sc.nextInt();
		int aa = 0;
		Set<Integer> keys = a.keySet();
		for (Integer i : keys) {
			if (a.get(i).getAvg() >= avg) {
				System.out.println("이름: " + a.get(i).getName());
				System.out.print("국어: " + a.get(i).getKor() + "점 ");
				System.out.print("수학: " + a.get(i).getMat() + "점 ");
				System.out.println("영어: " + a.get(i).getEng() + "점 ");
				System.out.print("총합: " + a.get(i).getTotal() + "점 ");
				System.out.println("평균: " + a.get(i).getAvg() + "점 ");
				aa++;
			}
		}
		if (aa == 0) {
			System.out.println("평균이 " + avg + " 이상인 학생은 명단에 없습니다. ");
		}

	}

	public void modifygrade(HashMap<Integer, Inout> a, Scanner sc) {
		System.out.print("수정할 학생 이름을 입력하세요: ");
		String student2 = sc.next();
		int aa = 0;
		Set<Integer> keys = a.keySet();
		for (Integer i : keys) {
			if (student2.equals(a.get(i).getName())) {
				System.out.println(student2 + " 학생 정보를 수정하겠습니다. ");
				System.out.print("변경할 이름: ");
				a.get(i).setName(sc.next());
				System.out.print("변경할 국어점수: ");
				a.get(i).setKor(sc.nextInt());
				System.out.print("변경할 영어점수: ");
				a.get(i).setEng(sc.nextInt());
				System.out.print("변경할 수학점수: ");
				a.get(i).setMat(sc.nextInt());
				System.out.println("변경된 정보는 아래와 같습니다. ");
				System.out.println("이름: " + a.get(i).getName());
				System.out.print("국어: " + a.get(i).getKor() + "점 ");
				System.out.print("수학: " + a.get(i).getMat() + "점 ");
				System.out.println("영어: " + a.get(i).getEng() + "점 ");
				System.out.print("총합: " + a.get(i).getTotal() + "점 ");
				System.out.println("평균: " + a.get(i).getAvg() + "점 ");
				aa++;
			}
		}
		if (aa == 0) {
			System.out.println(student2 + " 라는 학생은 관리명단에 없습니다. ");
		}
	}
}
