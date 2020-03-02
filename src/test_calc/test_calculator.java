package test_calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src_calc.Calculator;

class test_calculator {


	@Test
	void test() {
		assertEquals(11, Calculator.add(7,4));
	}

	@Test
	void test2() {
		assertEquals(3, Calculator.sub(7,4));
	}

}
