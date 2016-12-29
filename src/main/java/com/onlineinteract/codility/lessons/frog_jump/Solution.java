package com.onlineinteract.codility.lessons.frog_jump;

public class Solution {
	public static int solution(int X, int Y, int D) {
		
		double totalDistance = Y - X;
		int jumps = (int) Math.ceil(totalDistance / D);
		
		return jumps;
	}
	
	public static int solution2(int X, int Y, int D) {
		return (int) Math.ceil((double) (Y - X) / D);
	}
}
