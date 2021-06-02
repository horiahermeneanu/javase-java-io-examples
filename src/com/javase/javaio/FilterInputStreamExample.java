package com.javase.javaio;

import java.io.*;

import com.javase.FilesConstants;

public class FilterInputStreamExample {
	public static void main(String args[]) {
		File file = new File(FilesConstants.FILE_FILTER_OUTPUT_STREAM_NAME);
		try (FileInputStream fin = new FileInputStream(file);
			 FilterInputStream filter = new BufferedInputStream(fin);) {

			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.err.println("Cannot read from file(s)");
		}
	}
}