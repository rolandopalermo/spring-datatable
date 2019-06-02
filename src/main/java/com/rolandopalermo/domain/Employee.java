/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.domain;

import com.rolandopalermo.util.EmployeeStatus;
import com.rolandopalermo.util.JsonConverter;
import java.io.Serializable;

/**
 *
 * @author rolan
 */
public class Employee implements Serializable {

    private int id;
    private String name;
    private String surname;
    private int age;
    private String address;
    private EmployeeStatus status;

    public Employee(int id, String name, String surname, int age, String address, EmployeeStatus status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String json = JsonConverter.INSTANCE.asJsonString(this);
        return json;
    }

}
