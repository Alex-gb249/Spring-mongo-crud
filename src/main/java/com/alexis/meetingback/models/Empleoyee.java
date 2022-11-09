package com.alexis.meetingback.models;

import com.alexis.meetingback.enumerations.Gender;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
public class Empleoyee {

    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private Integer phone;
    // private Type type; Para después


    public Empleoyee(String firstName, String lastName, Gender gender, String email, Integer phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
}
