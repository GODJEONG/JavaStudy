package day0320_sort;

import java.util.Random;

public class Sortex2 {

	public static void main(String[] args) {
		Sortex2 se = new Sortex2();

		int data[] = new int[1000];
		Random rd = new Random();

		for (int i = 0; i < 1000; i++) {
			data[i] = rd.nextInt(1000);
		}

		se.InsertionSort(data, 1000);
		System.out.println();

		for (int i = 0; i < 998; i++) {
			System.out.println(data[i]);
			if (data[i] > data[i + 1]) {
				System.out.println("error");
				System.out.println(data[i]);
			}
		}
	}

	public void InsertionSort(int[] a, int b) {

		for (int i = 1; i < b; i++) {
			int j=0;
			int tmp = a[i];  // 기준점 세팅 / 기준점 이전으로 정렬된거 
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j]=tmp;
		}
	}
}
