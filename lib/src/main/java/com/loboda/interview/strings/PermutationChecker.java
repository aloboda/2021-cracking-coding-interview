package com.loboda.interview.strings;

public class PermutationChecker {
	public static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()){
			return false;
		}
		final int [] charToCount = new int[256];
		for (int i = 0; i< str1.length(); i++){
			final int index = str1.charAt(i);
			charToCount[index] = charToCount[index] + 1;
		}
		for (int i = 0; i< str2.length(); i++){
			final int index = str2.charAt(i);
			charToCount[index] = charToCount[index] - 1;
			if (charToCount[index] < 0){
				return false;
			}
		}
		for (int i = 0; i<charToCount.length; i++){
			if (charToCount[i] != 0){
				return false;
			}
		}
return true;
	}
}
