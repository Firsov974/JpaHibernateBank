package org.ash.bank.repository;

import org.ash.bank.entity.BankAccount;
import org.ash.bank.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{

    @Query("select b from BankAccount b where b.client = :client")
    BankAccount findByClient(@Param("client") Client client);

}
