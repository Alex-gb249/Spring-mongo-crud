package com.alexis.meetingback.controllers;

import com.alexis.meetingback.models.Meeting;
import com.alexis.meetingback.services.MeetingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/meeting")
public class MeetingController {

    private MeetingService service;

    @GetMapping()
    public ResponseEntity<List<Meeting>> obtainAllMeeting() {
        return ResponseEntity.ok().body(service.obtainAllMeeting());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Meeting>> obtainMeetingById(@PathVariable String id) {
        return new ResponseEntity<Optional<Meeting>>(service.obtainMeetingById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Meeting> saveMeeting(@RequestBody Meeting Meeting) {
        return new ResponseEntity<Meeting>(service.saveMeeting(Meeting), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteMeeting(@PathVariable String id) {
        return new ResponseEntity<Boolean>(service.deleteMeeting(id), HttpStatus.OK);
    }

}
