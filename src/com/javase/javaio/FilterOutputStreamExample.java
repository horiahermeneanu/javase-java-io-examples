package com.javase.javaio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import com.javase.FilesConstants;

public class FilterOutputStreamExample {

	public static void main(String args[]) {
		File file = new File(FilesConstants.FILE_FILTER_OUTPUT_STREAM_NAME);
		try (FileOutputStream fout = new FileOutputStream(file);
				FilterOutputStream filter = new FilterOutputStream(fout);) {

			String stringVar = "Java is awesome!";
			byte b[] = stringVar.getBytes();
			filter.write(b);
			filter.flush();
		} catch (IOException e) {
			System.err.println("Cannot write to the file(s)");
		}
		System.out.println("success...");
	}
}