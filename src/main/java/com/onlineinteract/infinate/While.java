package com.onlineinteract.infinate;

public class While {

	public static void main(String[] args) {
//		System.out.println("Loop");
		int i = 0;
		while (i++ > -1) {
			System.out.println("Loop");
			if (i == 10) {
				break;
			}
		}
		
		for (int j = 0; j > -1; j++) {
			System.out.println("infinate: " + j);
		}
	}
}
