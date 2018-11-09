package com.github.smk7758.LogFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	private final static String folder_path = "C:\\Users\\Student_user\\Desktop\\LogsFolder";
	private static String tmp = "", result = "";

	public static void main(String[] args) {
		System.out.println("Please write anything you want.");

		// コンソールからの入力読み込み
		// どっちかでいい。
		readConsoleByReader();
		readConsoleByScanner();

		System.out.println("FINISH!");

		// 以下ファイル出力
		Path file_path = Paths.get(folder_path, "log_file_" + System.currentTimeMillis() + ".log");
		if (!Files.exists(file_path)) {
			try {
				Files.createFile(file_path);
			} catch (IOException e) {
				System.err.println("Cannot create LogFile!");
				e.printStackTrace();
			}
		}

		try (BufferedWriter bw = Files.newBufferedWriter(file_path)) {
			bw.write(result);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readConsoleByScanner() {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext() && (tmp = sc.nextLine()) != null && !tmp.equals("FIN")) {
				result += tmp + "\r\n";
				System.out.println(tmp);
			}
		}
	}

	public static void readConsoleByReader() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while ((tmp = br.readLine()) != null && !tmp.equals("FIN")) {
				result += tmp + "\r\n";
				System.out.println(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
