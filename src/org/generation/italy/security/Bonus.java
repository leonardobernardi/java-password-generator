package org.generation.italy.security;

import java.lang.Math;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Leonardo";
		String surname = "Bernardi";
		String favColor = "black";
		String m = "-";
		int bDay = 4;
		int bMonth = 2;
		int bYear = 1998;
		int bDate = (bDay + bMonth + bYear);
		int min = 11;
		int max = 99;
		
		//mi sembrava leggermente piu sicuro cosi :)
		System.out.println(name + m + surname + m + favColor + m + bDate + m + (int)(Math.random()*(max-min+1)+min));
	}

}
