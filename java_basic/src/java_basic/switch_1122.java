package java_basic;

public class switch_1122 {

	public static void main(String[] args) {
		int input = 986;
		
		switch(input % 7) {
		case 0:case 1: System.out.println("�������� 0 �Ǵ� 1�Դϴ�."); break;
		case 2:case 3: System.out.println("�������� 2 �Ǵ� 3�Դϴ�."); break;
		case 4:case 5: System.out.println("�������� 4 �Ǵ� 5�Դϴ�."); break;
		default: System.out.println("�������� 6�Դϴ�."); break;
		}

	}

}
