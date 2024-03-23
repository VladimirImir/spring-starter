package com.dev.spring;

import com.dev.spring.database.pool.ConnectionPool;
import com.dev.spring.database.repository.CompanyRepository;
import com.dev.spring.database.repository.UserRepository;
import com.dev.spring.ioc.Container;
import com.dev.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {

        var container = new Container();


//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);
        
        var userService = container.get(UserService.class);
        // TODO: userService
    }
}
