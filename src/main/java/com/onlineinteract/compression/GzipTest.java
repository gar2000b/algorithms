package com.onlineinteract.compression;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipTest {

	private static final String COMPRESS_TEXT = "some text goes in here some text goes in here some text goes in here some text goes in here ";
/*			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here some text goes in here "
			+ "some text goes in here ";*/

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		GZIPOutputStream gzipOut = new GZIPOutputStream(baos);
		ObjectOutputStream objectOut = new ObjectOutputStream(gzipOut);

		objectOut.writeObject(COMPRESS_TEXT);
		objectOut.close();

		byte[] compressedTextArray = baos.toByteArray();

		System.out.println("GzipTest complete");

		byte[] textArray = COMPRESS_TEXT.getBytes();
		for (int i = 0; i < textArray.length; i++) {
			System.out.println(Character.valueOf((char) textArray[i]));
		}

		System.out.println();

		for (int i = 0; i < compressedTextArray.length; i++) {
			System.out.println(Character.valueOf((char) compressedTextArray[i]));
		}
		
		System.out.println();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(compressedTextArray);
		GZIPInputStream gzipIn = new GZIPInputStream(bais);
		ObjectInputStream objectIn = new ObjectInputStream(gzipIn);
		String uncompressedText = (String) objectIn.readObject();
		objectIn.close();
		
		byte[] text2Array = uncompressedText.getBytes();
		for (int i = 0; i < text2Array.length; i++) {
			System.out.println(Character.valueOf((char) text2Array[i]));
		}
		
		System.out.println();

		System.out.println("Length of original text array: " + textArray.length);
		System.out.println("Length of compressed text array: " + compressedTextArray.length);
		System.out.println("Length of uncompressed text array: " + text2Array.length);
	}
}
