package java_basic;

import java.util.Scanner;

public class if_OddEven_1121 {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int Int = 0;
		char OddEven = ' ';

		System.out.println("정수 하나를 입력하시오.");
		Int = scann.nextInt();

		if (Int % 2 == 0) {
			OddEven = '짝';
		} else {
			OddEven = '홀';
		}

		System.out.printf("입력한 정수 " + Int + "는 " + OddEven + "수 입니다.");

	}

}
