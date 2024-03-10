import java.util.Scanner;

public class Allstudent {

	public static void main(Str[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요: ");
		int num =sc.nextInt();
					
		Gradeinput []stu = new Gradeinput[num];
		for(int i=0;i<=num-1;i++) {
			
		stu[i]=new Gradeinput();
		System.out.print("이름 입력: ");
		stu[i].setName(sc.next());
		System.out.print("국어 성적 입력: ");
		stu[i].setKor(sc.nextInt());
		System.out.print("수학 성적 입력: ");
		stu[i].setMat(sc.nextInt());
		System.out.print("영어 성적 입력: ");
		stu[i].setEng(sc.nextInt());

		System.out.println(" -------" + i + " 번째 학생 성적 ------- ");
		System.out.println("이름: "+ stu[i].getName());
		System.out.print("국어: "+ stu[i].getKor()+ "점 " );
		System.out.print("수학: "+ stu[i].getMat()+ "점 ");
		System.out.println("영어: "+ stu[i].getEng()+ "점 ");
		System.out.print("총합: "+ stu[i].getTotal()+ "점 ");
		System.out.println("평균: "+ stu[i].getAvg()+ "점 ");		
		}
		System.out.println(" --------------------------- ");

	
	}

}
