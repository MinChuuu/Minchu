package java_basic;

import java.util.Scanner;

public class Quiz_array_1123 {

	public static void main(String[] args) {
		
		
//		�ζ� ���α׷��� �ۼ��Ͻÿ�.
//		����)
//		�ݾ��� �Է�: 3000��
//		34 23 22 21 11 2
//		43 12 11 19 18 7
//		7 2 12 16 4 5
//
//		�ݾ��� �Է�: 3200��
//		3 41 12 21 11 2
//		40 8 20 10 6 7
//		19 15 13 11 8 6
//		�Ž�����: 200��
		
		final int PRICE_PER_LOTTO = 1000;
		int[] Lotto_Num = new int[45];
		int[][] Output_Num;
		
		int Money; //���Աݾ�
		int LottoCnt; //�ζ�Ƚ��
		int ChangeMoney; //�Ž�����
		
		Scanner scann = new Scanner(System.in);
		
		
		//�Է�
		System.out.print("�ݾ��� �Է�: ");
		Money = scann.nextInt();scann.nextLine();
		LottoCnt = Money / PRICE_PER_LOTTO;
		ChangeMoney = Money % PRICE_PER_LOTTO;
	
		Output_Num = new int[LottoCnt][6];
		
		
		//ó��
		for(int i = 0; i < 45; i++) {
			Lotto_Num[i] = i+1;
		}
		
		for(int count = 0; count < LottoCnt; count++) {
		
			int temp = 0;
			for(int i = 0; i<45*100; i++) {
				int tempIndex = (int)(Math.random()*45);
				temp = Lotto_Num[0];
				Lotto_Num[0] = Lotto_Num[tempIndex];
				Lotto_Num[tempIndex] = temp;
			}
			
			for(int i =0; i < 6; i++) {
				Output_Num[count][i] = Lotto_Num[i];
			}
		}
		
		//���
		for(int i = 0; i < Output_Num.length; i++) {
			for(int j = 0; j < Output_Num[i].length; j++) {
				System.out.print(Output_Num[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("�Ž�����: ��"+ ChangeMoney);

		
		
//		System.out.print("�ݾ��� �Է�: ");
//		
//		Scanner scann = new Scanner(System.in);
//		int cost = scann.nextInt();
//		
//		
//		double random = Math.random();
//		
//		int[] num = new int[6];
//		
//		
//		for(int i = 0; i<cost/1000; i++) {
//			for(int j = 0; j < 6; j++) {
//				num[j] = (int)(random*10+1);
//				System.out.print(num[j ] + " ");
//		}
//			System.out.println();
//		
//		}
//		
//		
//		if (cost%1000 != 0) {
//			System.out.println("�Ž�����: " + cost%1000 + "��");
//		}

	}

}
