package day_0321_grade_linkedlist;

import java.util.Scanner;

public class LinkedExam {

	static Student_Info head;
	static Student_Info cur;
	static Student_Info newNode;
	static Student_Info del;
	static Student_Info modi;

	Scanner sc = new Scanner(System.in);

	public LinkedExam() {
		// head = cur = newNode = new Student_Info(name, kor, eng, mat);
		head = cur = newNode = del = null;
	}

	public Student_Info info() {
		System.out.println("[정보 입력] ");
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("국어 성적 입력: ");
		int kor = sc.nextInt();
		System.out.print("수학 성적 입력: ");
		int mat = sc.nextInt();
		System.out.print("영어 성적 입력: ");
		int eng = sc.nextInt();
		return new Student_Info(name, kor, mat, eng);
	}

	public void add(Student_Info a) {
		cur = head;
		newNode = a;

		if (head == null || newNode.getAvg() > cur.getAvg()) {
			// head로 추가 1. 맨 처음 추가 2. 입력값이 1번째 숫자보다 큰 경우
			newNode.next = head;
			head = newNode;
		} else {
			while (cur.next != null && newNode.getAvg() <= cur.next.getAvg()) {
				// 커서 다음이 null 인경우는 고려대상 x
				// 커서는 항상 추가할 대상의 앞자리 위치
				// 커서의 다음 수치가 추가할 수치보다 크면 커서 이동! > 추가할 위치의 전자리로!
				cur = cur.next;
			}
			newNode.next = cur.next;
			cur.next = newNode;
		}
	}

	public void del(Scanner sc) {
		cur = head;
		String x = sc.next();
		if (cur.getName().equals(x)) {
			del = head;
			head = head.next;
		} else {
			while (true) {
				if (cur.next.getName().equals(x)) {
					del = cur.next;
					cur.next = cur.next.next;
					break;
				}
				cur = cur.next;
			}
		}
		del.next = null;
		del = null;

		System.out.println("[삭제완료]");
		prt();
	}

	public void prt() {
		cur = head;
		// 출력
		System.out.println("[성적 조회]");
		System.out.println("성적 조회는 평균 내림차순으로 출력됩니다.");

		while (cur != null) {
			cur.show();
			cur = cur.next;
		}

	}

	public void prt_pickme(Scanner sc) {
		cur = head;
		// 특정 학생 출력
		System.out.println("조회할 학생 이름을 입력하세요: ");
		String x = sc.next();
		while (true) {
			if (cur.getName().equals(x)) {
				break;
			}
			cur = cur.next;
		}
		cur.show();
	}

	public void prt_avgover(Scanner sc) {
		cur = head;
		// 특정 학생 출력
		System.out.println("평균을 입력하세요: ");
		int x = sc.nextInt();

		while (cur != null) {
			if (cur.getAvg() >= x) {
				cur.show();
			}
			cur = cur.next;
		}

	}

	public void modify(Scanner sc) {
		cur = head;
		System.out.println("수정할 학생 이름을 입력하세요: ");
		String x = sc.next();

		System.out.println("[수정 사항] ");
		if (cur.getName().equals(x)) {

			System.out.print("이름 입력: ");
			cur.setName(sc.next());
			System.out.print("국어 성적 입력: ");
			cur.setKor(sc.nextInt());
			System.out.print("수학 성적 입력: ");
			cur.setMat(sc.nextInt());
			System.out.print("영어 성적 입력: ");
			cur.setEng(sc.nextInt());

			modi = cur;
			head = cur.next;

		} else {
			while (true) {
				if (cur.next.getName().equals(x)) {
					break;
				}
				cur = cur.next;
			}

			System.out.print("이름 입력: ");
			cur.next.setName(sc.next());
			System.out.print("국어 성적 입력: ");
			cur.next.setKor(sc.nextInt());
			System.out.print("수학 성적 입력: ");
			cur.next.setMat(sc.nextInt());
			System.out.print("영어 성적 입력: ");
			cur.next.setEng(sc.nextInt());
			modi = cur.next;

			// 수정 노드 제외하고 연결
			cur.next = cur.next.next;
		}

		add(modi);
		System.out.println("===================================");
		System.out.println("[수정 완료] 전체 결과 보여드립니다.");
		prt();
	}

}
