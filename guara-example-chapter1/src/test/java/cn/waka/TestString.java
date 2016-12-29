package cn.waka;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.google.common.base.Joiner;

public class TestString{
	
	@Test
	public void testJoiner(){
		String str1 = Joiner.on(";").skipNulls().join(Arrays.asList("a","b",null,"c"));
		assertEquals(str1, "a;b;c");
	}
}