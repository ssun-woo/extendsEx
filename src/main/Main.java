package main;

import java.util.Scanner;

class phone {

	public void on() {
		System.out.println("전원on");
	}

	public void off() {
		System.out.println("전원off");
	}

	public void SN(String sn) {
		System.out.println("제품번호 : " + sn);
	}

	public void message() {
		System.out.println("메시지 기능");
	}

	public void call() {
		System.out.println("전화기능");
	}
}
class Iphone extends phone {
	
	public void faceId() {
		System.out.println("faceId");
	}
	public void faceTime() {
		System.out.println("faceTime");
	}
	public void applePay() {
		System.out.println("applePay");
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Iphone ip = new Iphone();

		while (true) {
			System.out.println("1. 아이폰");
			System.out.println("2. 삼성");
			System.out.println("3. LG");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("아이폰 가능한 기능 보기");
				ip.on();
				ip.faceId();
				ip.faceTime();
				ip.applePay();
				ip.SN("1234");
				ip.message();
				ip.call();
				ip.off();
				break;
			case 2:
				System.out.println("삼성 가능한 기능 보기");
				break;
			case 3:
				System.out.println("LG 가능한 기능 보기");
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}

		}
	}

}
