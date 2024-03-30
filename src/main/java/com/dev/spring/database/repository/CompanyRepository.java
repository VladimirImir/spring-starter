package com.dev.spring.database.repository;

import com.dev.spring.bpp.Auditing;
import com.dev.spring.bpp.InjectBean;
import com.dev.spring.bpp.Transaction;
import com.dev.spring.database.entity.Company;
import com.dev.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company delete) {
        System.out.println("delete method...");
    }
}
