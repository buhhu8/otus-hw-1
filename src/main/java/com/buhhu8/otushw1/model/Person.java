package com.buhhu8.otushw1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}

