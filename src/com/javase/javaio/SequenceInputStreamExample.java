package com.javase.javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import com.javase.FilesConstants;

public class SequenceInputStreamExample {

	public static void main(String args[]) {

		String fileName1 = FilesConstants.FILE_SEQUENCE_INPUT_STREAM_NAME + "1" + FilesConstants.FILE_EXTENSION;
		String fileName2 = FilesConstants.FILE_SEQUENCE_INPUT_STREAM_NAME + "2" + FilesConstants.FILE_EXTENSION;
		String fileName3 = FilesConstants.FILE_SEQUENCE_INPUT_STREAM_NAME + "3" + FilesConstants.FILE_EXTENSION;
		String fileName4 = FilesConstants.FILE_SEQUENCE_INPUT_STREAM_NAME + "4" + FilesConstants.FILE_EXTENSION;
		try (FileInputStream fin1 = new FileInputStream(fileName1);
			 FileInputStream fin2 = new FileInputStream(fileName2);
			 FileInputStream fin3 = new FileInputStream(fileName3);
			 FileInputStream fin4 = new FileInputStream(fileName4);) {

			Vector<FileInputStream> v = new Vector<>();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			v.add(fin4);
			Enumeration<FileInputStream> e = v.elements();
			try (SequenceInputStream sis = new SequenceInputStream(e);) {

				int i = 0;
				while ((i = sis.read()) != -1) {
					System.out.print((char) i);
				}
			}
		} catch (IOException e) {
			System.err.println("Cannot read from file(s)");
		}
	}
}