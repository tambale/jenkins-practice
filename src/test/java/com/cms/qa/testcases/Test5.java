package com.cms.qa.testcases;

import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void test5() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Resolver");
			}

			else {
				if (i % 5 == 0) {
					System.out.println("MFive");
				}
				if (i % 3 == 0) {
					System.out.println("MThree");
				}

			}

		}
	}

}