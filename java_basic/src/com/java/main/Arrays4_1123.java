package com.java.main;

import java.util.Scanner;

public class Arrays4_1123 {

	public static void main(String[] args) {
		
		final int STUDENT_NUM;  //final: ���� �Ҵ縸 ����
		final int SUBJECT_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		//���� ����
		String[] name;
		String[] subject;
		int[][] score;
		int[] total;
		float[] avg;
		
		System.out.print("�л� ��:");
		STUDENT_NUM = scann.nextInt();scann.nextLine();
		System.out.print("���� ��:");
		SUBJECT_NUM = scann.nextInt();scann.nextLine();
		
		//���� �ʱ�ȭ
		name = new String[STUDENT_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDENT_NUM][SUBJECT_NUM];
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		
		//�����Է�
		for(int i = 0; i < SUBJECT_NUM; i++) {
			System.out.println((i+1) +"/" + SUBJECT_NUM + "��° �����");
			subject[i] = scann.nextLine();
			
		}
		
		//�����Է�
		for(int i = 0; i < STUDENT_NUM; i++) {
			System.out.print((i+1)+"��° �л� �̸�: ");
			name[i] = scann.nextLine();
			
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(subject[j]+": ");
				score[i][j] = scann.nextInt();scann.nextLine();
				
			}
		}
		
		
		//ó��
		for(int i = 0; i < STUDENT_NUM; i++) {
			for(int j = 0; j < SUBJECT_NUM; j++) {
				
				total[i] += score[i][j];
			}
			
			avg[i] = (int)((total[i]/(float)SUBJECT_NUM)*100+0.5f)/100f;
		}

		
		//���
		System.out.print("����\t�̸�\t");
		for(int i = 0; i < SUBJECT_NUM; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.print("����\t���\n");
		
		
		//�л� ����
		for(int i = 0; i < STUDENT_NUM; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.print(total[i]+"\t" + avg[i] + "\n");
		}
	}
}
