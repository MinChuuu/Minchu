package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(1);
		list.add(2);
		//list.add(0,5); //0번지에 5 들어가고 나머지는 밀림
		list.set(0,5); //0번지를 5로 대체 원래 0번지에 있던 데이터는 사라짐
		list.add(6);
		list.add(4);
//		list.add('a');
//		list.add("a");
//		list.add(false);
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
//		System.out.println("리스트 크기: " + list.size());
		
		
		//정렬
		//Collections.sort(list,Collections.reverseOrder());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "번지값: " + list.get(i));
		}

	}

}
