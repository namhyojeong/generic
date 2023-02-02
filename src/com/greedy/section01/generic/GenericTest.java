package com.greedy.section01.generic;

/* 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
 * 다이아몬드 연산자 내부에 작성한 T는 타입변수 라고 부른다.
 * 여러 개 사용 시 ,를 이용해 여러 개 기술할수도있다.
 * 사용하는 쪽에서 제네릭 클래스를 이용할 시 타입변수 자리에 맞춰서 타입을 넣어주게 되면
 * 컴파일 시점에 타입이 결정되게 된다. *?
 */
public class GenericTest<T> {	//아직 뭐가 들어올지 모름
	
	/* 현재 해당 필드에는 타입이 결정되지 않은 상태이다. */ 
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
}
