package server_client_thread;

import java.net.*;
class ClientExample4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                "Usage: java ClientExample4 <user-name>");  // 채팅 이름 설정 노출
            return;
        }
        try {
	    // 서버와 연결
            Socket socket = new Socket("192.168.0.113", 7252); // 클라이언트 소켓을 생성하고, 서버의 IP주소와 포트를 전달

             // 메시지 송신 쓰레드와 수신 쓰레드 생성해서 시작
            Thread thread1 = new SenderThread(socket, args[0]);  // 서버에 메시지를 보내는 쓰레드 생성
            Thread thread2 = new ReceiverThread(socket); // 서버로부터 메시지를 수신하는 쓰레드 생성

            thread1.start(); // 쓰레드 시작
            thread2.start(); // 쓰레드 시작
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // 예외처리
        }
    }
}
