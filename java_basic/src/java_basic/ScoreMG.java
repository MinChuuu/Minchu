package java_basic;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {
		
		final int STUDENT_NUM;  //final: ���� �Ҵ縸 ����
		
		Scanner scann = new Scanner(System.in);
		
		
		System.out.print("�л� ��:");
		STUDENT_NUM = scann.nextInt();scann.nextLine();

		ScoreVO[] scores = new ScoreVO[STUDENT_NUM];
		
		//�Է�
		for(int i = 0; i < STUDENT_NUM; i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}
		
		//���
		
		System.out.print("����\t");
		ScoreVO.printLabel();
		
		for(int i = 0; i < STUDENT_NUM; i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
	}
	
}	
