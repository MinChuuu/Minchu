package com.java.dto;

public class CircleVO {
	
	public int rad;
	
	public CircleVO() {}

	public CircleVO(int rad) {
		this.rad = rad;
	}
	
	public int surface() {
		return (int)(rad * rad * Math.PI);
	}

}
