package java_basic;

public class switch_1122 {

	public static void main(String[] args) {
		int input = 986;
		
		switch(input % 7) {
		case 0:case 1: System.out.println("나머지가 0 또는 1입니다."); break;
		case 2:case 3: System.out.println("나머지가 2 또는 3입니다."); break;
		case 4:case 5: System.out.println("나머지가 4 또는 5입니다."); break;
		default: System.out.println("나머지가 6입니다."); break;
		}

	}

}
