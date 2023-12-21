package com.java.main;

import com.java.dto.Card;

public class CardMain {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		
		c1.length = 9;
		c1.width = 5;
		
		
		c2.length = 12;
		c2.width = 8;
		
		Card.width = 100;
		Card.length = 200;
		
		System.out.println("c1 카드 너비: " + c1.width);
		System.out.println("c1 카드 길이: " + c1.length);
		
		System.out.println("c2 카드 너비: " + c2.width);
		System.out.println("c2 카드 길이: " + c2.length);
		
		System.out.println("c3 카드 너비: " + c3.width);
		System.out.println("c3 카드 길이: " + c3.length);
		
		System.out.println("Card 카드 너비: " + Card.width);
		System.out.println("Card 카드 길이: " + Card.length);
		

	}

}
