package org.ash.bank.service;

import org.ash.bank.entity.Worker;

import java.util.List;

/**
 * Created by user on 26.07.2017.
 */
public interface WorkerService {
    Worker addWorker(Worker worker);
    void delete(long id);
    Worker getByName(String name);
    Worker editClient(Worker worker);
    List<Worker> getAll();
}