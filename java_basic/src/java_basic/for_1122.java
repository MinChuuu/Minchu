package java_basic;

import java.util.Scanner;

public class for_1122 {

	public static void main(String[] args) {

//		int sum = 0;
//
//		for(int i=1; i<11; i++) {
//			i++;
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		
		
		

//		//������
//		String result = "";
//		
//		for(int i = 2; i<10; i++) {
//			for(int j = 1; j<10; j++) {
//				result += i + " * " + j + " = " + i * j + "\n";
//			}
//			result = result + "\n";
//		}
//
//		System.out.println(result);
		
		
		
		
//		// ������ ���ڸ� �Է¹޾� �Ҽ����� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		int i = 0;
//		boolean isPrime = true;
//
//		Scanner scann = new Scanner(System.in);
//		
//		System.out.println("������ �Է��ϼ���.");
//
//		int num = scann.nextInt();
//
//		for (i = 2; i < num; i++) {
//			if (num % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		
//		if(isPrime) {
//			System.out.println("�Ҽ��Դϴ�.");
//		}
//		else {
//			System.out.println("�Ҽ��� �ƴմϴ�.");
//		}
		
		
		
		//�Է��� ������ŭ '*'�� ��� ���α׷��� �ۼ��Ͻÿ�.
		
		String result = "";
		System.out.println("������ �Է��ϼ���.");
		Scanner scann = new Scanner(System.in);
		int num = scann.nextInt();
		for(int i = 0; i < num; i++) {
			result += "*";
		}
		System.out.println(result);
		
		
	}

}
