package day0321;

import java.util.Scanner;

public class LinkedExam {

	static Linkedlist_ex1 head;
	static Linkedlist_ex1 cur;
	static Linkedlist_ex1 newNode;
	static Linkedlist_ex1 del;
	Scanner sc = new Scanner(System.in);
	private int aa = 0;
	private int a = 0;
	private int x = 0;

	public static void main(String[] args) {

		LinkedExam le = new LinkedExam();
		head = cur = newNode = new Linkedlist_ex1();
		newNode.next = null;

		le.history();
		newNode.setData(5);

		do {
			System.out.print("[1.추가 2. 삭제] 입력:");
			le.aa = le.sc.nextInt();

			switch (le.aa) {
			case 1:

				System.out.println("추가할 위치를 입력하세요: ");
				le.a = 0;
				le.a = le.sc.nextInt();

				switch (le.a) {
				case 1:
					le.add1();
					break;
				case 2:
				case 3:
				case 4:
				case 5:
					le.add_2_5(le.a);
					break;
				case 6:
					le.add6();
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
				break;
			case 2:
				System.out.println("삭제할 위치를 입력하세요: ");
				le.a = le.sc.nextInt();
				le.del(le.a);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

			le.prt(); // 초기화 및 출력

			System.out.println("다시 진행하시겠습니까?(1.네 2.아니오): ");
			le.x = le.sc.nextInt();
		} while (le.x == 1);
	}

	public void del(int a) {
		cur = head;
		del = new Linkedlist_ex1();
		if (a == 1) {
			del = head;
			head = head.next;
		}
		if (a > 1) {
			for (int i = 0; i < a - 2; i++) {
				cur = cur.next;
			}
			del = cur.next;
			cur.next = cur.next.next;
		}
		del.next = null;
		del = null;

	}

	public void add1() {
		cur = head;
		System.out.println("추가할 값을 입력하세요: ");
		newNode = new Linkedlist_ex1();
		newNode.setData(sc.nextInt());
		newNode.next = head;
		head = newNode;

	}

	public void add_2_5(int a) {
		cur = head;
		System.out.println("추가할 값을 입력하세요: ");
		newNode = new Linkedlist_ex1();
		newNode.setData(sc.nextInt());

		for (int i = 0; i < a - 2; i++) {
			cur = cur.next;
		}
		newNode.next = cur.next;
		cur.next = newNode;

	}

	public void add6() {
		cur = head;
		System.out.println("추가할 값을 입력하세요: ");
		newNode = new Linkedlist_ex1();
		newNode.setData(sc.nextInt());
		while (cur.next != null) {
			cur = cur.next;
		}
		newNode.next = null;
		cur.next = newNode;
	}

	public void prt() {
		cur = head;
		// 출력
		while (cur != null) {
			System.out.println(cur.getData());
			cur = cur.next;
		}

	}

	public void history() {
		newNode.setData(1);
		// newNode.next = null;

		// newNode = new LinkNode();
		newNode.next = new Linkedlist_ex1();
		newNode.next.setData(2);
		newNode.next.next = null;

		newNode.next.next = new Linkedlist_ex1();
		newNode.next.next.setData(3);
		newNode.next.next.next = null;

		newNode.next.next.next = new Linkedlist_ex1();
		newNode.next.next.next.setData(4);
		newNode.next.next.next.next = null;

		newNode = new Linkedlist_ex1();
		newNode.next = head;
		head = newNode;
	}
}
