package com.exp.mybatis.mapper;

import com.exp.mybatis.model.PersonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {
    @Select("SELECT * FROM person WHERE id = #{id}")
    PersonData findById(long id);
}
