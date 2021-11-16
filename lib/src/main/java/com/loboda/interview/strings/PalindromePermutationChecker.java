package com.loboda.interview.strings;

public class PalindromePermutationChecker {
	public static boolean isPalindrome(String text) {
		final boolean[] charToOdd = new boolean[256];
		for (int i = 0; i < text.length(); i++) {
			final char charOriginal = text.charAt(i);
			if (charOriginal != ' ') {
				final char charIndex = Character.toLowerCase(charOriginal);
				charToOdd[charIndex] = !charToOdd[charIndex];
			}
		}
		boolean oneOddUsed = false;
		for (int i = 0; i < charToOdd.length; i++) {
			if (charToOdd[i]) {
				if (oneOddUsed) {
					return false;
				} else {
					oneOddUsed = true;
				}

			}
		}
		return true;
	}
}
