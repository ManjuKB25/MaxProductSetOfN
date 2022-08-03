package com.company.math.calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestForMaxProduct {

	@Test
	void testNegativeN() {
		assertEquals(0, MaxProductSetOfN.getMaxProdutNumbersOfN(-100));
	}
	@Test
	void testZeroForN() {
		assertEquals(0, MaxProductSetOfN.getMaxProdutNumbersOfN(0));
	}
	@Test
	void testNegative3ForN() {
		assertEquals(0, MaxProductSetOfN.getMaxProdutNumbersOfN(-3));
	}
	@Test
	void testNegative2ForN() {
		assertEquals(0, MaxProductSetOfN.getMaxProdutNumbersOfN(-2));
	}
	@Test
	void testNegative1ForN() {
		assertEquals(0, MaxProductSetOfN.getMaxProdutNumbersOfN(-1));
	}
	@Test
	void testPositive1ForN() {
		assertEquals(0, MaxProductSetOfN.getMaxProdutNumbersOfN(1));
	}
	@Test
	void testPositive2ForN() {
		assertEquals(1, MaxProductSetOfN.getMaxProdutNumbersOfN(2));
	}
	@Test
	void testPositive3ForN() {
		assertEquals(2, MaxProductSetOfN.getMaxProdutNumbersOfN(3));
	}
	@Test
	void testPositive4ForN() {
		assertEquals(4, MaxProductSetOfN.getMaxProdutNumbersOfN(4));
	}
	@Test
	void testPositive5ForN() {
		assertEquals(6, MaxProductSetOfN.getMaxProdutNumbersOfN(5));
	}
	@Test
	void testPositive6ForN() {
		assertEquals(9, MaxProductSetOfN.getMaxProdutNumbersOfN(6));
	}
	@Test
	void testPositive8ForN() {
		assertEquals(18, MaxProductSetOfN.getMaxProdutNumbersOfN(8));
	}
	@Test
	void testPositive45ForN() {
		assertEquals(14348907l, MaxProductSetOfN.getMaxProdutNumbersOfN(45));
	}
	@Test
	void testPositive105ForN() {
		assertEquals(50031545098999707l, MaxProductSetOfN.getMaxProdutNumbersOfN(105));
	}

}
