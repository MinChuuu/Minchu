package com.java.dto;

import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO>{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int scien;
	
	
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getScien() {
		return scien;
	}

	public int total() {
		return kor + eng + math + scien;
	}
	
	public float avg() {
		return ((int)(total()/4f*100+0.5))/100f;
	}
	
	public void input() { //변수타입 생략
		Scanner scann = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = scann.nextLine();
		
		System.out.print("국어: ");
		kor = scann.nextInt();scann.nextLine();
		
		System.out.print("영어: ");
		eng = scann.nextInt();scann.nextLine();
		
		System.out.print("수학: ");
		math = scann.nextInt();scann.nextLine();
		
		System.out.print("과학: ");
		scien = scann.nextInt();scann.nextLine();
	}
	
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}
	public void printScore() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t"
							+ scien + "\t" + total() + "\t" + avg());
	}

	@Override
	public int compareTo(ScoreVO other) {
				
		return this.name.compareTo(other.getName());
	}
	
}