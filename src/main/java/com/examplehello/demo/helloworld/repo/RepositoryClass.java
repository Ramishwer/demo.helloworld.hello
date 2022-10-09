package com.examplehello.demo.helloworld.repo;


import com.examplehello.demo.helloworld.entity.EntityClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositoryClass extends JpaRepository<EntityClass,Integer> {

    @Query(value = "select count(account_id) from valuetable",nativeQuery = true)
     int getSumAccountId();

    @Query(value = "select avg(account_id) from valuetable ",nativeQuery = true)
     int getAverageAccountId();


    @Query(value = "select sum(account_id) from valuetable where account_name = :account_name",nativeQuery = true)
    int getSumSpecificAccountId(@Param("account_name") String name);


  // @Query("select COUNT(account_id),a.account_name from valuetable v group by a.account_name")
   @Query(value = "select count(account_id),account_name from valuetable  group by account_name",nativeQuery = true)
   List<EntityClass> getSumGroupAccountId();




}
