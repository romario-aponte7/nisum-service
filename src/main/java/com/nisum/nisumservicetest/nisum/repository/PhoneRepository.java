package com.nisum.nisumservicetest.nisum.repository;

import com.nisum.nisumservicetest.nisum.entity.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PhoneRepository  extends CrudRepository<Phone, UUID> {

    Optional<Phone> findByNumber(String number);

}