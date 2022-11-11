package com.alexis.meetingback.repositories;

import com.alexis.meetingback.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
