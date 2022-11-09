package com.alexis.meetingback.models;

import com.alexis.meetingback.enumerations.Gender;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
public class Client {

    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private Integer phone;
    private Integer score;

    public Client(String firstName, String lastName, Gender gender, String email, Integer phone, Integer score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.score = score;
    }
}
