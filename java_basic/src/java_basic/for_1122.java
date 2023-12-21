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
		
		
		
		

//		//구구단
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
		
		
		
		
//		// 임의의 숫자를 입력받아 소수인지 확인하는 프로그램을 작성하시오.
//
//		int i = 0;
//		boolean isPrime = true;
//
//		Scanner scann = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
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
//			System.out.println("소수입니다.");
//		}
//		else {
//			System.out.println("소수가 아닙니다.");
//		}
		
		
		
		//입력한 정수만큼 '*'를 찍는 프로그램을 작성하시오.
		
		String result = "";
		System.out.println("정수를 입력하세요.");
		Scanner scann = new Scanner(System.in);
		int num = scann.nextInt();
		for(int i = 0; i < num; i++) {
			result += "*";
		}
		System.out.println(result);
		
		
	}

}
