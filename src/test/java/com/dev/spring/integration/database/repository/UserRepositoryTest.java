package com.dev.spring.integration.database.repository;

import com.dev.spring.database.repository.UserRepository;
import com.dev.spring.integration.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@IT
@RequiredArgsConstructor
class UserRepositoryTest {

    private final UserRepository userRepository;

    @Test
    void checkQuery() {
        var users = userRepository.findAllBy("a", "ov");
        Assertions.assertThat(users).hasSize(3);
    }
}