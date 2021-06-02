package com.javase.javaio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.javase.FilesConstants;

public class DataInputStreamExample {

	public static void main(String args[]) {

		try (InputStream is = new FileInputStream(FilesConstants.FILE_DATA_OUTPUT_STREAM_NAME);
			 DataInputStream dis = new DataInputStream(is);) {

			int count = is.available();
			byte[] ary = new byte[count];
			dis.read(ary);
			for (byte bt : ary) {
				char k = (char) bt;
				System.out.print(k + "-");
			}

		} catch (IOException e) {
			System.err.println("Cannot read file(s)");
		}
	}
}