package com.loboda.interview.strings;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class OneWayCheckerTest {
	@Test
	public void simpleTest() {
		assertThat(OneAwayChecker.isOneWay("pale", "ple"), Matchers.is(true));
		assertThat(OneAwayChecker.isOneWay("pales", "pale"), Matchers.is(true));
		assertThat(OneAwayChecker.isOneWay("pale", "pales"), Matchers.is(true));
		assertThat(OneAwayChecker.isOneWay("pale", "bale"), Matchers.is(true));
		assertThat(OneAwayChecker.isOneWay("pale", "bake"), Matchers.is(false));
		assertThat(OneAwayChecker.isOneWay("bakeee", "bake"), Matchers.is(false));
	}

}
