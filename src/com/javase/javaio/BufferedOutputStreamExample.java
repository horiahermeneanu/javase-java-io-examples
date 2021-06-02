package com.javase.javaio;

import java.io.*;

import com.javase.FilesConstants;

public class BufferedOutputStreamExample {
	public static void main(String args[]) {
		try (FileOutputStream fout = new FileOutputStream(FilesConstants.FILE_BUFFERED_OUTPUT_STREAM_NAME);
			 BufferedOutputStream bout = new BufferedOutputStream(fout);) {

			String stringVar = "Java is awesome!";
			byte b[] = stringVar.getBytes();
			bout.write(b);
			bout.flush();
		} catch (IOException e) {
			System.err.println("Cannot write to the file(s)");
		}
		System.out.println("success...");
	}
}