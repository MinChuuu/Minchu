package java_basic;

public class Arrays_1123 {

	public static void main(String[] args) {
		
		int[] a = new int[10];  //[] type 바로 뒤에 붙이는 습관
		// int a[];도 됨
		
		System.out.println(a[4]);
		
		a[4] = 100;
		
		System.out.println(a[4]);
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		
		System.out.println(a[8]);
		

	}

}
