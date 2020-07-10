package com.ucxmarket.todo.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
}
