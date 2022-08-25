package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String empName;

    private String emailAddress;

    private long contactno;
    private String empPass;
}
