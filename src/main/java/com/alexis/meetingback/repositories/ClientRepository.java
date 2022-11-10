package com.alexis.meetingback.repositories;

import com.alexis.meetingback.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
