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
		//list.add(0,5); //0������ 5 ���� �������� �и�
		list.set(0,5); //0������ 5�� ��ü ���� 0������ �ִ� �����ʹ� �����
		list.add(6);
		list.add(4);
//		list.add('a');
//		list.add("a");
//		list.add(false);
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
//		System.out.println("����Ʈ ũ��: " + list.size());
		
		
		//����
		//Collections.sort(list,Collections.reverseOrder());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "������: " + list.get(i));
		}

	}

}
