package com.generalassembly.contacts;

import org.springframework.data.repository.CrudRepository;

import com.generalassembly.contacts.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
