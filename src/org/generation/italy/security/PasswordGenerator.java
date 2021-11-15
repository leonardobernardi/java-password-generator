package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		String name = "Leonardo";
		String surname = "Bernardi";
		String favColor = "black";
		String m = "-";
		int bDay = 4;
		int bMonth = 2;
		int bYear = 1998;
		int bDate = (bDay + bMonth + bYear);
		
		System.out.println(name + m + surname + m + favColor + m + bDate);

	}

}
