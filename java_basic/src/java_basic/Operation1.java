package java_basic;

import java.util.Scanner;

public class Operation1 {

	public static void main(String[] args) {
		
//		int a = 3;
//		int b = 5;
//		
//		System.out.println("더하기: " + (a+b));
//		System.out.println("빼기: "+ (a-b));
//		System.out.println("곱하기: "+ (a*b));
//		System.out.println("나누기: "+ (a/(float)b));
//		
//		System.out.println("몫: "+ (a/b));
//		System.out.println("나머지: "+ (a%b));
		
		Scanner scann = new Scanner(System.in);
		
		
		int firstInt = 0;
		int secondInt = 0;
		
		System.out.print("정수 두 개를 입력하세요: ");
		firstInt = scann.nextInt();
		secondInt = scann.nextInt();
		
		float sum = firstInt + secondInt;
		float minus = firstInt-secondInt;
		float multi = firstInt * secondInt;
		float div = firstInt / (float)secondInt;
		
		int quo = firstInt / secondInt;
		int rest = firstInt % secondInt;
		
		System.out.println("첫번째 정수: " + firstInt);
		System.out.println("두번째 정수: " + secondInt);
		System.out.println("더하기: " + sum);
		System.out.println("빼기: " + minus);
		System.out.println("곱하기: " + multi);
		System.out.println("나누기: " + div);
		System.out.println("몫: " + quo);
		System.out.println("나머지: " + rest);
		
	}

}
