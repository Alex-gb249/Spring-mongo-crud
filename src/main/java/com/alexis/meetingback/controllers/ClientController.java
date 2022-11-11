package com.alexis.meetingback.controllers;

import com.alexis.meetingback.models.Client;
import com.alexis.meetingback.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/client")
public class ClientController {

    private ClientService service;

    @GetMapping()
    public ResponseEntity<List<Client>> obtainAllClient() {
        return ResponseEntity.ok().body(service.obtainAllClient());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> obtainClientById(@PathVariable String id) {
        return new ResponseEntity<Optional<Client>>(service.obtainClientById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Client> saveClient(@RequestBody Client Client) {
        return new ResponseEntity<Client>(service.saveClient(Client), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteClient(@PathVariable String id) {
        return new ResponseEntity<Boolean>(service.deleteClient(id), HttpStatus.OK);
    }

}
