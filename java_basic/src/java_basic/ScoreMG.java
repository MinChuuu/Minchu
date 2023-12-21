package java_basic;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {
		
		final int STUDENT_NUM;  //final: 최초 할당만 가능
		
		Scanner scann = new Scanner(System.in);
		
		
		System.out.print("학생 수:");
		STUDENT_NUM = scann.nextInt();scann.nextLine();

		ScoreVO[] scores = new ScoreVO[STUDENT_NUM];
		
		//입력
		for(int i = 0; i < STUDENT_NUM; i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}
		
		//출력
		
		System.out.print("순번\t");
		ScoreVO.printLabel();
		
		for(int i = 0; i < STUDENT_NUM; i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
	}
	
}	
