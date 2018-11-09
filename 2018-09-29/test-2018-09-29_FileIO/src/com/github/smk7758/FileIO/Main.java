package com.github.smk7758.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.stream().filter(text -> text.length() > 3).forEach(System.out::println);
	}

	public String readConsoleByScanner() {
		String result = "", text = "";
		try (final Scanner sc = new Scanner(System.in)) {
			while ((text = sc.nextLine()) != null) {
				result += text;
			}
		}
		return result;
	}
}
