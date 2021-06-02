package com.javase.javaio;

import java.io.FileInputStream;
import java.io.IOException;

import com.javase.FilesConstants;

public class FileInputStreamExample {

	public static void main(String args[]) {

		try (FileInputStream fin = new FileInputStream(FilesConstants.FILE_OUTPUT_STREAM_NAME);) {
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.err.println("Cannot read from file(s)");
		}
	}
}