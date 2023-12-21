package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.ifc.Inputable;

public class SurfaceSolution {
	
	
	private Shape s;
	private int menu;
	
	public void start() {
		do {
			input();
			process();
			output();
		}while(true);
	}

	
	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("1.�ﰢ�� 2.�簢�� 3.��");
		System.out.println("������ �����Ͻÿ�.");
		menu = scann.nextInt();scann.nextLine();
		
		Inputable inputObject = null;
		
		switch(menu) {
		case 1: //�ﰢ��
			inputObject = new TriangleVO();
			break;
			
		case 2: //�簢��
			inputObject = new RectangularVO();
			break;
			
		case 3: //��
			inputObject = new CircleVO();
			break;
			
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
		}
		
		s.inputDate();
	}
	
	protected void process() {
		
		switch(menu) {
		case 1:
		case 2:
		case 3:
				break;
		default:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); //�������� (����õ)
		}	
	}
	
	protected void output() {
		System.out.println(s.outputMessage()+s.surface());
		
		System.out.println("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� �����ÿ�.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}

}
