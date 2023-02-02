package com.greedy.section01.generic;

import java.awt.GraphicsEnvironment;

public class Application {

	public static void main(String[] args) {

		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		gt1.setValue(1);
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		/* JDK 1.7부터 타입 선언 시 타입변수가 작성되면 타입 추론이 가능하기 때문에 
		 * 생성자 호출 구문 쪽의 타입을 생략하고 사용할 수 있게 되었다.
		 * 딘, 타입에 명시되지않은 빈 다이아몬드 연산자는 사용해야 한다.*/
		GenericTest<String> gt2 = new GenericTest<>();
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
		
	
	}

}
