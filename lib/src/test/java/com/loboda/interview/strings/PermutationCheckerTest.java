package com.loboda.interview.strings;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class PermutationCheckerTest {
	@Test
	public void simpleTest() {
	    assertThat(PermutationChecker.isPermutation("qwerty", "wertqy"), Matchers.is(true));
	    assertThat(PermutationChecker.isPermutation("qwertyqwerty", "qwertywertqy"), Matchers.is(true));
	    assertThat(PermutationChecker.isPermutation("qwertyy", "wertqy"), Matchers.is(false));
	    assertThat(PermutationChecker.isPermutation("qwertyy", "wertqyyy"), Matchers.is(false));
	}
}
