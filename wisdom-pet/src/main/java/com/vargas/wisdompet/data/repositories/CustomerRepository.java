package com.vargas.wisdompet.data.repositories;

import com.vargas.wisdompet.data.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

  CustomerEntity findByEmail(String email);

}
