package de.schmitz.java.codewars.kyu6.tenminutewalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenMinuteWalkTest {

	@Test
	public void alternatingNorthSouthWalkShouldReturnTrue() {
	    assertEquals("Should return true", true, TenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
//	    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
//	    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
//	    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	}

}
