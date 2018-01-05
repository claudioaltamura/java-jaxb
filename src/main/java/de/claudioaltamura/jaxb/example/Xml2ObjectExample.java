package de.claudioaltamura.jaxb.example;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Xml2ObjectExample {

	public static void main(String[] args) {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			StringReader reader = new StringReader(
					"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
					"<customer id=\"100\">" +
					"<age>18</age>" +
					"<name>Customer</name>" +
					"</customer>");
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(reader);
			System.out.println(customer);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
