package com.greedy.section02.extend;

public class RabbitFarm<T extends Rabbit> { 		//타입변수 미정!!

	private T animal;
	
	public RabbitFarm() {}
	
	public RabbitFarm(T animal) {
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	
}
