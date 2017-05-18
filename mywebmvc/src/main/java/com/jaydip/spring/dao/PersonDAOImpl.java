package com.jaydip.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jaydip.spring.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
    
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addPerson(Person p) {
        Session session =  this.sessionFactory.getCurrentSession();
        session.persist(p);
        System.out.println("person saved");
    }

    public List<Person> listPersons() {
        Session session =  this.sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        List<Person> personsList = session.createQuery("from Person").list();
        return personsList;
    }

    public void updatePerson(Person P) {
        Session session =  this.sessionFactory.getCurrentSession();
        session.update(P);
        
    }

    public void removePerson(int id) {
        Session session =  this.sessionFactory.getCurrentSession();
        Person person =  (Person) session.load(Person.class, new Integer(id));
        if(null != person){
            session.delete(person);
        }
        
    }

    public Person getPersonById(int id) {
        Session session =  this.sessionFactory.getCurrentSession();
        Person person =  (Person) session.getNamedQuery("GET_PERSON_BY_ID").setInteger("id", id).uniqueResult();
      //  Person person =  (Person) session.get(Person.class, new Integer(id));
        //System.out.println(person.getName());
        return person;
    }

}
