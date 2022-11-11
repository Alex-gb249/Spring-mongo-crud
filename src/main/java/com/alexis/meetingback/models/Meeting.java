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
    private Long cost;
    private Long hours;
    private Status status;

    public Meeting(LocalDateTime date, Long cost, Long hours, Status status) {
        this.date = date;
        this.cost = cost;
        this.hours = hours;
        this.status = status;
    }
}
