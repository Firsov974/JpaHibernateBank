package org.ash.bank.service.impl;

import org.ash.bank.entity.Worker;
import org.ash.bank.repository.WorkerRepository;
import org.ash.bank.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 26.07.2017.
 */
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public Worker addWorker(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public void delete(long id) {
        workerRepository.delete(id);
    }

    @Override
    public Worker getByName(String name) {
        return workerRepository.findByName(name);
    }

    @Override
    public Worker editClient(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public List<Worker> getAll() {
        return workerRepository.findAll();
    }
}