package com.javase.javaio;

import java.io.FileOutputStream;
import java.io.IOException;

import com.javase.FilesConstants;

public class FileOutputStreamExample {

	public static void main(String args[]) {

		try (FileOutputStream fout = new FileOutputStream(FilesConstants.FILE_OUTPUT_STREAM_NAME);) {
			String stringVar = "Java is awesome!";
			fout.write(stringVar.getBytes());
			fout.write(65);
		} catch (IOException e) {
			System.err.println("Cannot write to the file(s)");
		}
		System.out.println("success...");
	}
}