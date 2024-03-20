package day0320_sort;

import java.util.Random;

public class Sortex2_insert {
	
	private int comparisonCnt;
	
	public Sortex2_insert() {
		comparisonCnt =0;
	}

	public static void main(String[] args) {
		Sortex2_insert se = new Sortex2_insert();

		int data[] = new int[1000];
		Random rd = new Random();

		for (int i = 0; i < 1000; i++) {
			data[i] = rd.nextInt(1000);
		}

		se.InsertionSort1(data, 1000);
		System.out.println();

		for (int i = 0; i < 998; i++) {
			System.out.println(data[i]);
			if (data[i] > data[i + 1]) {
				System.out.println("error");
				System.out.println(data[i]);
			}
		}
	}

	
	
	
	public void InsertionSort1(int[] a, int b) {
	
		for(int i=1;i<b;i++) {
			int tmp = a[i];
			int j=0;
			for(j=i;j>0 && a[j-1] >tmp; j--) {
				a[j]=a[j-1];
			}
			a[j]=tmp;
		}
	}
		
	public void InsertionSort(int[] data) {

		   for(int i=1; i < data.length; i++) {

	            //첫 번째 for문의 i의 위치 => 인덱스, 비교 대상의 값을 선정
	            int keyValue = data[i];
	            //첫 번째 for문의 i의 위치부터 0번째 index까지 비교대상의 변수명
	            // 현재 위치의 i는 비교할 필요가 없다. [ 초기 선언시, 자기 자신 이므로 ]
	            int searchIndex = i - 1;

	            //삽입 정렬의 비교 대상
	            //1. 0 번째 인덱스까지 비교
	            //2. 제일 앞은 최소값이므로, 자신보다 작은 index 나올때까지 찾기 위해 반복문
	            while(0 <= searchIndex && data[searchIndex] > keyValue) {
	                comparisonCnt++;            //삽입정렬 횟수 Count
	                data[searchIndex+1] = data[searchIndex];    //첫 번째 조건의 값이 자기보다 크다면 index 한칸씩 뒤로 미루기.
	                searchIndex--;                              //반복을 위한 증감값 설정 ( while 탈출 용)
	            }

	            data[searchIndex+1] = keyValue; //while이 끝날 경우, 해당 index에 값 생성, + 위에서 index가 --되었으므로 다시 +1 하기
	        }
	}
}
