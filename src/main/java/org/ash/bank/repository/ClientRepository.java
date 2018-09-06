package org.ash.bank.repository;

import org.ash.bank.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("select b from Client b where b.last_name = :name")
    Client findByName(@Param("name") String name);

}
