package com.compass.taker.controller;

import com.compass.taker.model.Jails;
import com.compass.taker.services.JailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jails")
public class JailsController {

    @Autowired
    private JailsService jailsService;

    @GetMapping

    public List<Jails> obterTodos(){
        return this.jailsService.obterTodos();
    }

    public void criar(@RequestBody Object Jails){

    }





}
