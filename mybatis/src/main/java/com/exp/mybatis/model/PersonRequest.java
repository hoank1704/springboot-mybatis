package com.exp.mybatis.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequest {
    private Long id;
    private String name;
    private String address;
}
