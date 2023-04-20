package com.buhhu8.otushw1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}


//    CREATE TABLE public.person (
//        id int NOT NULL GENERATED ALWAYS AS IDENTITY,
//        user_name varchar NULL,
//        first_name varchar NULL,
//        last_name varchar NULL,
//        email varchar NULL,
//        phone varchar NULL,
//        CONSTRAINT person_pk PRIMARY KEY (id)
//        );
