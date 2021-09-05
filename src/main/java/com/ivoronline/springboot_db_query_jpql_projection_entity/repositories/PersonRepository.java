package com.ivoronline.springboot_db_query_jpql_projection_entity.repositories;

import com.ivoronline.springboot_db_query_jpql_projection_entity.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // SELECT PERSON
  //=======================================================================================
  @Query(value = "SELECT person FROM Person person WHERE person.name = :name")
  Person selectPerson(String name);

}
