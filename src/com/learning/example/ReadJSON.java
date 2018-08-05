package com.learning.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSON {

	public static void main(String[] args) {
		System.out.println(new ReadJSON().readFile());
	}

	public String readFile() {
		String myString = "";
		try {
			myString = new String(Files
					.readAllBytes(Paths.get(getClass().getClassLoader().getResource("test.json").toURI())));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		return myString;
	}
}
