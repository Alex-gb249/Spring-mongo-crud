package com.alexis.meetingback.services;

import com.alexis.meetingback.models.Client;
import com.alexis.meetingback.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClientService {

    private ClientRepository repository;

    public List<Client> obtainAllClient() {
        return repository.findAll();
    }

    public Optional<Client> obtainClientById(String id) {
        return repository.findById(id);
    }

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public Boolean deleteClient(String id) {
        try {
            repository.deleteById(id);
            return Boolean.TRUE;
        } catch (Exception e) {
            System.out.println("Al eliminar Client: " + e);
            return Boolean.FALSE;
        }
    }
}
