package edu.mum.cs.ormexample.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
public class Address {
    @Id//@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Street must has value")
    private String street;

    @NotEmpty(message = "Zip code  must has value")
    private String zipCode;
}