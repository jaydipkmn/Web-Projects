package com.jaydip.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaydip.spring.dao.PersonDAO;
import com.jaydip.spring.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    @Transactional
    public void addPerson(Person p) {
       personDAO.addPerson(p);

    }
    @Transactional
    public List<Person> listPersons() {
       return personDAO.listPersons();
    }
    @Transactional
    public void updatePerson(Person P) {
        personDAO.updatePerson(P);
        
    }
    @Transactional
    public void removePerson(int id) {
        personDAO.removePerson(id);
        
    }
    @Transactional
    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }

}
