package java_basic;

import java.util.Scanner;

public class Operation1 {

	public static void main(String[] args) {
		
//		int a = 3;
//		int b = 5;
//		
//		System.out.println("���ϱ�: " + (a+b));
//		System.out.println("����: "+ (a-b));
//		System.out.println("���ϱ�: "+ (a*b));
//		System.out.println("������: "+ (a/(float)b));
//		
//		System.out.println("��: "+ (a/b));
//		System.out.println("������: "+ (a%b));
		
		Scanner scann = new Scanner(System.in);
		
		
		int firstInt = 0;
		int secondInt = 0;
		
		System.out.print("���� �� ���� �Է��ϼ���: ");
		firstInt = scann.nextInt();
		secondInt = scann.nextInt();
		
		float sum = firstInt + secondInt;
		float minus = firstInt-secondInt;
		float multi = firstInt * secondInt;
		float div = firstInt / (float)secondInt;
		
		int quo = firstInt / secondInt;
		int rest = firstInt % secondInt;
		
		System.out.println("ù��° ����: " + firstInt);
		System.out.println("�ι�° ����: " + secondInt);
		System.out.println("���ϱ�: " + sum);
		System.out.println("����: " + minus);
		System.out.println("���ϱ�: " + multi);
		System.out.println("������: " + div);
		System.out.println("��: " + quo);
		System.out.println("������: " + rest);
		
	}

}
