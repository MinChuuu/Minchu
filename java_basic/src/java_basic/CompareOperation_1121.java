package java_basic;

public class CompareOperation_1121 {

	public static void main(String[] args) {
		
		// ��ǻ�ʹ� ���ڵ� �ڵ�� ����
		char c1 = 'A'; //65
		char c2 = 'a'; //97
		
		System.out.println(c1 > c2);
		System.out.println(c1 > 45);
		System.out.println(c2 > 1.5);
		System.out.println((int)c2);
		System.out.println((char)(c1+2));
		
		
		//�񱳿�����
		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;
		result = (a = 1) > (b = 2) || (c = 3) > 2;
		// &&(and)�����ڴ� ���� false�� �ڴ� ���� x
		// ||(or)�����ڴ� ���� true�� �ڴ� ���� x

		System.out.printf("a:%d ", a);
		System.out.printf("b:%d ", b);
		System.out.printf("c:%d ", c);
		System.out.println(result);
		
		
		//�Ҵ翬����
		int d = 12;
		int e= 10;
		
		d += 10; // d = d + 10;
		e -= 20;
		
		System.out.println(d);
		System.out.println(e);
		

	}

}
