package java_basic;

import java.util.Scanner;

public class Quiz_if_1121 {

	public static void main(String[] args) {
		// ���� ���� �� ���α׷� �ۼ�
//		����� ������? 1.���� 2.���� 3.��
//		����: 2
//		��ǻ��: ����
//		���: ����
//		�̰���ϴ�.
		
		
		double rand = Math.random();
		
		String com_rcp = ""; //����0 ����1 ��2
		int com_num = (int)rand * 3;
		String my_rcp = "";
		int my_num = 0;
		String judge = "";
		
		
		System.out.println("����� ������? \n0.���� 1.���� 2.��");
		Scanner scann = new Scanner(System.in);
		my_num = scann.nextInt();
		
		if(com_num == (my_num+1)%3) { //�� ���
			judge = "�����ϴ�.";
		}
		
		else {
			if(com_num == my_num) { //��� ���
				judge = "�����ϴ�.";
			}
			else { //�̱� ���
				judge = "�̰���ϴ�.";
			}
		}
		
		switch (my_num){
		case 0: my_rcp = "����"; break;
		case 1: my_rcp = "����"; break;
		case 2: my_rcp = "��";
		}
		
		switch (com_num){
		case 0: com_rcp = "����";break;
		case 1: com_rcp = "����"; break;
		case 2: com_rcp = "��";
		}
			
//		if (my_num ==0) {
//			my_rcp = "����";
//		}
//		else if (my_num == 1) {
//			my_rcp = "����";
//		}
//		else if (my_num ==2) {
//			my_rcp = "��";
//			}
		
//		if (com_num ==0) {
//			com_rcp = "����";
//		}
//		else if (com_num == 1) {
//			com_rcp = "����";
//		}
//		else if (com_num ==2) {
//			com_rcp = "��";
//			}
		
		System.out.println("��ǻ��: " + com_rcp);
		System.out.println("���: " + my_rcp);
		System.out.println(judge);
		

	}

}
