package com.tutorial.praneethpj.tutorial.payload;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Praneethpj
 */
@Entity
public class UserRequest {


    @Size(min=3,max = 40,message = "min of name should be 3 and max 40")
    private String name;

    @Size(max = 15)
    private String username;


    @Size(max = 40, message = "email characters should not be greater than 40")
    @Email
    private String email;

}
