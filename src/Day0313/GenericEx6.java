package Day0313;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // 생성자
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    // 이름 설정 메서드
    public void setName(String name) {
        this.name = name;
    }

    // 나이 설정 메서드
    public void setAge(int age) {
        this.age = age;
    }

    // 이름 반환 메서드
    public String getName() {
        return name;
    }

    // 나이 반환 메서드
    public int getAge() {
        return age;
    }
}


public class GenericEx6 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Person> personList = new ArrayList<Person>();

	        // 3명의 정보 입력 받기
	        for (int i = 0; i < 3; i++) {
	            System.out.println("이름을 입력하세요:");
	            String name = scanner.nextLine();
	            System.out.println("나이를 입력하세요:");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // 개행 문자 처리

	            // Person 객체 생성 후 ArrayList에 추가
	            Person person = new Person();
	            person.setAge(age);
	            person.setName(name);
	            personList.add(person);
	        }

	        // 입력 받은 정보 출력
	        System.out.println("입력 받은 정보:");
	        for (Person t : personList) {
	            System.out.println("이름: " + t.getName() + ", 나이: " + t.getAge());
	        }
	    }
	}
	

