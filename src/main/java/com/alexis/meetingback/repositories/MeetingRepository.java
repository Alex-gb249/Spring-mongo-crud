package com.alexis.meetingback.repositories;

import com.alexis.meetingback.models.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeetingRepository extends MongoRepository<Meeting, String> {
}
