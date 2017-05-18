package com.jaydip.spring.dao;

import java.util.List;

import com.jaydip.spring.model.Person;

public interface PersonDAO {

    public void addPerson(Person p);
    public List<Person> listPersons();
    public void updatePerson(Person P);
    public void removePerson(int id);
    public Person getPersonById(int id);
}
