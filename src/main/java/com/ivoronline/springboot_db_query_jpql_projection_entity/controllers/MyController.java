package com.ivoronline.springboot_db_query_jpql_projection_entity.controllers;

import com.ivoronline.springboot_db_query_jpql_projection_entity.entities.Person;
import com.ivoronline.springboot_db_query_jpql_projection_entity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON
  //================================================================
  @RequestMapping("SelectPerson")
  Person selectPerson() {
    Person person = personRepository.selectPerson("John");
    return person;
  }

}
