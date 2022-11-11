package com.alexis.meetingback.services;

import com.alexis.meetingback.models.Meeting;
import com.alexis.meetingback.repositories.MeetingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MeetingService {

    private MeetingRepository repository;

    public List<Meeting> obtainAllMeeting() {
        return repository.findAll();
    }

    public Optional<Meeting> obtainMeetingById(String id) {
        return repository.findById(id);
    }

    public Meeting saveMeeting(Meeting Meeting) {
        return repository.save(Meeting);
    }

    public Boolean deleteMeeting(String id) {
        try {
            repository.deleteById(id);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Al eliminar Meeting: " + e);
            return Boolean.FALSE;
        }
    }
}
