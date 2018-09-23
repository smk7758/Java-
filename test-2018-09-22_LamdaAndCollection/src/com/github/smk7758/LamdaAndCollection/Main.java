package com.github.smk7758.LamdaAndCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		new Main().processer();
	}

	private void processer() {
		Set<String> set = new HashSet<>();
		set.add("Tudsuki");
		set.add("takagi");
		set.add("Yosihara");
		set.add("Sakakibara");
		printSetItemsBy_forEach(set);
	}

	private void printSetItemsByFor(Set<String> set) {
		for (Iterator<String> i = set.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	private void printSetItemsByWhile(Set<String> set) {
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	private void printSetItemsByForEach(Set<String> set) {
		for (String text : set) {
			System.out.println(text);
		}
	}

	private void printSetItemsBy_forEach(Set<String> set) {
		set.forEach(System.out::println);
	}

	private void printSetItemsBy_forEach_1(Set<String> set) {
		set.forEach(System.out::println);
	}
}
