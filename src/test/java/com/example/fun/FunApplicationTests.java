package com.example.fun;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FunApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void fizzReturnsFizzWhenPassedNumDivThree() {
		assert FizzbuzzService.fizz(3) == "fizz";
	}

	void fizzReturnsBuzzWhenPassedNumDivFive() {
		assert FizzbuzzService.fizz(5) == "buzz";
	}
	void fizzReturnsFizzBuzzWhenPassedNumDivFifteen() {
		assert FizzbuzzService.fizz(15) == "fizzbuzz";
	}
	void fizzReturnsNumWhenPassedOtherNumbers() {
		assert FizzbuzzService.fizz(2) == "2";
	}

}
