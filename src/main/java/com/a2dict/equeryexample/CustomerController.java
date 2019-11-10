package com.a2dict.equeryexample;

import com.a2dict.equery.EQuery;
import com.a2dict.equery.IPagedQuery;
import com.a2dict.equery.PageWrap;
import com.a2dict.equery.QReq;
import com.a2dict.equeryexample.entity.Customer;
import io.ebean.Database;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a2dict on 2019/11/10
 */
@RestController
public class CustomerController {

    private IPagedQuery<Customer> queryFunc;

    @Autowired
    public CustomerController(Database db) {
        queryFunc = EQuery.buildPagedQuery(db, Customer.class);
    }

    @RequestMapping("/customers")
    public PageWrap<Customer> query(QReq req) {
        return queryFunc.query(req);
    }
}
