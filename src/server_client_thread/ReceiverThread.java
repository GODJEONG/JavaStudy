package server_client_thread;
import java.io.*;
import java.net.*;
class ReceiverThread extends Thread {
    Socket socket;
    ReceiverThread(Socket socket) { // 클라이언트 소켓을 매개변수 받는 생성자 생성 
        this.socket = socket; 
    }
    public void run() { // 쓰레드 오버라이드
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓 입력 스트림을 활용하여 데이터 읽어드림
            while (true) {
		//서버로부터 수신된 메시지를 모니터로 출력
                String str = reader.readLine();  // 서버로부터 한줄한줄 읽음
                if (str == null) 
                    break;
                System.out.println(str); // 출력
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage()); // 예외처리
        }
    }
}
