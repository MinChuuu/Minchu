package java_basic;

import java.util.Scanner;

public class Quiz1120 {

	public static void main(String[] args) {
		
//		4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷� �ۼ�
		Scanner scann = new Scanner(System.in);
		
		int i=0;
		int fourth = 0;
		int third = 0;
		int second = 0;
		int first = 0;
		
		System.out.print("4�ڸ� ������ �Է��ϼ���: ");
		i = scann.nextInt();
		
		float ii = i / 10000f;
		
		ii = ii * 10;
		fourth = (int)ii;
		
		ii = ii - fourth;
		ii = ii * 10;
		third = (int)ii;
		
		ii = ii - third;
		ii = ii * 10;
		second = (int)ii;
		
		ii = ii - second;
		ii = ii * 10;
		first = (int)(ii+0.5);
		
		System.out.println("�Է��� ����: " + i);
		System.out.println("4�ڸ� ����: " + fourth);
		System.out.println("3�ڸ� ����: "+ third);
		System.out.println("2�ڸ� ����: " + second);
		System.out.println("1�ڸ� ����: " + first);
		

	}

}
