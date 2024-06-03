package com.dev.spring.database.repository;

import com.dev.spring.database.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import java.util.Optional;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

    Optional<Company> findById(Integer id);

    void delete(Company entity);

}