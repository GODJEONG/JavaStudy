package day0328_db;

import java.util.Scanner;

public class Method_LinkedArray {

	static Student_Info head;
	static Student_Info cur;
	static Student_Info newNode;
	static Student_Info del;
	static String del_name;
	static Student_Info modi;

	Scanner sc = new Scanner(System.in);

	public Method_LinkedArray() {
		head = cur = newNode = del = null;
	}

	public void init() {
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

	public Student_Info info_input(String name, int kor, int mat, int eng) {
		return new Student_Info(name, kor, mat, eng);
	}

	public Student_Info add(Student_Info a) {

		cur = head;

		if (head == null || a.getAvg() > cur.getAvg()) {
			// head로 추가 1. 맨 처음 추가 2. 입력값이 1번째 숫자보다 큰 경우
			a.next = head;
			head = a;
		} else {
			while (cur.next != null && a.getAvg() <= cur.next.getAvg()) {
				// 커서 다음이 null 인경우는 고려대상 x
				// 커서는 항상 추가할 대상의 앞자리 위치
				// 커서의 다음 수치가 추가할 수치보다 크면 커서 이동! > 추가할 위치의 전자리로!
				cur = cur.next;
			}
			a.next = cur.next;
			cur.next = a;
		}
		return a;
	}

	public String del(Scanner sc) {
		cur = head;
		System.out.print("[삭제 기능]삭제할 학생 이름을 입력하세요: ");
		String x = sc.next();

		if (cur.getName().equals(x)) {
			del = head;
			head = head.next;
		} else {
			while (cur.next != null) { // cur.next가 null인지 확인
				if (cur.next.getName().equals(x)) {
					del = cur.next;
					cur.next = cur.next.next;
					break;
				}
				cur = cur.next;
			}
			if (cur.next == null) {
				System.out.println("입력한 이름을 가진 학생을 찾을 수 없습니다.");
				return null;
			}
		}
		del_name = del.getName();
		del.next = null;
		del = null;
		prt();
		return del_name;
	}

	public void prt() {
		cur = head;
		if (cur == null)
			System.out.println("저장된 데이터가 없습니다.");

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

	public Student_Info modify(Scanner sc) {
		cur = head;
		System.out.print("[수정 기능]수정할 학생 이름을 입력하세요: ");
		String s = sc.next();
		System.out.println("1번" + cur.getName());
		System.out.println("[수정 사항] ");

		if (cur == null) {
			System.out.println("데이터가 없습니다.");
		} else if (cur.getName().equals(s)) {
			System.out.print("같다: 이름 입력: ");
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
				if (cur.next.getName().equals(s)) {
					break;
				}
				cur = cur.next;
			}
		    //System.out.println("cur:" + cur.getName());
			//System.out.println("cur.next: " + cur.next.getName());

			System.out.print("다르다: 이름 입력: ");
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
		//	System.out.println("2번"+cur.next.getName());
		//	System.out.println("3번"+cur.next.getAvg());

		add(modi);
		System.out.println("===================================");
		System.out.println("[수정 완료] 전체 결과 보여드립니다.");
		prt();
		return modi;
	}

}
