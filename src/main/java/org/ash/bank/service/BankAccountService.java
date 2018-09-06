package org.ash.bank.service;

import org.ash.bank.entity.BankAccount;
import org.ash.bank.entity.Client;

import java.util.List;

/**
 * Created by user on 26.07.2017.
 */
public interface BankAccountService {
    BankAccount addBankAccount(BankAccount bankAccount);
    void delete(long id);
    BankAccount getByClient(Client client);
    BankAccount editBankAcoount(BankAccount bankAccount);
    List<BankAccount> getAll();
}