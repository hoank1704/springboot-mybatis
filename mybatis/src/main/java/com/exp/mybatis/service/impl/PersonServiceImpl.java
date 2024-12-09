package com.exp.mybatis.service.impl;

import com.exp.mybatis.mapper.PersonMapper;
import com.exp.mybatis.mapper.PersonMapperXml;
import com.exp.mybatis.model.PersonData;
import com.exp.mybatis.model.PersonRequest;
import com.exp.mybatis.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

//    private PersonRepository personRepository;

    private final PersonMapper personMapper;

    private final PersonMapperXml personMapperXml;

    @Override
    public PersonData findByIdXml(Long id) {
        return personMapperXml.findPersonById(id);
    }

    @Override
    public PersonData createPersonXml(PersonRequest personRequest) {
        personMapperXml.createPerson(personRequest);

        Long generatedId = personRequest.getId();

        PersonData personData = new PersonData();
        personData.setId(generatedId);
        personData.setName(personRequest.getName());
        personData.setAddress(personRequest.getAddress());
        return personData;
    }

    @Override
    public PersonData findById(Long id) {
        return personMapper.findById(id);
    }
}
