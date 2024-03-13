package Day0313;

public class GenericEx2 {

	public static void main(String[] args) {

//		dd d = new dd();
//		dd()는 입력받은 변수를 출력하는 객체
		GenericEx1<String> t = new GenericEx1<String>();
		String[] ss = {"a","b","c"};
		t.set(ss);
		t.print();
		
//		GenericEx1 t = new GenericEx1();
//		Integer[] ss = {1,2,3};
//		t.set(ss);
//		t.print();
 	}
}
