package com.nexttech.or;

import java.util.ArrayList;
import java.util.Arrays;

public class Npractic {
	public static void main(String[] args) {
		
		String [] flowers = {"Lili","Sunflower", "Rose", "Joba"};
	
		System.out.println(flowers[0]);
		flowers [0] = "dalia"; //change
		System.out.println(flowers[0]);
		System.out.println(Arrays.toString(flowers));
		System.out.println(flowers.length); 
		ArrayList<String> car = new ArrayList<String>();
		car.add("BMW");
		car.add("honda");
		car.add("GMC");
		car.add("nassan");
		car.get(1);
        System.out.println(car.get(1)); 
        car.set(1, "toyota"); //change
        System.out.println(car);
        car.remove(2);
        System.out.println(car);
        car.size();
        System.out.println(car.size());
	}
	
	
	

	}
