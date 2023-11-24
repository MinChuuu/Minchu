package java_basic;

import java.util.Scanner;

public class Homework1120 {

	public static void main(String[] args) {
		
//		4자리 정수를 입력받아 각 자리수를 출력하는 프로그램 작성
		Scanner scann = new Scanner(System.in);
		
		int i=0;
		
		System.out.print("4자리 정수를 입력하세요: ");
		i = scann.nextInt();
		
		System.out.println("입력한 정수: " + i);
		System.out.println("4자리 숫자: " + i/1000);
		System.out.println("3자리 숫자: "+ (i/100)%10);
		System.out.println("2자리 숫자: " + (i/10)%10);
		System.out.println("1자리 숫자: " + i%10);
		

	}

}
