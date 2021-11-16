package com.loboda.interview.strings;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for {@link }
 */
public class UniqueCharsInStringCheckerTest {
	@Test
	void simpleTest() {
		assertThat(UniqueCharsInStringChecker.isUnique("abcvgre"), is(true));
		assertThat(UniqueCharsInStringChecker.isUnique("aAbBQw"), is(true));
		assertThat(UniqueCharsInStringChecker.isUnique("aBVFEa"), is(false));
	}
}
