package com.loboda.interview.strings;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UrlifyMapperTest {
	@Test
	void simpleTest() {
		final char[] text = "Mr John Smith    ".toCharArray();
		UrlifyMapper.encode(text);
		assertThat(String.valueOf(text), is("Mr%20John%20Smith"));
	}
}
