package com.bmy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    //配置 呸
    private Long id;
    @Column(name = "name",length = 100,nullable = true)
    private String name;
    @Column(name = "age",length = 10,nullable = true)
    private int age;
}
