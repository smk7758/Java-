package com.github.smk7758.StringBuilder;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.add("A").add("B");
		// sb.add("A");
		// sb.add("B");
		System.out.println(sb.getResult());
	}

}
