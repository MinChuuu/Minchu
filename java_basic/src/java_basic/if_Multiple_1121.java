package java_basic;

import java.util.Scanner;

public class if_Multiple_1121 {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
		int Int = 0;
		String result = "";
		
		System.out.println("������ �Է��Ͻÿ�.");
		Int = scann.nextInt();
		
		boolean condition = Int % 2 != 0
							&& Int % 3 != 0
							&& Int % 5 != 0;
		if (condition) {
			result = "2,3,5�� ����� �ƴմϴ�.";
		}
		else {
			if (Int % 2 == 0) {
				result = result + "2";
				if(Int % 3 == 0) {
					result = result + ", 3";
					if(Int % 5 == 0) {
						result = result + ", 5�� ����Դϴ�.";
					}
				}
			}
			else {
				if(Int % 3 == 0) {
					result = result + ", 3";
					if(Int % 5 == 0) {
						result = result + ", 5�� ����Դϴ�.";
					}
				}
				else {
					if(Int % 5 == 0) {
						result = result + "5�� ����Դϴ�.";
					}
				}
			}
		}
		System.out.printf(result);
	}
}