package day0320_sort;

import java.util.Scanner;

public class Queue_ex1 {

	int[] q;
	int rear;
	int start;
	int x;
	int xx;
	Scanner sc = new Scanner(System.in);

	public Queue_ex1() {

		q = new int[5];
		rear = 0;
		start = 0;
		x = 0;
		xx = 0;
	}

	public static void main(String[] args) {
		Queue_ex1 qe = new Queue_ex1();

		qe.enq(1);
		qe.show();
		qe.enq(2);
		qe.show();
		qe.enq(3);
		qe.show();
		qe.enq(4);
		qe.show();
		qe.enq(5);
		qe.show();
		qe.deq();
		qe.show();
		qe.deq();
		qe.show();
		qe.enq(1);
		qe.show();

//		do {
//			System.out.print("[1. enqueue 2. dequeue] 입력: ");
//			qe.x = qe.sc.nextInt();
//			switch (qe.x) {
//			case 1:
//				System.out.print("enqueue 할 숫자 입력: ");
//				qe.enq(qe.sc.nextInt());
//				qe.show();
//				break;
//			case 2:
//				qe.deq();
//				qe.show();
//				break;
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//			}
//			System.out.print("계속하시겠습니까?(1. 네 2. 아니오):  ");
//			qe.xx = qe.sc.nextInt();
//		} while (qe.xx == 1);

	}

	public void enq(int a) {
		shift();
		q[rear] = a;
		rear++;
		System.out.println("enqueue 완료");
	}

	public void deq() {
		q[start] = 0;
		start++;
		System.out.println("dequeue 완료");

	}

	public void shift() {
		if (rear == 5 & start > 0) {
			for (int i = start; i < rear; i++) {
				q[i - start] = q[i];
				q[i] = 0;
			}
			rear -= start;
			start = 0;
//			for (int i = rear; i < 5; i++) {
//				q[i] = 0;
//			}

		}
	}

	public void show() {
		// System.out.print(q.length);
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i] + "\t");
		}
		System.out.println("");
		System.out.println("START: " + start + " REAR: " + rear);
	}

}
