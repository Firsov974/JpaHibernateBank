package org.ash.bank.service.impl;

import org.ash.bank.entity.Client;
import org.ash.bank.repository.ClientRepository;
import org.ash.bank.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 26.07.2017.
 */
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void delete(long id) {
        clientRepository.delete(id);
    }

    @Override
    public Client getByName(String name) {
        return clientRepository.findByName(name);
    }

    @Override
    public Client editClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}