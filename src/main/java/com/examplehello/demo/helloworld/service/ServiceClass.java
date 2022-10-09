package com.examplehello.demo.helloworld.service;

import com.examplehello.demo.helloworld.entity.EntityClass;
import com.examplehello.demo.helloworld.repo.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {
    @Autowired
    RepositoryClass repositoryClass;

    public EntityClass createAllEntity(EntityClass entityClass) {
        return repositoryClass.save(entityClass);
    }

    public List<EntityClass> getEntityData() {

        return repositoryClass.findAll();
    }

    public int getEntitySum() {

        return repositoryClass.getSumAccountId();
    }

    public int getEntityAverage(){
        return repositoryClass.getAverageAccountId();
    }

    public int getEntitySumSpecific(){
        return repositoryClass.getSumSpecificAccountId("ram");
    }

    public List<EntityClass> getEntitySumSpecifichello(){
        return repositoryClass.getSumGroupAccountId();
    }
}
