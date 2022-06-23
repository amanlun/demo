package com.lun.bito.api.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "members")
public class Member {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer poNo;

    private String memberName;

    private Integer vendorNo;

    private String shippingAddress;

    private String description;
}
