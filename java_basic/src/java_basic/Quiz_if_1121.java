package java_basic;

import java.util.Scanner;

public class Quiz_if_1121 {

	public static void main(String[] args) {
		// 가위 바위 보 프로그램 작성
//		당신의 선택은? 1.가위 2.바위 3.보
//		선택: 2
//		컴퓨터: 가위
//		당신: 바위
//		이겼습니다.
		
		
		double rand = Math.random();
		
		String com_rcp = ""; //가위0 바위1 보2
		int com_num = (int)rand * 3;
		String my_rcp = "";
		int my_num = 0;
		String judge = "";
		
		
		System.out.println("당신의 선택은? \n0.가위 1.바위 2.보");
		Scanner scann = new Scanner(System.in);
		my_num = scann.nextInt();
		
		if(com_num == (my_num+1)%3) { //진 경우
			judge = "졌습니다.";
		}
		
		else {
			if(com_num == my_num) { //비긴 경우
				judge = "비겼습니다.";
			}
			else { //이긴 경우
				judge = "이겼습니다.";
			}
		}
		
		switch (my_num){
		case 0: my_rcp = "가위"; break;
		case 1: my_rcp = "바위"; break;
		case 2: my_rcp = "보";
		}
		
		switch (com_num){
		case 0: com_rcp = "가위";break;
		case 1: com_rcp = "바위"; break;
		case 2: com_rcp = "보";
		}
			
//		if (my_num ==0) {
//			my_rcp = "가위";
//		}
//		else if (my_num == 1) {
//			my_rcp = "바위";
//		}
//		else if (my_num ==2) {
//			my_rcp = "보";
//			}
		
//		if (com_num ==0) {
//			com_rcp = "가위";
//		}
//		else if (com_num == 1) {
//			com_rcp = "바위";
//		}
//		else if (com_num ==2) {
//			com_rcp = "보";
//			}
		
		System.out.println("컴퓨터: " + com_rcp);
		System.out.println("당신: " + my_rcp);
		System.out.println(judge);
		

	}

}
