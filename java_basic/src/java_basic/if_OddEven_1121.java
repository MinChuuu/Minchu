package java_basic;

import java.util.Scanner;

public class if_OddEven_1121 {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int Int = 0;
		char OddEven = ' ';

		System.out.println("���� �ϳ��� �Է��Ͻÿ�.");
		Int = scann.nextInt();

		if (Int % 2 == 0) {
			OddEven = '¦';
		} else {
			OddEven = 'Ȧ';
		}

		System.out.printf("�Է��� ���� " + Int + "�� " + OddEven + "�� �Դϴ�.");

	}

}
