package com.raif.service;


import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность для пользователя.
 */
@Entity
@Table(name = "user")
public class User {


    @Column(name = "id")
    @NonNull
    Integer id;

    @Column(name = "name")
    String name;
}
