package com.rest.Rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;


@Table(name="table")
@Entity
public class Task {
    @Id
    private UUID id;
    private String name;



}
