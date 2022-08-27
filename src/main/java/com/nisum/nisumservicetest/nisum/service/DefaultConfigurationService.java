package com.nisum.nisumservicetest.nisum.service;


import com.nisum.nisumservicetest.nisum.entity.DefaultConfiguration;

public interface DefaultConfigurationService {

    DefaultConfiguration getDefaultConfigurationByName(String name);

}
