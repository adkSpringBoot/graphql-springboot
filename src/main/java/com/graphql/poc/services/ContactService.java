package com.graphql.poc.services;

import com.graphql.poc.entities.Contact;
import com.graphql.poc.pojo.ContactPojo;
import com.graphql.poc.repositories.ContactRepo;

import java.util.List;

public interface ContactService {


    Contact create(ContactPojo contact);

    List<Contact> getAll();

    Contact get(int contactId);
    public Contact updateContact(Integer id, ContactPojo contactPojo);

    public Boolean deleteBook(Integer id);


    }
