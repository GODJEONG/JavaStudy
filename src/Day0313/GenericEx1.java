// 제네릭: 필드 변수를 지정하지 않은 상태에서 사용할 수 있게 해주는 거
// <Integer> 
// 컬렉션:
// 인터페이스 -- 상수, 추상클래스

package Day0313;

import static java.lang.System.out;

public class GenericEx1<T> {

	T[] v;

	public void set(T[] n) {
		v = n;
	}

	public void print() {
		for (T s : v)
			out.println(s + "등급");
	}

}
