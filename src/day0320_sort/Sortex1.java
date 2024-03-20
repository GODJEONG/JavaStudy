package day0320_sort;

public class Sortex1 {

	public static void main(String[] args) {
		Sortex1 se = new Sortex1();
		int data[] = { 90, 78, 100, 30, 55 };
		se.bubbleSort1(data);

		for (int i : data) {
			System.out.println(i + "\t");
		}
	}

	public int[] bubbleSort1(int[] a) {
		int temp =0;
		int cnt_if=0;
		int cnt_for = 0;
		
		for(int i =0; i < a.length-1;i++) {
			for(int j = 0; j< a.length-1-i;j++) {
				if (a[j] >= a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					cnt_if++;
				}
				cnt_for++;
			}
		}
		System.out.println("for문 횟수: " + cnt_for);
		System.out.println("if문 횟수: " + cnt_if);
		return a;
		
	}

	public int[] bubbleSort(int[] a) {
		int cnt_for = 0;
		int cnt_if = 0;
		int temp = 0;
		int check;

		do {
			check = 9999;
			for (int i = 0; i < a.length - 1 - (cnt_for / 4); i++) {
				if (a[i] >= a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					check = 0;
					cnt_if++;
				}
				cnt_for++;
			}
		} while (check != 9999);
		System.out.println("for문 횟수: " + cnt_for);
		System.out.println("if문 횟수: " + cnt_if);
		return a;
	}

}
