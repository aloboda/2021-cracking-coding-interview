package com.loboda.interview.strings;

class UniqueCharsInStringChecker {

	public static boolean isUnique(final String text) {
		final boolean[] charIndexToTaken = new boolean[256];
		for (int i = 0; i < text.length(); i++) {
			final int index = text.charAt(i);
			if (charIndexToTaken[index]) {
				return false;
			}
			charIndexToTaken[index] = true;
		}
		return true;
	}
}
