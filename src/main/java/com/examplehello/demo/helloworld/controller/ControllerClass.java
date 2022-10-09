package com.examplehello.demo.helloworld.controller;

import com.examplehello.demo.helloworld.entity.EntityClass;
import com.examplehello.demo.helloworld.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerClass {
    @Autowired
    ServiceClass serviceClass;



    @GetMapping("/getAllEntityClass")
    public List<EntityClass> getAllEntityClass(){

        return serviceClass.getEntityData();
    }


    @GetMapping("/sum")
    public int getAllSelectedEntityClass(){

        return serviceClass.getEntitySum();
    }

    @GetMapping("/average")
    public int getAllAverageEntityClass(){

        return serviceClass.getEntityAverage();
    }

    @GetMapping("/sum/{name}")
    public int getAllAverageEntityClassId(){

        return serviceClass.getEntitySumSpecific();
    }


    @GetMapping("/getAllGroupBy")
    public List<EntityClass> getAllGroupBy(){

        return serviceClass.getEntitySumSpecifichello();
    }

    @PostMapping("/addAllEntityClass")
    public String addAllEntityClass( @RequestBody EntityClass entityClass) {
        serviceClass.createAllEntity(entityClass);
        return "Saved";

    }
}
