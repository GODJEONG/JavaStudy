
public class Exceptionexam4 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[5];
		arr = new int[] { 1, 2, 3, 4, 5 };
		// try {
		System.out.println(arr[5]); // 예외 java.lang.ArrayIndexOutOfBoundsException 발생
		// }catch(ArrayIndexOutOfBoundsException arryindex) {
		// System.out.println("배열 길이보다 긴 인덱스의 값을 조회했습니다");
		// }
	}
}
