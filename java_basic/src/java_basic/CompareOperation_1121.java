package java_basic;

public class CompareOperation_1121 {

	public static void main(String[] args) {
		
		// 컴퓨터는 문자도 코드로 저장
		char c1 = 'A'; //65
		char c2 = 'a'; //97
		
		System.out.println(c1 > c2);
		System.out.println(c1 > 45);
		System.out.println(c2 > 1.5);
		System.out.println((int)c2);
		System.out.println((char)(c1+2));
		
		
		//비교연산자
		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;
		result = (a = 1) > (b = 2) || (c = 3) > 2;
		// &&(and)연산자는 앞이 false면 뒤는 실행 x
		// ||(or)연산자는 앞이 true면 뒤는 실행 x

		System.out.printf("a:%d ", a);
		System.out.printf("b:%d ", b);
		System.out.printf("c:%d ", c);
		System.out.println(result);
		
		
		//할당연산자
		int d = 12;
		int e= 10;
		
		d += 10; // d = d + 10;
		e -= 20;
		
		System.out.println(d);
		System.out.println(e);
		

	}

}
