package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class CircleVO extends Shape
						implements Inputable, Outputable{
	
	private int rad;
	
	public CircleVO() {}

	public CircleVO(int rad) {
		this.rad = rad;
	}
	
	@Override
	public int surface() {
		return (int)(rad * rad * Math.PI);
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}
	
	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		this.rad = scann.nextInt();
		scann.nextLine();
	}
	
	@Override
	public String output() {
		return "원 넓이";
	}

}
