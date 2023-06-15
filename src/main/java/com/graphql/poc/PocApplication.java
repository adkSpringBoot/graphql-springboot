package com.graphql.poc;

import com.graphql.poc.entities.Contact;
import com.graphql.poc.pojo.ContactPojo;
import com.graphql.poc.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocApplication implements CommandLineRunner {

	@Autowired
	private ContactService contactService;

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ContactPojo contact = new ContactPojo();
		contact.setName("anu");
		contact.setCity("delhi");
		contact.setState("delhi");
		contactService.create(contact);
		ContactPojo contact1 = new ContactPojo();

		contact1.setName("aditya");
		contact1.setCity("patna");
		contact1.setState("bihar");
		contactService.create(contact1);
		ContactPojo contact2 = new ContactPojo();

		contact2.setName("Ravi");
		contact2.setCity("mumbai");
		contact2.setState("maharastra");
		contactService.create(contact2);
	}
}
