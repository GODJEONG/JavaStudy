package day_0319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Babygin_calcul {
	private Random rd; // 난수 발생
	private int[] base; // 0~9 까지의 갯수
	ArrayList<Integer> al; // 랜덤 숫자 6자리
	private int run;
	private int triplete;
	private int total;

	public Babygin_calcul() {
		rd = new Random();
		base = new int[10];
		al = new ArrayList<Integer>();
		run = 0;
		triplete = 0;
		total = 0;
	}

	public ArrayList<Integer> Randomint() {

		al.clear();
		while (al.size() < 6) {
			int rn = rd.nextInt(10);
			al.add(rn);
		}
		return al;
	}

	public int[] basecnt(ArrayList<Integer> t) {

		for (int i = 0; i < t.size(); i++) {
			base[t.get(i)]++;
			total++;
		}
		return base;

	}

	public void run() {
		for (int i = 0; i < base.length; i++) {
			while(base[i] >= 3) {
				base[i] -= 3;
				total -= 3;
				run++;	
			}
		}
	}

	public void triplete() {
		for (int i = 0; i < base.length - 2; i++) {
			while(base[i] != 0 && base[i] == base[i + 1]  && base[i] == base[i + 2]) {
				base[i] -= 1;
				base[i + 1] -= 1;
				base[i + 2] -= 1;
				total -= 3;
				triplete++;
			}
		}
	}
	
	public int getrun() {
		return run;
	}
	
	public int gettriplete() {
		return triplete;
	}
	
	public int gettotal() {
		return total;
	}

//	public static void main(String[] args) {
//		Babygin_calcul bc = new Babygin_calcul();
////		ArrayList<Integer> t = bc.Randomint();
//		ArrayList<Integer> t = new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,1));
//		System.out.println(t);
//		bc.basecnt(t);
//		for (int i = 0; i < bc.base.length; i++) {
//			System.out.println(i + "번째 " + bc.base[i]);
//		}
//		System.out.println("total은 " +bc.total);
//		
//		bc.run();
//		bc.triplete();
//		
//			
//		System.out.println("run은 "+ bc.run + "/ triplete은 " + bc.triplete);
//		System.out.println("total은 " +bc.total);
//		
//	}
}
