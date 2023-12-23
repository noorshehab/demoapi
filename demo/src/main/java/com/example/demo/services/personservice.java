package com.example.demo.services;

import com.example.demo.models.person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class personservice {
    ArrayList<person> people=new ArrayList<>();
    public person addperson(String firstName, String lastName, int age,String gender){
        person p= new person(firstName, lastName, age, gender);
        people.add(p);
        return p;
    }
    public person getperson(String firstname,String lastname){
        for(person p:people){
            if(p.getFirstName()==firstname&&p.getLastName()==lastname){
                return p;
            }
        }
        return null;
    }
    public List<person> allpeople(){
        return people;
    }
    public person updateperson(String firstname,String lastname,int age,String newname){
        person tochange=getperson(firstname, lastname);
        tochange.setAge(age);
        tochange.setFirstName(newname);
        return tochange;
    }
    public List<person>deleteperson(String firstname,String lastname){
        person toberidOf=getperson(firstname, lastname);
        people.remove(toberidOf);
        return people;
    }
}
