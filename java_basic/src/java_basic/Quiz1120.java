package java_basic;

import java.util.Scanner;

public class Quiz1120 {

	public static void main(String[] args) {
		
//		4자리 정수를 입력받아 각 자리수를 출력하는 프로그램 작성
		Scanner scann = new Scanner(System.in);
		
		int i=0;
		int fourth = 0;
		int third = 0;
		int second = 0;
		int first = 0;
		
		System.out.print("4자리 정수를 입력하세요: ");
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
		
		System.out.println("입력한 정수: " + i);
		System.out.println("4자리 숫자: " + fourth);
		System.out.println("3자리 숫자: "+ third);
		System.out.println("2자리 숫자: " + second);
		System.out.println("1자리 숫자: " + first);
		

	}

}
