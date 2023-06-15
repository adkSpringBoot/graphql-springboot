package com.graphql.poc.services.impl;

import com.graphql.poc.entities.Contact;
import com.graphql.poc.pojo.ContactPojo;
import com.graphql.poc.repositories.ContactRepo;
import com.graphql.poc.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Override
    public Contact create(ContactPojo contactPojo) {
        Contact contact = new Contact();
        contact.setName(contactPojo.getName());
        contact.setCity(contactPojo.getCity());
        contact.setState(contactPojo.getState());
        return contactRepo.save(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contactRepo.findAll();
    }

    @Override
    public Contact get(int contactId) {
        return contactRepo.findById(contactId).orElseThrow(()->new RuntimeException("Contact not available"));
    }

    @Override
    public Contact updateContact(Integer id, ContactPojo contactPojo) {
        Contact contact = contactRepo.getReferenceById(id);
        if (Objects.nonNull(contact) && Objects.nonNull(contactPojo)){
            contact.setName(contactPojo.getName());
            contact.setCity(contactPojo.getCity());
            contact.setState(contactPojo.getState());
            contactRepo.save(contact);
        }
        return contact;
    }

    @Override
    public Boolean deleteBook(Integer id) {

        Optional<Contact> contact = contactRepo.findById(id);
        if (contact.isPresent()){
            contactRepo.delete(contact.get());
            return true;
        }
        return false;
    }
}
