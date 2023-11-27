package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.TriangleVO;

public class PolyMain {
	
	private TriangleVO triangle;
	private RectangularVO rectangular;
	private CircleVO circle;
	private int menu;

	public static void main(String[] args) {
		PolyMain main = new PolyMain();
		
		do {
			main.input();
		
			main.process();
		
			main.output();
		} while(true);
		
	}
	
	private void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("1.�ﰢ�� 2.�簢�� 3.��");
		System.out.println("������ �����Ͻÿ�.");
		menu = scann.nextInt();scann.nextLine();
		
		switch(menu) {
		case 1: //�ﰢ��
			triangle = new TriangleVO();
			System.out.print("�غ�: ");
			triangle.baseLine = scann.nextInt();scann.hasNextLine();
			System.out.print("����: ");
			triangle.height = scann.nextInt();scann.nextLine();
			
			break;
		case 2: //�簢��
			rectangular = new RectangularVO();
			System.out.print("����: ");
			rectangular.garo = scann.nextInt();scann.nextLine();
			System.out.print("����: ");
			rectangular.sero = scann.nextInt();scann.nextLine();
			
			break;
		case 3: //��
			circle = new CircleVO();
			System.out.print("������: ");
			circle.rad = scann.nextInt();scann.nextLine();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	private void process() {
		
		switch(menu) {
		case 1: break;
		case 2: break;
		case 3: break;
		default: System.out.println("���α׷��� �����մϴ�.");
		System.exit(0); //�������� (����õ)
		}	
	}
	
	private void output() {
		switch(menu) {
		case 1: System.out.println("�ﰢ���� ����: "+ triangle.surface());
			break;
		case 2: System.out.println("�簢���� ����: " + rectangular.surface());
			break;
		case 3: 
			System.out.println("�� ����: " + circle.surface());
			break;
		}
		
		System.out.println("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� �����ÿ�.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
	

}
