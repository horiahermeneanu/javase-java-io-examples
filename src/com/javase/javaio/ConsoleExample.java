package com.javase.javaio;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console cnsl = null;
		String name = null;
		try {
			cnsl = System.console();
			if (cnsl != null) {
				name = cnsl.readLine("Name: ");
				System.out.println("Name entered : " + name);
			} else {
				System.err.println("No console found!");
			}
		} catch (Exception ex) {
			System.err.println("No console found!");
		}
	}
}
