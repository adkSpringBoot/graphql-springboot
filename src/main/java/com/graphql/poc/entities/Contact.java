package com.graphql.poc.entities;

import lombok.*;

import javax.persistence.*;
import java.nio.DoubleBuffer;


@Entity
@Table(name = "contact")
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;

    private String city;

    private String state;

}
