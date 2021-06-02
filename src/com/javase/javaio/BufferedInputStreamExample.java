package com.javase.javaio;

import java.io.*;

import com.javase.FilesConstants;

public class BufferedInputStreamExample {
	public static void main(String args[]) {

		try (FileInputStream fin = new FileInputStream(FilesConstants.FILE_BUFFERED_OUTPUT_STREAM_NAME);
			 BufferedInputStream bin = new BufferedInputStream(fin);) {

			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.err.println("Cannot read from file(s)");
		}
	}
}