package com.onlineinteract.codility;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Codility");
	}
	
	public int solution(int A[], int N) {
		
		for (int i = 0; i < N; i++) {
			if(A[i] > 0) {

				int sumLower = 0, sumHigher = 0;
				for(int j = 0; j < i; j++) {
					sumLower += A[j];
				}
				
				for(int k = N; k > i; k--  ) {
					sumHigher += A[k];
				}
				
				if(sumLower == sumHigher) {
					return i;
				}
			}
		}
		
		return -1;
	}
}
