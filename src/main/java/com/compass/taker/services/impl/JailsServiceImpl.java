package com.compass.taker.services.impl;

import com.compass.taker.model.Jails;
import com.compass.taker.repository.JailsRepository;
import com.compass.taker.services.JailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JailsServiceImpl implements JailsService {

    @Autowired
    private JailsRepository jailsRepository;


    @Override
    public List<Jails> obterTodos() {
        return this.jailsRepository.findAll();
    }

    @Override
    public Jails criar(Jails jails) {
        return null;
    }
}
