package com.example.demo.controllers;

import com.example.demo.models.person;
import com.example.demo.services.personservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demoapi")
public class personcontroller {
    @Autowired
    personservice service;
    @GetMapping("/people/search/{firstname}{lastname}")
    public person getPerson(@PathVariable("firstname")String firstname,@PathVariable("lastname")String lastname){
        return service.getperson(firstname, lastname);
    }
    @PostMapping("/people/add")
    public person addPerson(@RequestBody person newp){
        service.addperson(newp.getFirstName(), newp.getLastName(), newp.getAge(), newp.getGender());
        return newp;
    }
    @GetMapping("/people/getall")
    public List<person> GetAll(){
        return service.allpeople();
    }
    @PutMapping("/people/update/{firstname}{lastname}")
    public person Update(@RequestBody person upp,@PathVariable("firstname")String firstname,@PathVariable("lastname")String lastname){
        return service.updateperson(firstname,lastname,upp.getAge(), upp.getFirstName());
    }
    @DeleteMapping("/people/delete/{firstname}{lastname}")
    public List<person> delete(@PathVariable("firstname") String f,@PathVariable("lastname") String l){
        return service.deleteperson(f,l);

    }}
