package com.exp.mybatis.model;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonData implements Serializable {
    private Long id;
    private String name;
    private String address;
}
