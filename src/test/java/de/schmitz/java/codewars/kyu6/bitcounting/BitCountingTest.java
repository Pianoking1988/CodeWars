package de.schmitz.java.codewars.kyu6.bitcounting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitCountingTest {

	@Test
	public void given4ShouldCount1Bits() {
	    assertEquals(1, BitCounting.countBits(4)); 
	}

	@Test
	public void given7ShouldCount3Bits() {
	    assertEquals(3, BitCounting.countBits(7)); 
	}

	@Test
	public void given9ShouldCount2Bits() {
	    assertEquals(2, BitCounting.countBits(9)); 
	}

	@Test
	public void given10ShouldCount2Bits() {
	    assertEquals(2, BitCounting.countBits(10)); 
	}
	  
	@Test
	public void given1234ShouldCount5Bits() {
	    assertEquals(5, BitCounting.countBits(1234)); 
	}

}
