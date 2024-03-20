package day_0319;

import java.util.Scanner;

public class Game_total {

	private int a; // 진행할 프로그램 선택
	private int again; // 전체 재진행
	Scanner sc = new Scanner(System.in);
	Game_baseball gb;
	Min_summary ms;
	Asc_summary as;
	Babygin_summary bs;

	public Game_total() {
		a = 0;
		again = 0;
		gb = new Game_baseball();
		ms = new Min_summary();
		as = new Asc_summary();
		bs = new Babygin_summary();
	}

	public static void main(String[] args) {
		Game_total gt = new Game_total();

		do {
			System.out.println("진행할 프로그램을 선택하세요");
			System.out.println("1.숫자야구게임 2.작은수변경 3.정돈된 수 4.baby-gin");
			System.out.print("입력: ");
			gt.a = gt.sc.nextInt();  
			switch (gt.a) {
			case 1:
				gt.gb.play();  // 동적바인딩 반영할수 잇다
				break;
			case 2:
				gt.ms.minimize();
				break;
			case 3:
				gt.as.asc_num();
				break;
			case 4:
				gt.bs.babygin();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.print("다시 진행하시겠습니까?(1.네 2.아니오) ");
			gt.again = gt.sc.nextInt();
		} while (gt.again == 1);

	}

}
