package PermutationString;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestPermutationString {

	@Test
	public void test() {
		StringPermutation str=new StringPermutation();
		String[] supply = {"ABC", "ACB", "BAC","BCA","CAB","CBA"};
		String[] stringArray = str.getPermutation("ABC").toArray(new String[0]);
		assertArrayEquals(supply,stringArray );
		
	}

}
