package com.example.mscoinconfig.service;

import com.example.mscoinconfig.model.CoinConfiguration;

import java.util.List;

public interface CoinConfigurationService {
    List<CoinConfiguration> findAll();
    CoinConfiguration findbyId(String id);
    CoinConfiguration save(CoinConfiguration coinConfiguration);
    CoinConfiguration update(CoinConfiguration coinConfiguration);
    void delete(String id);
}
