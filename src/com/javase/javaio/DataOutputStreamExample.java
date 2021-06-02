package com.javase.javaio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.javase.FilesConstants;

public class DataOutputStreamExample {

	public static void main(String args[]) {

		try (FileOutputStream fout = new FileOutputStream(FilesConstants.FILE_DATA_OUTPUT_STREAM_NAME);
				DataOutputStream dos = new DataOutputStream(fout);) {
			dos.writeInt(65);
			dos.flush();
		} catch (IOException e) {
			System.err.println("Cannot write to the file(s)");
		}
		System.out.println("success...");
	}
}