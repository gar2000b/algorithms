package com.onlineinteract.strings;

public class NeedInAHaystack {

	public static void main(String[] args) {
		int needleInHaystackPosition = getNeedleInAHaystack("azklneedleqbacszg", "needle");
		System.out.println("Needle is at location: " + needleInHaystackPosition);
	}
	
	protected static int getNeedleInAHaystack(String haystack, String needle) {
		
		int mainPos = 0;
		
		for(int i = 0; i < haystack.length(); i++) {
			int hPos = mainPos;
			int nPos = 0;
			
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(hPos) == needle.charAt(nPos)) {
					hPos++;
					nPos++;
				} else {
					break;
				}
			}

			if (nPos == needle.length())
				return mainPos;
			else
				mainPos++;
		}
		
		return -1;
	}
}
