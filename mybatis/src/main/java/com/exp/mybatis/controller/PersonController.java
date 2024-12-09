package com.exp.mybatis.controller;

import com.exp.mybatis.model.PersonData;
import com.exp.mybatis.model.PersonRequest;
import com.exp.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    private String hello = "Hello World";

    @Autowired
    private PersonService personService;

    @GetMapping("/personXml/{id}")
    public PersonData getPersonXmlById(@PathVariable("id") Long id) {
        return personService.findByIdXml(id);
    }

    @PostMapping("/personXml")
    public PersonData createPerson(@RequestBody PersonRequest personRequest) {
        return personService.createPersonXml(personRequest);
    }
}
