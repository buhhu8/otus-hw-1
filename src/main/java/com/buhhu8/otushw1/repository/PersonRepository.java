package com.buhhu8.otushw1.repository;

import com.buhhu8.otushw1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository  extends JpaRepository<Person, UUID> {

}
