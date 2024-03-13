
public class Exceptionexam3 {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length()); // 예외 java.lang.NullPointerException 발생
		} catch (NullPointerException nl) {
			System.out.println("문자열에 입력된 값이 null이라 길이를 측정할 수 없습니다");
			return;
		}

	}
}


