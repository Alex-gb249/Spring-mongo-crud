package com.alexis.meetingback.controllers;

import com.alexis.meetingback.models.Employee;
import com.alexis.meetingback.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private EmployeeService service;

    @GetMapping()
    public ResponseEntity<List<Employee>> obtainAllEmployee() {
        return ResponseEntity.ok().body(service.obtainAllEmployee());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> obtainEmployeeById(@PathVariable String id) {
        return new ResponseEntity<Optional<Employee>>(service.obtainEmployeeById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(service.saveEmployee(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable String id) {
        return new ResponseEntity<Boolean>(service.deleteEmployee(id), HttpStatus.OK);
    }
}
