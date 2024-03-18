package server_client_thread;

import java.net.*;
import java.io.*;
class SenderThread extends Thread {  // 쓰레드 상속
    Socket socket;
    String name;
    SenderThread(Socket socket, String name) {   // 이름과 클라이언트 소켓 인자로 받는 생성자
        this.socket = socket;
        this.name = name;
    }
    public void run() {  // 쓰레드 run 함수 오버라이딩
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력받은 내용 읽어서 데이터 저장
            PrintWriter writer = new PrintWriter(socket.getOutputStream());  // 소켓 출력스트림을 이용해서 데이터 전송하기위한 printwriter에 담는다.
           
	    // 제일 먼저 서버로 대화명 송신한다.
	    writer.println(name);  //  이름 전달
            writer.flush(); // 버퍼 제거
           
	   // 키보드로 입력된 메시지를 서버로 송신 
	    while (true) {
                String str = reader.readLine(); // 키보드 한줄 읽어드림
                if (str.equals("bye"))
                    break;
                writer.println(str); // 서버로 전달
                writer.flush(); // 버퍼 제거
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // 예외처리
        }
        finally {
            try { 
                socket.close(); // 소켓 종료
            } 
            catch (Exception ignored) { // 예외 처리
            }
        }
    }
}
