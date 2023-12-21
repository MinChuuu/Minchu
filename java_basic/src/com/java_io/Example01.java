package com.java_io;

import java.io.File;
import java.io.IOException;

public class Example01{

	public static void main(String[] args) {
		File filePath = new File("c:\\temp\\java\\file");
		File fileObj = new File("c:\\temp\\java\\file","example01.txt");
		try {
			filePath.mkdirs();
			boolean success = fileObj.createNewFile();
			
			if(success) {
				System.out.println("���� ���� ����");
			}
			else {
				System.out.println("���� ���� ����");
			}
			
			if(fileObj.exists()) {
				System.out.println(fileObj.getPath());
				System.out.println(fileObj.getName());
				System.out.println(fileObj.getAbsolutePath());
				System.out.println(fileObj.canRead());
				System.out.println(fileObj.canWrite());
				System.out.println(fileObj.length());
				System.out.println(filePath.list());
			}
			
			//fileObj.delete();
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
