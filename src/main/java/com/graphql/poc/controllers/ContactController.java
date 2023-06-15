package com.graphql.poc.controllers;

import com.graphql.poc.entities.Contact;
import com.graphql.poc.pojo.ContactPojo;
import com.graphql.poc.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;



@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @MutationMapping("createContact")
    public Contact create(@Argument ContactPojo contactPojo){
        return contactService.create(contactPojo);
    }

    @QueryMapping("getContact")
    public Contact getContact(@Argument int bookId){
        return contactService.get(bookId);
    }

    @MutationMapping("updateContact")
    public Contact updateContact(@Argument Integer id, @Argument ContactPojo contact) {
        return contactService.updateContact(id,contact);
    }

    @MutationMapping
    public Boolean deleteContact(@Argument Integer id) {
        return contactService.deleteBook(id);
    }

}
