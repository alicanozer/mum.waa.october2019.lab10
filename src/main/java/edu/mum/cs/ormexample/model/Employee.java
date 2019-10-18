package edu.mum.cs.ormexample.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name="emp")
@Table(name="emp")
@Setter
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "EMP_ID")
    private long id;

    //@Column(name = "F_NAME")
    @NotNull(message = "First Name must has value")
    private String firstName;

   // @Column(name = "L_NAME")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)//@JoinColumn(name="addr_id")
    @Valid
    private Address address;

}
