package com.loboda.interview.strings;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class PalindromePermutationCheckerTest {
	@Test
	public void simpleTest() {
		assertThat(PalindromePermutationChecker.isPalindrome("qwertyqwert"), Matchers.is(true));
		assertThat(PalindromePermutationChecker.isPalindrome("Tact Coa"), Matchers.is(true));
		assertThat(PalindromePermutationChecker.isPalindrome("TactCoa"), Matchers.is(true));
		assertThat(PalindromePermutationChecker.isPalindrome("Tact Coar"), Matchers.is(false));
	}
}
