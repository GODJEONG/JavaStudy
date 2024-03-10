import java.util.Scanner;

public class ClassExam5 {
	// field ---------------------------------------------------------
	private int stud, score;
	private String name;

	// constructor ---------------------------------------------------
	public ClassExam5(int a, String b, int c) {
		stud = a;
		name = b;
		score = c;
	}

	// getter setter ---------------------------------------------------
	public void SetStud(int a) {

		stud = a;
	};

	public int GetStud() {
		return stud;
	};

	public void Setname(String a) {
		name = a;
	};

	public String Getname() {
		return name;
	};

	public void SetScore(int a) {

		score = a;
	};

	public int GetScore() {
		return score;
	};

	// main ------------------------------------------------------------------------
	public static void main(String[] args) { // 학생수 입력 받아 성적관리(총합,평균) 결과 노출 프로그램

		Scanner sc = new Scanner(System.in);
		ClassExam5 grade = new ClassExam5(1, "홍길동", 100);
		System.out.print("학생수 입력: ");
		grade.SetStud(sc.nextInt());

		String[] name1 = new String[grade.GetStud()];
		int[][] score1 = new int[grade.GetStud()][4];
		float[] avg1 = new float[grade.GetStud()];

		for (int i = 0; i < name1.length; i++) {
			System.out.print("학생 이름 입력: ");
			grade.Setname(sc.next());
			name1[i] = grade.Getname();

			for (int j = 0; j < score1[i].length - 1; j++) {
				System.out.print("점수 입력: ");
				grade.SetScore(sc.nextInt());
				score1[i][j] = grade.GetScore();
				score1[i][score1[i].length - 1] += score1[i][j];
			}
			avg1[i] = score1[i][score1[i].length - 1] / (float) (score1[i].length - 1);
		}
		for (int i = 0; i < name1.length; i++) {
			System.out.print("이름: " + name1[i] + " ");
			System.out.print("국어: " + score1[i][0] + " ");
			System.out.print("영어: " + score1[i][1] + " ");
			System.out.print("수학: " + score1[i][2] + " ");
			System.out.print("총점: " + score1[i][3] + " ");
			System.out.print("평균: " + avg1[i] + " ");
			System.out.println();
		}
		;
	};

}
