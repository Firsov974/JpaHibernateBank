package org.ash.bank.service.impl;

import org.ash.bank.entity.BankAccount;
import org.ash.bank.entity.Client;
import org.ash.bank.repository.BankAccountRepository;
import org.ash.bank.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 26.07.2017.
 */
public class BankAccountServiceImpl implements BankAccountService {


    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount addBankAccount(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    @Override
    public void delete(long id) {
        bankAccountRepository.delete(id);
    }

    @Override
    public BankAccount getByClient(Client client) {
        return bankAccountRepository.findByClient(client);
    }

    @Override
    public BankAccount editBankAcoount(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    @Override
    public List<BankAccount> getAll() {
        return bankAccountRepository.findAll();
    }
}

