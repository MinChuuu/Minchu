package java_basic;

import java.util.Scanner;

public class Homework1120 {

	public static void main(String[] args) {
		
//		4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷� �ۼ�
		Scanner scann = new Scanner(System.in);
		
		int i=0;
		
		System.out.print("4�ڸ� ������ �Է��ϼ���: ");
		i = scann.nextInt();
		
		System.out.println("�Է��� ����: " + i);
		System.out.println("4�ڸ� ����: " + i/1000);
		System.out.println("3�ڸ� ����: "+ (i/100)%10);
		System.out.println("2�ڸ� ����: " + (i/10)%10);
		System.out.println("1�ڸ� ����: " + i%10);
		

	}

}
