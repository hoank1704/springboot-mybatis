package com.exp.mybatis.repository;

import com.exp.mybatis.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PersonRepository extends JpaRepository<Person, Integer> {
}
