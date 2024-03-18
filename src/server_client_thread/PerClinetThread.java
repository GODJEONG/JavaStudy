package server_client_thread;
//각 클라이언트 접속에 대해 하나씩 작동하는 스레드 클래스 

import java.io.*;
import java.net.*;
import java.util.*;

class PerClinetThread extends Thread {

	// ArrayList 객체를 여러 스레드가 안전하게 공유할 수 있는 동기화된 리스트로 만듭니다.
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

	Socket socket;  // 소켓 정의
	PrintWriter writer; // 입력 공간 정의

	PerClinetThread(Socket socket) {  // 서버 소켓 기반 생성자
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream()); // 클라이언트에게 메세지를 보내기 위한 출력 스트림 한줄
			list.add(writer); // ArrayList에 writer 문자열 저장
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 예외처리
		}
	}

	public void run() {  // 쓰레드 작동 
		String name = null;  // 이름 정의
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //  클라이언트로부터 데이터를 읽어드리는 스트림 생성
	     	// 수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장
			name = reader.readLine();  // 클라이언트의 첫줄 읽어들여 저장
			sendAll("#" + name + "님이 들어오셨습니다"); // 새로운 클라이언트 참여했다는 메시지 모든 클라이언트에게 전달
			while (true) {
				String str = reader.readLine(); //클라이언트로부터 데이터 저장
				if (str == null)
					break;
				sendAll(name + ">" + str); // 수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());  // 예외 처리
		} finally {
			list.remove(writer);  // 채팅을 종료한 클라이언트의 리스트 제거
			sendAll("#" + name + "님이 나가셨습니다"); // 사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
			try {
				socket.close();
			} catch (Exception ignored) { // 예외처리
			}
		}
	}

	// 서버에 연결되어 있는 모든 클라이언트로 똑같은 메시지를 보냅니다.
	private void sendAll(String str) {
		for (PrintWriter writer : list) {
			writer.println(str);  // 입력한 내용 전달
			writer.flush(); // 버퍼 제거
		}
	}
}
