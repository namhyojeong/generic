package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;
import com.greedy.section02.extend.WildCardFarm;

public class Application2 {

	public static void main(String[] args) {

		WildCardFarm wildCardFarm = new WildCardFarm();
		
//		wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
	
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
	
//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//		wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

	}
}
