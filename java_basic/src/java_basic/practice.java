package java_basic;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
//		�Ǽ��� �Է¹޾� �Ҽ� ��°�ڸ����� �ݿø�
		
		Scanner scann = new Scanner(System.in);
		
		float input = 0;
		float output = 0;
		
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		input = scann.nextFloat();

		
		output = (int)((input*100+5)/10)/10f;
		// 123461 => 123461/10 => 12346 => 1234.6
		
		System.out.println("�Է°�: "+ input);
		System.out.println("��°�: "+ output);
		System.out.println();
		
		/* ����, ����, ����, ���� ������ �Է� �޾� ������ ����� ����Ͻÿ�.
		��, ����� �Ҽ��� ��°�ڸ����� �ݿø��Ͻÿ�. */
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		
		int sum = 0;
		float avg = 0f;
		
		System.out.print("���� ������ �Է��ϼ���: ");
		kor = scann.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		eng = scann.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		math = scann.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		sci = scann.nextInt();
		
		sum = kor + eng + math + sci; //313
		avg = (int)((sum/4f*100+5)/10)/10f; //78.30
		//float avg = (kor + eng + math + sci)/4f;
		
		System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\n", kor, eng, math, sci, sum, avg);
		
//		System.out.println("����: " + sum);
//		System.out.println("���: " + avg);
		
	}

}
