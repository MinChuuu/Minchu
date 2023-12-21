package com.java_io;

import java.io.File;
import java.io.FileWriter;

public class Gugudan {

	public static void main(String[] args) {
		int dan = 2;
		int i = 9;
		
		String resultStr = "";
		
		for(dan=2; dan<10; dan++) {
			resultStr += dan +"단\n";
			for(i=1; i<10; i++) {
				resultStr += dan + " * " + i + " = " + dan*i + "\n";
			}
			resultStr+="\n";
		}
		System.out.println(resultStr);
		
		try {
			File file = new File("gugudan.txt");
			if(!file.exists()) file.createNewFile();
			
			FileWriter myWriter = new FileWriter(file);
			
			myWriter.write(resultStr);
			myWriter.close();
			
			System.out.println("구구단 파일쓰기 성공.");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("구구단 파일쓰기 실패.");
		}
	}
}
