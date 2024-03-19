package day0319;

import java.util.Scanner;

public class Game_baseball {

	private int sum = 0;

	Baseball_RandomInt br;
	Baseball_Compare bc;
	Scanner sc ;

	public Game_baseball() {
		br = new Baseball_RandomInt();
		bc = new Baseball_Compare();
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Game_baseball gb = new Game_baseball();

		System.out.print("게임을 몇번 할지 입력하세요: ");
		int gamecnt = gb.sc.nextInt();
		int[] cntcase = new int[gamecnt];

		for (int i = 0; i < gamecnt; i++) {
			int cnt = 0;
			String random = gb.br.Randomint(); // 랜덤 난수 생성
			do {
				System.out.print("3자리 숫자를 입력해주세요(숫자 중복 X, " + random + "): ");
				gb.bc.setInput(gb.sc.next());
				cnt++;
				System.out.println(cnt + "번째 결과: " + gb.bc.Strike(gb.bc.getInput(), random) + "Strike "
						+ gb.bc.Ball(gb.bc.getInput(), random) + "Ball ");
			} while (!random.equals(gb.bc.getInput()));
			System.out.println(cnt + "번째 만에 성공하셨습니다!!!");
			System.out.println("");
			cntcase[i] = cnt;
		}

		for (int i = 0; i < cntcase.length; i++) {
			gb.sum += cntcase[i];
		}
		double avg = gb.sum / (double) gamecnt;

		System.out.println(gamecnt + "번 게임을 진행 결과, 평균적으로 " + avg + "번째 만에 성공하셨습니다!!!");

	}

}
