package com.nisum.nisumservicetest.nisum.repository;

import com.nisum.nisumservicetest.nisum.entity.DefaultConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DefaultConfigurationRepository extends CrudRepository<DefaultConfiguration, UUID> {

    Optional<DefaultConfiguration> findByName(String name);

}
