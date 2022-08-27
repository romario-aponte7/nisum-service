package com.nisum.nisumservicetest.nisum.service.impl;


import com.nisum.nisumservicetest.nisum.entity.DefaultConfiguration;
import com.nisum.nisumservicetest.nisum.exception.ValidationException;
import com.nisum.nisumservicetest.nisum.repository.DefaultConfigurationRepository;
import com.nisum.nisumservicetest.nisum.service.DefaultConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DefaultConfigurationServiceImpl implements DefaultConfigurationService {
    @Autowired
    private DefaultConfigurationRepository defaultConfigurationRepository;

    @Override
    public DefaultConfiguration getDefaultConfigurationByName(String name) {
        Optional<DefaultConfiguration> defaultConfiguration = defaultConfigurationRepository.findByName(name);
        if (defaultConfiguration.isEmpty()) {
            throw new ValidationException("Debe crear la configuración para " + name);
        }
        return defaultConfiguration.get();
    }
}
