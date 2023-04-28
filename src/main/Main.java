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

class Lg extends phone {

	public void lgPay() {
		System.out.println("Lg페이 기능");
	}

	public void hand() {
		System.out.println("손동작 기능");
	}
}

class Samsung extends phone {
	public void samsung() {
		System.out.println("지문인식 기능");
		System.out.println("울트라 줌");
		System.out.println("삼성페이");
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Lg lg = new Lg();

		Samsung ss = new Samsung();

		while (true) {
			System.out.println("1. 아이폰");
			System.out.println("2. 삼성");
			System.out.println("3. LG");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("아이폰 가능한 기능 보기");
				break;
			case 2:
				System.out.println("삼성 가능한 기능 보기");
				ss.on();
				ss.off();
				ss.SN("20230428");
				ss.message();
				ss.call();
				ss.samsung();
				break;
			case 3:
				System.out.println("LG 가능한 기능 보기");
				lg.on();
				lg.off();
				lg.SN("LG 시리얼 넘버");
				lg.message();
				lg.call();
				lg.lgPay();
				lg.hand();
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}

		}
	}

}
