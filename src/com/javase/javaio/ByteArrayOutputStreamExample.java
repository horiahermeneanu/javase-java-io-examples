package com.javase.javaio;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.javase.FilesConstants;

public class ByteArrayOutputStreamExample {

	public static void main(String args[]) {

		try (FileOutputStream fout1 = new FileOutputStream(FilesConstants.FILE_BYTE_ARRAY_OUTPUT_STREAM_NAME1);
			 FileOutputStream fout2 = new FileOutputStream(FilesConstants.FILE_BYTE_ARRAY_OUTPUT_STREAM_NAME2);
			 ByteArrayOutputStream bout = new ByteArrayOutputStream();) {

			String stringVar = "Java is awesome!";
			bout.write(stringVar.getBytes());

			bout.writeTo(fout1);
			bout.writeTo(fout2);

		} catch (IOException e) {
			System.err.println("Cannot write to the file(s)");
		}
		System.out.println("success...");
	}
}