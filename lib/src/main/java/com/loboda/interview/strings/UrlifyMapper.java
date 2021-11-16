package com.loboda.interview.strings;

public class UrlifyMapper {
	public static void encode(char[] text) {
		boolean trailingSpaces = true;
		int resultIndex = text.length - 1;
		for (int i = text.length - 1; i >= 0; i--) {
			if (text[i] == ' ') {
				if (!trailingSpaces) {
					text[resultIndex] = '0';
					text[resultIndex - 1] = '2';
					text[resultIndex - 2] = '%';
					resultIndex -= 3;
				}
			} else {
				if (trailingSpaces) {
					trailingSpaces = false;
				}
				text[resultIndex] = text[i];
				resultIndex--;
			}
		}
	}
}
