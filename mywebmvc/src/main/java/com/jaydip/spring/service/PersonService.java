package com.jaydip.spring.service;

import java.util.List;

import com.jaydip.spring.model.Person;

public interface PersonService {

    public void addPerson(Person p);
    public List<Person> listPersons();
    public void updatePerson(Person P);
    public void removePerson(int id);
    public Person getPersonById(int id);
}
