package io.sl.ex.linesmismatch;

import java.util.ArrayList;
import java.util.List;

public class SourceAndBinaryMismatchesInStartLine {
	/*
	 * The method demonstrates different start method line in source and binary
	 */
	public void loop_with_mismatch() {
		for (;;) {
			int ctr = 0;
			Integer number = new Integer(ctr++);
			System.out.println(number);
		}
	}

	public void loop_with_same_lines() {
		for (int ctr = 0; ; ctr++) {
			Integer number = new Integer(ctr);
			System.out.println(number);
		}
	}

	public void methodWithTryAndCatch() {
		Integer number;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String before() {
		for (;;) {
			int ctr = 0;
			Integer number = new Integer(ctr++);
			if (number > 3) break;
		}
		return "a single "
		+ "line in binary";
	}

	// Here is documentation
	public void after() {
		@SuppressWarnings("unused")
		List<String> list;
		try {
			list = new ArrayList<>();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}

	public void methodWithStringListBefore() {
		List<Integer> list;

		try {
			list = new ArrayList<>();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("All is good");

	}
}
