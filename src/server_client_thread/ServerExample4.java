package server_client_thread;

import java.net.*;
class ServerExample4 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;  // 서버 소켓 정의
        try {
            serverSocket = new ServerSocket(7252); // 서버 소켓 포트 할당 및 객체 생성
            while (true) {
                Socket socket = serverSocket.accept(); // accept를 통한, 클라이언트 소켓과의 연결 > 이후 서버 소켓 생성
                Thread thread = new PerClinetThread(socket);  // 쓰레드를 통한 각각의 활동 세팅
                thread.start();  // runnable 상태로 변환 
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());  // 예외 처리
        }
    }
}
