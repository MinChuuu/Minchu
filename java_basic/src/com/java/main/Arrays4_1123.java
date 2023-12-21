package com.java.main;

import java.util.Scanner;

public class Arrays4_1123 {

	public static void main(String[] args) {
		
		final int STUDENT_NUM;  //final: 최초 할당만 가능
		final int SUBJECT_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		//변수 선언
		String[] name;
		String[] subject;
		int[][] score;
		int[] total;
		float[] avg;
		
		System.out.print("학생 수:");
		STUDENT_NUM = scann.nextInt();scann.nextLine();
		System.out.print("과목 수:");
		SUBJECT_NUM = scann.nextInt();scann.nextLine();
		
		//변수 초기화
		name = new String[STUDENT_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDENT_NUM][SUBJECT_NUM];
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		
		//과목입력
		for(int i = 0; i < SUBJECT_NUM; i++) {
			System.out.println((i+1) +"/" + SUBJECT_NUM + "번째 과목명");
			subject[i] = scann.nextLine();
			
		}
		
		//점수입력
		for(int i = 0; i < STUDENT_NUM; i++) {
			System.out.print((i+1)+"번째 학생 이름: ");
			name[i] = scann.nextLine();
			
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(subject[j]+": ");
				score[i][j] = scann.nextInt();scann.nextLine();
				
			}
		}
		
		
		//처리
		for(int i = 0; i < STUDENT_NUM; i++) {
			for(int j = 0; j < SUBJECT_NUM; j++) {
				
				total[i] += score[i][j];
			}
			
			avg[i] = (int)((total[i]/(float)SUBJECT_NUM)*100+0.5f)/100f;
		}

		
		//출력
		System.out.print("순번\t이름\t");
		for(int i = 0; i < SUBJECT_NUM; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.print("총점\t평균\n");
		
		
		//학생 정보
		for(int i = 0; i < STUDENT_NUM; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.print(total[i]+"\t" + avg[i] + "\n");
		}
	}
}
