package day_0319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Babygin_summary {

	ArrayList<Integer> al;
	Babygin_calcul bc;
	private int go;
	Scanner sc = new Scanner(System.in);

	public Babygin_summary() {
		al = new ArrayList<Integer>();
		bc = new Babygin_calcul();
		go = 1;
	}

	public void babygin() {
		Babygin_summary bs = new Babygin_summary();

		do {
			bs.al = bs.bc.Randomint(); // 난수 생성
//			bs.al = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 1, 2, 3));
			System.out.println("6자리 숫자 카드 생성" + bs.al);
			bs.bc.basecnt(bs.al); // 0~9 숫자 배열 갯수 확인

			bs.bc.run();
			bs.bc.triplete();

			if (bs.bc.gettotal() == 0) {
				System.out.println("Baby gin!!");
				System.out.println("run은 " + bs.bc.getrun() + "/ triplete은 " + bs.bc.gettriplete());
			} else {
				System.out.println("Lose");
			}

			System.out.print("다시 진행하시겠습니까?(1.네 2.아니오): ");
			bs.go = bs.sc.nextInt();
		} while (bs.go == 1);
	}
}
