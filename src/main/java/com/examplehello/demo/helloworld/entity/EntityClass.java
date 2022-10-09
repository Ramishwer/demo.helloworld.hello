package com.examplehello.demo.helloworld.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "valuetable")
public class EntityClass {

  //  @Column(name="IndianDatetime")
    private String indianDatetime;

  //  @Column(name="AccountId")
    @Id
    private int accountId;

  //  @Column(name="AccountName")
    private String accountName;

  //  @Column(name="Accounttype")
    private String accounttype;

//    @Column(name="company_name")
//    private String companyName;
//
//    @Column(name="total_submitted")
//    private int totalSubmitted;
//
//    @Column(name="Total_delivered")
//    private int totalDelivered;
//
//    @Column(name="Onnet_submitted")
//    private int OnnetSubmitted;
//
//    @Column(name="Offnet_submitted")
//    private int OffnetSubmitted;
//
//    @Column(name="Onnet_delivered")
//    private int OnnetDelivered;
//
//    @Column(name="Offnet_delivered ")
//    private int OffnetDelivered;
//
//    @Column(name="Server_Id")
//    private String serverId;
//
//    @Column(name="PM")
//    private String pm;
//
//    @Column(name="GatewayId")
//    private int gatewayId ;


}
