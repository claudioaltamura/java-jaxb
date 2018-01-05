package de.claudioaltamura.jaxb.example;

public class HelloWorldGenerationExample {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.make("Bonjour, madame", "fr");
		helloWorld.make("Hey, you", "en");
		helloWorld.marshal();
	}

}
