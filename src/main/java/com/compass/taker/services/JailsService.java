package com.compass.taker.services;


import com.compass.taker.model.Jails;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JailsService {

    public List<Jails> obterTodos();
    public Jails criar(Jails jails);

}
