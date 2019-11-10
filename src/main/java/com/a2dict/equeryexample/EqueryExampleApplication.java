package com.a2dict.equeryexample;

import com.a2dict.equeryexample.entity.Customer;
import io.ebean.DB;
import io.ebean.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EqueryExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EqueryExampleApplication.class, args);
    }

    @Autowired
    public void initCustomers(Database db){
        db.save(new Customer().setId(1L).setName("Carl").setCity("shenzhen").setPhone("010"));
        db.save(new Customer().setId(2L).setName("Gary").setCity("ShenZhen").setPhone("011"));
        db.save(new Customer().setId(3L).setName("Bob").setCity("guangzhou").setPhone("012"));
        db.save(new Customer().setId(4L).setName("Job").setCity("guangzhou").setPhone("013"));
        db.save(new Customer().setId(5L).setName("Gate").setCity("guangzhou").setPhone("014"));
    }

}
