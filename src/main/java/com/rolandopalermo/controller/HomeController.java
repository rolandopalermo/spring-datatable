/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.controller;

import com.rolandopalermo.domain.Employee;
import com.rolandopalermo.test.DummyDAO;
import com.rolandopalermo.util.ResponseList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author rolan
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = {"/get-all-employees"}, method = RequestMethod.POST)
    @CrossOrigin(origins = "*", allowCredentials = "true")
    @ResponseBody
    public String getAllEmployees(HttpServletRequest request, HttpServletResponse response) {
        String json;
        try {
            ResponseList<Employee> lstInvoices = DummyDAO.getAllEmployees();
            json = lstInvoices.toString();
        } catch (Exception e) {
            json = "{\"error\" : true, \"message\": \"" + e.getMessage() + ".\"}";
        }
        return json;
    }
}
