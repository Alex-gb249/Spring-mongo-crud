package com.alexis.meetingback.models;

import com.alexis.meetingback.enumerations.Status;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
@Document
public class Meeting {

    @MongoId
    private String id;
    private LocalDateTime date;
    private Integer cost;
    private Integer hours;
    private Status status;

    public Meeting(LocalDateTime date, Integer cost, Integer hours, Status status) {
        this.date = date;
        this.cost = cost;
        this.hours = hours;
        this.status = status;
    }
}
