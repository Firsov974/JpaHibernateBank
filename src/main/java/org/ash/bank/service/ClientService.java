package org.ash.bank.service;

import org.ash.bank.entity.Client;

import java.util.List;

/**
 * Created by user on 26.07.2017.
 */
public interface ClientService {
    Client addClient(Client client);
    void delete(long id);
    Client getByName(String name);
    Client editClient(Client client);
    List<Client> getAll();
}