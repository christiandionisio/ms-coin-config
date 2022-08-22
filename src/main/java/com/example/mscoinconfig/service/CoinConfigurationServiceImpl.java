package com.example.mscoinconfig.service;

import com.example.mscoinconfig.model.CoinConfiguration;
import com.example.mscoinconfig.repository.CoinConfiguratioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoinConfigurationServiceImpl implements CoinConfigurationService {

    @Autowired
    private CoinConfiguratioRepo repo;

    @Override
    public List<CoinConfiguration> findAll() {
        List<CoinConfiguration> coinConfigurationList = new ArrayList<>();
        repo.findAll().forEach(coinConfigurationList::add);
        return coinConfigurationList;
    }

    @Override
    public CoinConfiguration findbyId(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public CoinConfiguration save(CoinConfiguration coinConfiguration) {
        return repo.save(coinConfiguration);
    }

    @Override
    public CoinConfiguration update(CoinConfiguration coinConfiguration) {
        return repo.save(coinConfiguration);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
