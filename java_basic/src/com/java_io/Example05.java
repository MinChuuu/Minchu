package com.java_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example05 {

	public static void main(String[] args) {
		
		
			File file = new File("gugudan.txt");
			if (!file.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				return;
			}
			
			try {
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str=null;
			
			while ((str = br.readLine()) != null)
			{
				System.out.print(str+"\n");
			}
			fis.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
