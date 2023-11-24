package java_basic;

import java.util.Scanner;

public class Quiz_array_1123 {

	public static void main(String[] args) {
		
		
//		로또 프로그램을 작성하시오.
//		실행)
//		금액을 입력: 3000원
//		34 23 22 21 11 2
//		43 12 11 19 18 7
//		7 2 12 16 4 5
//
//		금액을 입력: 3200원
//		3 41 12 21 11 2
//		40 8 20 10 6 7
//		19 15 13 11 8 6
//		거스름돈: 200원
		
		final int PRICE_PER_LOTTO = 1000;
		int[] Lotto_Num = new int[45];
		int[][] Output_Num;
		
		int Money; //투입금액
		int LottoCnt; //로또횟수
		int ChangeMoney; //거스름돈
		
		Scanner scann = new Scanner(System.in);
		
		
		//입력
		System.out.print("금액을 입력: ");
		Money = scann.nextInt();scann.nextLine();
		LottoCnt = Money / PRICE_PER_LOTTO;
		ChangeMoney = Money % PRICE_PER_LOTTO;
	
		Output_Num = new int[LottoCnt][6];
		
		
		//처리
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
		
		//출력
		for(int i = 0; i < Output_Num.length; i++) {
			for(int j = 0; j < Output_Num[i].length; j++) {
				System.out.print(Output_Num[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("거스름돈: ￦"+ ChangeMoney);

		
		
//		System.out.print("금액을 입력: ");
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
//			System.out.println("거스름돈: " + cost%1000 + "원");
//		}

	}

}
