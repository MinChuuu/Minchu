package java_basic;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
//		실수를 입력받아 소수 둘째자리에서 반올림
		
		Scanner scann = new Scanner(System.in);
		
		float input = 0;
		float output = 0;
		
		System.out.print("실수를 입력하세요: ");
		input = scann.nextFloat();

		
		output = (int)((input*100+5)/10)/10f;
		// 123461 => 123461/10 => 12346 => 1234.6
		
		System.out.println("입력값: "+ input);
		System.out.println("출력값: "+ output);
		System.out.println();
		
		/* 국어, 영어, 수학, 과학 점수를 입력 받아 총점과 평균을 출력하시오.
		단, 평균은 소수점 둘째자리에서 반올림하시오. */
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		
		int sum = 0;
		float avg = 0f;
		
		System.out.print("국어 점수를 입력하세요: ");
		kor = scann.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = scann.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = scann.nextInt();
		System.out.print("과학 점수를 입력하세요: ");
		sci = scann.nextInt();
		
		sum = kor + eng + math + sci; //313
		avg = (int)((sum/4f*100+5)/10)/10f; //78.30
		//float avg = (kor + eng + math + sci)/4f;
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\n", kor, eng, math, sci, sum, avg);
		
//		System.out.println("총점: " + sum);
//		System.out.println("평균: " + avg);
		
	}

}
