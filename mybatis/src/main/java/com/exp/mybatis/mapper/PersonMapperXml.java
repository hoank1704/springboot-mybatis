package com.exp.mybatis.mapper;

import com.exp.mybatis.model.PersonData;
import com.exp.mybatis.model.PersonRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapperXml {
    PersonData findPersonById(Long id);

    int createPerson(PersonRequest personRequest);
}
