package com.alexis.meetingback.services;

import com.alexis.meetingback.models.Employee;
import com.alexis.meetingback.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public List<Employee> obtainAllEmployee() {
        return repository.findAll();
    }

    public Optional<Employee> obtainEmployeeById(String id) {
        return repository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Boolean deleteEmployee(String id) {
        try {
            repository.deleteById(id);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Al eliminar Employee: " + e);
            return Boolean.FALSE;
        }
    }
}
