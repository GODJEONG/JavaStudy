package day0318;

import java.net.*;

public class Networkex1 {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("호스트 이름: %s %n", iaddr.getHostName());
		System.out.printf("호스트 IP 주소: %s %n", iaddr.getHostAddress());

		iaddr = InetAddress.getByName("java.sun.com");
		System.out.printf("호스트 이름: %s %n", iaddr.getHostName());
		System.out.printf("호스트 IP 주소: %s %n", iaddr.getHostAddress());

		InetAddress sw[] = InetAddress.getAllByName("www.naver.com");
		for (InetAddress t : sw) {
			System.out.printf("호스트 이름: %s %n", t.getHostName());
			System.out.printf("호스트 IP 주소: %s %n", t.getHostAddress());
		}

	}

}
