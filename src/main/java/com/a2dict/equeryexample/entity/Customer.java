package com.a2dict.equeryexample.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created by a2dict on 2019/11/10
 */
@Data
@Accessors(chain = true)
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String phone;
}
