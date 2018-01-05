package de.claudioaltamura.jaxb.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.claudioaltamura.jaxb.generated.GreetingListType;
import de.claudioaltamura.jaxb.generated.GreetingType;
import de.claudioaltamura.jaxb.generated.ObjectFactory;

public class HelloWorld {

	private ObjectFactory of;
	private GreetingListType grList;

	public HelloWorld() {
		of = new ObjectFactory();
		grList = of.createGreetingListType();
	}

	public void make(String t, String l) {
		GreetingType g = of.createGreetingType();
		g.setText(t);
		g.setLanguage(l);
		grList.getGreeting().add(g);
	}

	public void marshal() {
		try {
			JAXBElement<GreetingListType> gl = of.createGreetings(grList);
			JAXBContext jc = JAXBContext
					.newInstance(de.claudioaltamura.jaxb.generated.ObjectFactory.class.getPackage().getName());
			Marshaller m = jc.createMarshaller();
			m.marshal(gl, System.out);
		} catch (JAXBException jbe) {
			System.err.println(jbe);
		}
	}
}
