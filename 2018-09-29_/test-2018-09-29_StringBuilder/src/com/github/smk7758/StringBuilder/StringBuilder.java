package com.github.smk7758.StringBuilder;

public class StringBuilder {
	private String result = null;

	public StringBuilder() {
		result = "";
	}

	public StringBuilder add(String text) {
		result += text;
		return this;
	}

	public String getResult() {
		return result;
	}
}
