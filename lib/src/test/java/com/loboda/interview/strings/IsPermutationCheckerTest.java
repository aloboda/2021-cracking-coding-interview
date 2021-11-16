package com.loboda.interview.strings;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class IsPermutationCheckerTest {
	@Test
	public void simpleTest() {
	    assertThat(IsPermutationChecker.isPermutation("qwerty", "wertqy"), Matchers.is(true));
	    assertThat(IsPermutationChecker.isPermutation("qwertyqwerty", "qwertywertqy"), Matchers.is(true));
	    assertThat(IsPermutationChecker.isPermutation("qwertyy", "wertqy"), Matchers.is(false));
	    assertThat(IsPermutationChecker.isPermutation("qwertyy", "wertqyyy"), Matchers.is(false));
	}
}
