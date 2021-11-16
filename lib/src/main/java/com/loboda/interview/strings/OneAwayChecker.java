package com.loboda.interview.strings;

public class OneAwayChecker {
	public static boolean isOneWay(String str1, String str2) {

		if (str1.length() == str2.length()) {
			return isOneWayForEqualSizeStrings(str1, str2);
		}
		return isOneWayforDiffSizeStrings(str1, str2);
	}

	private static boolean isOneWayforDiffSizeStrings(String str1, String str2) {
		String largerStr = str1.length() > str2.length() ? str1 : str2;
		String smallerStr = str1.length() > str2.length() ? str2 : str1;
		if (largerStr.length() - smallerStr.length() > 1) {
			return false;
		}
		boolean oneCharDeltaUsed = false;
		int smallerStrIndex = 0;
		for (int i = 0; i < largerStr.length(); i++) {
			if (smallerStrIndex >= smallerStr.length() || largerStr.charAt(i) != smallerStr.charAt(smallerStrIndex)) {
				if (oneCharDeltaUsed) {
					return false;
				}
				oneCharDeltaUsed = true;
			} else {
				smallerStrIndex++;
			}
		}
		return true;
	}

	private static boolean isOneWayForEqualSizeStrings(String str1, String str2) {
		boolean oneCharDeltaUsed = false;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (oneCharDeltaUsed) {
					return false;
				}
				oneCharDeltaUsed = true;
			}
		}
		return true;
	}
}
