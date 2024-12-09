package com.exp.mybatis.service;

import com.exp.mybatis.model.PersonData;
import com.exp.mybatis.model.PersonRequest;

public interface PersonService {

    // use file xml
    PersonData findByIdXml(Long id);
    PersonData createPersonXml(PersonRequest personRequest);

    // user sql
    PersonData findById(Long id);
}
