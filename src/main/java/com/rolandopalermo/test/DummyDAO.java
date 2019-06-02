/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.test;

import com.rolandopalermo.domain.Employee;
import com.rolandopalermo.util.EmployeeStatus;
import com.rolandopalermo.util.ResponseList;

/**
 *
 * @author rolan
 */
public class DummyDAO {

    public static ResponseList<Employee> getAllEmployees() {
        ResponseList<Employee> list = new ResponseList<>();
        int id = 0;
        list.add(new Employee(++id, "Juan", "Perez", 10, "74 Green Street", EmployeeStatus.ACTIVE));
        list.add(new Employee(++id, "Rolando", "Rodriguez", 11, "74 Green Street", EmployeeStatus.DELETED));
        list.add(new Employee(++id, "Andrea", "Ortega", 12, "74 Green Street", EmployeeStatus.INACTIVE));
        list.add(new Employee(++id, "Miguel", "Rodriguez", 13, "74 Green Street", EmployeeStatus.PENDING));
        list.add(new Employee(++id, "Cecilia", "Valderrama", 14, "74 Green Street", EmployeeStatus.ACTIVE));
        list.add(new Employee(++id, "José", "Rodriguez", 15, "74 Green Street", EmployeeStatus.DELETED));
        list.add(new Employee(++id, "Karina", "Valderrama", 16, "74 Green Street", EmployeeStatus.INACTIVE));
        return list;
    }
}
