package de.claudioaltamura.jaxb.book.example;

import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class BookExample {
	public static void main(String[] args) throws JAXBException {

		ArrayList<Book> bookList = new ArrayList<>();

		Book book1 = new Book();
		book1.setIsbn("12321321312");
		book1.setName("Book 1");
		book1.setAuthor("Peter Minu");
		book1.setPublisher("VA");
		bookList.add(book1);

		Book book2 = new Book();
		book2.setIsbn("34324324324");
		book2.setName("Book 2");
		book2.setAuthor("Dennis Ehr");
		book2.setPublisher("FZ");
		bookList.add(book2);

		Bookstore bookstore = new Bookstore();
		bookstore.setName("Bookstore");
		bookstore.setLocation("Hamburg");
		bookstore.setBookList(bookList);

		JAXBContext context = JAXBContext.newInstance(Bookstore.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		m.marshal(bookstore, System.out);
	}
}
