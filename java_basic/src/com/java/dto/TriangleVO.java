package com.java.dto;

public class TriangleVO {
		
		public int height=10;
		public int baseLine=100;
		
		{
			int i = (int)(Math.random()*11);
			if(i%2==0) {
				height = baseLine = 0;
			}
			else {
				height = baseLine =1;
			}
		}
		
		public TriangleVO() {
			
		}

		public TriangleVO(int height, int baseLine) {
			this.height = height;
			this.baseLine = baseLine;
		}

		public int surface() {
			return (int)(height*baseLine*0.5f);
		}
	}