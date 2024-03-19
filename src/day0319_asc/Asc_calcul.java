package day0319_asc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Asc_calcul {

	private int start;
	private int end;
	private int[] range;
	private int compare;
	private ArrayList<String> result;
	Scanner sc = new Scanner(System.in);

	public Asc_calcul() {
		start = 0;
		end = 0;
		compare = 0;
		result = new ArrayList<String>();
	}

	public int start() {
		while (true) {
			System.out.print("첫번째 숫자 입력: ");
			this.start = sc.nextInt();
			if (100 <= start && start <= 9999999) {
				break;
			}
			System.out.println("잘못 입력하셨습니다!");
		}
		System.out.println("입력완료!");
		return this.start;
	}

	public int getstart() {
		return this.start;
	}

	public int end() {
		while (true) {
			System.out.print("두번째 숫자 입력: ");
			this.end = sc.nextInt();
			if (start <= end && end <= 9999999) {
				break;
			}
			System.out.println("잘못 입력하셨습니다!");
		}
		System.out.println("입력완료!");
		return this.end;

	}

	public int getend() {
		return this.end;
	}

	public int[] range(int a, int b) {
		start = a;
		end = b;
		range = new int[end - start+1];
		for (int i = start; i <= end; i++) {
			range[i - start] = i;
		}
		return range;
	}

	public ArrayList<String> sortstring(int[] range) { // 숫자 배열
		
		for (int i = 0; i < range.length; i++) {
			char[] it = Integer.toString(range[i]).toCharArray(); // 숫자 배열 >> 문자열 >> 문자 배열 변환
			compare = 0;
			
			for (int j = 0; j < it.length-1; j++) {
				if ((int) it[j] < (int) it[j + 1]) {
					compare++;
				}
			}
			if(it.length-1 == compare) {
			String str = new String(it);
			result.add(str);
			}
		}
		return result;
	}

//	public static void main(String[] args) {
//		Asc_calcul ac = new Asc_calcul();
//		int[] aa = ac.range(1234567,2345678);
//		Collections.sort(ac.sortstring(aa));
//		for (int i = 0; i < aa.length; i++) {
//			System.out.println(aa[i]);
//		}
//	ac.start();	
//	ac.end();
//		int[] aa = { 111, 122, 123, 124, 125 };
//		System.out.println(ac.sortstring(aa));
//	}

}
