package cn.waka;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class TestString{
	
	@Test
	public void testJoiner(){
		String str1 = Joiner.on(";").skipNulls().join(Arrays.asList("a","b",null,"c"));
		assertEquals(str1, "a;b;c");
		
		String str2 = Joiner.on(",").join(Arrays.asList(1,2,7));
		assertEquals(str2,"1,2,7");
	}
	
	@Test
	public void testSplitter(){
		Iterable<String> token = Splitter.on(";").split("one;two;three");
		
	}
}