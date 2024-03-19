package day0319_baseball;

public class Test {
	public static void main(String[] args) {
		
		int gamecnt = 3;
		int sum = 0;
		
		int[] cntcase = new int[gamecnt];
		for(int i = 0 ;i<3;i++) {
		cntcase[i] = i;
		}
				
		for (int i : cntcase) {
			sum += cntcase[i];
		}
		double avg = sum / (double) gamecnt;
		System.out.println(avg);
	}

}
